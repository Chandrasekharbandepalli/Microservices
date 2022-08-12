package in.microservice.collegecatalogclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CollegeCatalogClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeCatalogClientApplication.class, args);
	}
	@Bean
	@LoadBalanced
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
