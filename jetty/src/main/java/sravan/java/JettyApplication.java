package sravan.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JettyApplication extends SpringBootServletInitializer {

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(JettyApplication.class);
	 } 

	public static void main(String[] args) {
		SpringApplication.run(JettyApplication.class, args);
	}

	@RequestMapping("/hello")
	public String say() {
		return "trying External server... !!!!!";
	}
}
