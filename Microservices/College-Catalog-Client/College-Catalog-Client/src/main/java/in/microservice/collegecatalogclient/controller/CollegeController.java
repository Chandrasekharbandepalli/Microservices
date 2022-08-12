package in.microservice.collegecatalogclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.microservice.collegecatalogclient.entity.College;
import in.microservice.collegecatalogclient.service.CollegeService;
import in.microservice.collegecatalogclient.values.object.RequestTemplate;

@RestController
public class CollegeController {
	
	@Autowired
	CollegeService collegeServ;
	
	

	@PostMapping("college/add-college")
	public College addCollege(@RequestBody College college)
	{
		return collegeServ.addCollege(college);
	}
	
	@GetMapping("college/retrieveAll")
	public List<College> retrieveAllCollege()
	{
		return collegeServ.retrieveAllCollege();
	}
	
	@GetMapping("college/{college_id}")
	public College findById(@PathVariable long college_id)
	{
		return collegeServ.findById(college_id);
	}
	
	@GetMapping("college/retrieve-college-along-employees")
	public List<RequestTemplate> retrievecollegestudents()
	{
		return collegeServ.retrievecollegestudents();
	}
	
	
	
	
}
