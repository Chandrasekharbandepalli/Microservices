package in.microservice.studentcatalogclient.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.microservice.studentcatalogclient.entity.Student;
import in.microservice.studentcatalogclient.repository.StudentRepository;
import in.microservice.studentcatalogclient.service.StudentService;
import in.microservice.studentcatalogclient.values.object.College;
import in.microservice.studentcatalogclient.values.object.ResponseTemplate;

@Component
public class StudentServiceImplementation implements StudentService {

	@Autowired
	private StudentRepository studentReposit;
	
	@Autowired
	private RestTemplate restTemplate;

	

	@Override
	public Student addStudent(Student student) {
		
		return studentReposit.save(student);
	}

	@Override
	public List<Student> retrieveAllStudents() {
		
		return studentReposit.findAll();
	}
	
	@Override
	public Student searchById(long student_rollno) {
		return studentReposit.findById(student_rollno);
	}

	@Override
	public ResponseTemplate studentAlongCollege(long student_rollno) {
		ResponseTemplate restTemp = new ResponseTemplate();
		Student stud = studentReposit.findById(student_rollno);
		
		long college_id = stud.getCollege_id();
		College collg = restTemplate.getForObject("http://COLLEGE-SERVICE/college/"+college_id, College.class);
		restTemp.setCollege(collg);
		restTemp.setStudent(stud);
		return restTemp;
	}

	@Override
	public Student updateCollege(long student_rollno, long college_id) {
		Student studs = studentReposit.findById(student_rollno);
		College collg = restTemplate.getForObject("http://COLLEGE-SERVICE/college/"+college_id, College.class);
		studs.setCollege_id(college_id);
		studentReposit.save(studs);
		return studs;
	}
	
	@Override
	public List<Student> retrieveStudentByCollegeIdAsc(long college_id) {
		
		return studentReposit.retrieveStudentByCollegeIdAsc(college_id);
	}

	

	@Override
	public List<Student> retrieveStudentByStreamDesc(String student_stream) {
		
		return studentReposit.retrieveStudentByStreamDesc(student_stream);
	}

	
}
