package spring_react_jwt.spring_boot_jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

}
