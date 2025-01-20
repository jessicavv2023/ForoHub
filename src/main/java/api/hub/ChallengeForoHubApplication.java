package api.hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "tu.paquete.principal")
public class ChallengeForoHubApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChallengeForoHubApplication.class, args);
	}
}
