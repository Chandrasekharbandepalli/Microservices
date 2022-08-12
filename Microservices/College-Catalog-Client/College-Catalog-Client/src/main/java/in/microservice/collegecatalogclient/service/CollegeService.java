package in.microservice.collegecatalogclient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.microservice.collegecatalogclient.entity.College;
import in.microservice.collegecatalogclient.values.object.RequestTemplate;

@Service
public interface CollegeService {

	College addCollege(College college);

	List<College> retrieveAllCollege();

	College findById(long college_id);

	List<RequestTemplate> retrievecollegestudents();

	

}
