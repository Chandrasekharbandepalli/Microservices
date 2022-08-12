package in.microservice.studentcatalogclient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long student_rollno;
	private String student_name;
	private String student_gender;
	private String student_stream;
	private int student_age;
	private long college_id;
	public long getStudent_rollno() {
		return student_rollno;
	}
	public void setStudent_rollno(long student_rollno) {
		this.student_rollno = student_rollno;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_stream() {
		return student_stream;
	}
	public void setStudent_stream(String student_stream) {
		this.student_stream = student_stream;
	}
	public int getStudent_age() {
		return student_age;
	}
	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}
	public long getCollege_id() {
		return college_id;
	}
	public void setCollege_id(long college_id) {
		this.college_id = college_id;
	}
	public Student(long student_rollno, String student_name, String student_gender, String student_stream,
			int student_age, long college_id) {
		super();
		this.student_rollno = student_rollno;
		this.student_name = student_name;
		this.student_gender = student_gender;
		this.student_stream = student_stream;
		this.student_age = student_age;
		this.college_id = college_id;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [student_rollno=" + student_rollno + ", student_name=" + student_name + ", student_gender="
				+ student_gender + ", student_stream=" + student_stream + ", student_age=" + student_age
				+ ", college_id=" + college_id + "]";
	}
	
	
}
	