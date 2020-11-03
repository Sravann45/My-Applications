package sravan.java;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity

public class Product {
	@Id
	private int pid;
	private String product_name;
	
	

}
