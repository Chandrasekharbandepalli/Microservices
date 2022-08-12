package in.microservice.collegecatalogclient;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import in.microservice.collegecatalogclient.entity.College;
import in.microservice.collegecatalogclient.repository.CollegeRepository;
import in.microservice.collegecatalogclient.service.CollegeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class CollegeServiceApplicationTests {
	
	@Autowired
	private CollegeService service;

	@MockBean
	private CollegeRepository collegeRepo;
	
	@Test
	public void getCollegeTest() {
		when(collegeRepo.findAll()).thenReturn(Stream
				.of(new College(10,"Anand College",20), new College(11,"Haseen College",2)).collect(Collectors.toList()));
		assertEquals(2,service.retrieveAllCollege().size());
	   
	
	}
	
	@Test
	public void addCollegeTest() {
		College college = new College(10,"Ravindra College",30);
		when(collegeRepo.save(college)).thenReturn(college);
		assertEquals(college,service.addCollege(college));
		
	}
}