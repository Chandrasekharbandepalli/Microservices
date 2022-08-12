package in.microservice.collegecatalogclient.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.microservice.collegecatalogclient.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

	

	College findById(long college_id);




}
