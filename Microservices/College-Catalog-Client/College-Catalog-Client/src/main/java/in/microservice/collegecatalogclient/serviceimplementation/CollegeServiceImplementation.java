package in.microservice.collegecatalogclient.serviceimplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.microservice.collegecatalogclient.entity.College;
import in.microservice.collegecatalogclient.repository.CollegeRepository;
import in.microservice.collegecatalogclient.service.CollegeService;
import in.microservice.collegecatalogclient.values.object.RequestTemplate;
import in.microservice.collegecatalogclient.values.object.Student;

@Component
public class CollegeServiceImplementation implements CollegeService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CollegeRepository collegeReposit;
	
	

	@Override
	public College addCollege(College college) {
		
		return collegeReposit.save(college);
	}

	@Override
	public List<College> retrieveAllCollege() {
		
		return collegeReposit.findAll();
	}


	@Override
	public College findById(long college_id) {
		
	    return collegeReposit.findById(college_id);
	}

	@Override
	public List<RequestTemplate> retrievecollegestudents() {
		List<RequestTemplate> details = new ArrayList<RequestTemplate>();
		List<College> colleges = this.retrieveAllCollege();
		Iterator<College> iterate = colleges.iterator();
		while(iterate.hasNext())
		{
			College collg = iterate.next();
			ResponseEntity<Student[]> responseEntity =
					  restTemplate.getForEntity(
							  "http://STUDENT-SERVICE/student/student-name-in-ascOrder/"+collg.getCollege_id(),
					  Student[].class);
			Student[] stud = responseEntity.getBody();
			List<Student> students = Arrays.asList(stud);
 			RequestTemplate requestTemp = new RequestTemplate();
 			requestTemp.setCollege(collg);
 			requestTemp.setStudentList(students);
			details.add(requestTemp);
		}
		return details;
	}

	

	
	
	
	
	
	
}