package in.microservice.studentcatalogclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.microservice.studentcatalogclient.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findById(long id);

	@Query(value="SELECT * FROM student WHERE college_id=:college_id ORDER BY student_name ASC", nativeQuery = true)
	List<Student> retrieveStudentByCollegeIdAsc(@Param("college_id") long college_id);
	
	
	@Query(value="SELECT * FROM student where student_stream=:student_stream ORDER BY student_age DESC", nativeQuery = true)
	List<Student> retrieveStudentByStreamDesc(String student_stream);

}
