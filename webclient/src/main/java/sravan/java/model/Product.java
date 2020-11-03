package sravan.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Product {
	@Id
	
	private int pid;
	private String pname;
	private String mnfName;

}
