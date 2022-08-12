package in.microservice.collegecatalogclient.values.object;

import java.util.ArrayList;
import java.util.List;

import in.microservice.collegecatalogclient.entity.College;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestTemplate {

	private College college;
	private List<Student> studentList = new ArrayList<Student>();
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
}
	