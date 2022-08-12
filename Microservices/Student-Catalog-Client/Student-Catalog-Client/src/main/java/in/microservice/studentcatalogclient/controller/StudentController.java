package in.microservice.studentcatalogclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.microservice.studentcatalogclient.entity.Student;
import in.microservice.studentcatalogclient.service.StudentService;
import in.microservice.studentcatalogclient.values.object.ResponseTemplate;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentServ;
	
	

	@PostMapping("student/add-student")
	public Student addStudent(@RequestBody Student student)
	{
		return studentServ.addStudent(student);
	}
	
	@GetMapping("student/retrieve-all-students")
	public List<Student> retrieveAllStudents(){
		return studentServ.retrieveAllStudents();
	}
	
	@GetMapping("student/{student_id}")
	public ResponseTemplate studentAlongCollege(@PathVariable long student_rollno)
	{
		return studentServ.studentAlongCollege(student_rollno);
	}
	
	@PutMapping("student/{student_rollno}/{college_id}")
	public String updateCollege(@PathVariable long student_rollno,@PathVariable long college_id)
	{
		Student stud = studentServ.updateCollege(student_rollno,college_id);
		if(stud!=null)
		{
			return stud.toString();
		}
			
		
		return null;
	}
	
	@GetMapping("student/student-name-in-ascOrder/{college_id}")
	public List<Student> retrieveStudentByCollegeIdAsc(@PathVariable long college_id)
	{
		return studentServ.retrieveStudentByCollegeIdAsc(college_id);
	}
	
	
	@GetMapping("student/retrieve/student-age-in-descOrder/{student_stream}")
	public List<Student> retrieveStudentByStreamDesc(@PathVariable String student_stream)
	{
		return studentServ.retrieveStudentByStreamDesc(student_stream);
	}
}


