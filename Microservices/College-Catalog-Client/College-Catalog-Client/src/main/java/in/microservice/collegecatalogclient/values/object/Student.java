package in.microservice.collegecatalogclient.values.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {
	
	private long student_rollno;
	private String student_name;
	private String student_gender;
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
	
	

}
