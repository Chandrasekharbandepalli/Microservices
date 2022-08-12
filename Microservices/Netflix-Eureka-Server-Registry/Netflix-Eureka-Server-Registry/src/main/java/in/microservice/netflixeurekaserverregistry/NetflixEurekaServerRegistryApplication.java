package in.microservice.netflixeurekaserverregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaServerRegistryApplication.class, args);
	}

}
