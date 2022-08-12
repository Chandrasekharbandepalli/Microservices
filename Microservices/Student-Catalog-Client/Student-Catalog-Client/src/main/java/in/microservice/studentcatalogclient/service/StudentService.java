package in.microservice.studentcatalogclient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.microservice.studentcatalogclient.entity.Student;
import in.microservice.studentcatalogclient.values.object.ResponseTemplate;

@Service
public interface StudentService {

	Student addStudent(Student student);

	List<Student> retrieveAllStudents();

	ResponseTemplate studentAlongCollege(long student_rollno);

	Student updateCollege(long student_rollno, long college_id);

	

	List<Student> retrieveStudentByCollegeIdAsc(long college_id);

	

	Student searchById(long student_rollno);

	List<Student> retrieveStudentByStreamDesc(String student_stream);

}
