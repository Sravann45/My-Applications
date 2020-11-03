package sravan.java.RestWS;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

import sravan.java.model.Product;
@RestController
public class RestWS {

	
	  @Autowired RestTemplate restTemplate;
	  
	  @RequestMapping(value = "/restws", method = RequestMethod.GET) public String
	  getAllProducts() { HttpHeaders headers = new HttpHeaders();
	  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	  HttpEntity<Product> entity = new HttpEntity<Product>(headers);
	  
	  return restTemplate.exchange("http://localhost:9999/load", HttpMethod.GET,
	  entity, String.class).getBody(); }
	  
	  @Bean public RestTemplate restTemplate() { return new RestTemplate(); }
	 
}
