package in.microservice.studentcatalogclient.values.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class College {
	
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
	

}
