package sravan.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import sravan.java.model.Product;
import sravan.java.repository.ProductRepository;

@SpringBootApplication
@RestController
public class WebclientApplication {
	@Autowired
	ProductRepository productRepo;
	Product p = new Product();

	public static void main(String[] args) {
		SpringApplication.run(WebclientApplication.class, args);
	}

	@PostMapping(value = "/save")
	public Product save(@RequestBody Product p) {
		return productRepo.save(p);
	}
	
	 @GetMapping(value="/load",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	  public List<Product> load(){
		 return productRepo.findAll(); 
		 }
	
}
