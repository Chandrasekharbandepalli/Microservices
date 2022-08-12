package in.microservice.collegecatalogclient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long college_id;
	private String college_name;
	private int college_totalStudents;
	public long getCollege_id() {
		return college_id;
	}
	public void setCollege_id(long college_id) {
		this.college_id = college_id;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public int getCollege_totalStudents() {
		return college_totalStudents;
	}
	public void setCollege_totalStudents(int college_totalStudents) {
		this.college_totalStudents = college_totalStudents;
	}
	public College(long college_id, String college_name, int college_totalStudents) {
		super();
		this.college_id = college_id;
		this.college_name = college_name;
		this.college_totalStudents = college_totalStudents;
	}
	public College() {
		super();
	}
	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", college_name=" + college_name + ", college_totalStudents="
				+ college_totalStudents + "]";
	}
	
}
	