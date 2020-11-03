package sravan.java;

import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

@EnableJpaRepositories("sravan.java")

public class StandaloneApplication implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(StandaloneApplication.class);
	@Autowired
	private MySQLRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(StandaloneApplication.class, args);
		getEmployees();
	}

	@Transactional(readOnly = true)
	@Override
	public void run(String... args) throws Exception {
		List<Product> pro = repo.findAll();
		Iterator<Product> p = pro.iterator();
		while (p.hasNext()) {
			System.out.println("Available Products are ---> "+p.next());
		}
		
	}
	
	private static void getEmployees()
	{
	    final String uri = "";
	    RestTemplate restTemplate = new RestTemplate();
	     
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}
}
