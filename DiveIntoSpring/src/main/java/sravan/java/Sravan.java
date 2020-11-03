package sravan.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="chinna")
public class Sravan implements Laxminarayana {
	@Autowired
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	


	public Sravan() {
		System.out.println("Sravan Constructor");
	}

	@Override
	public void kids() {
		System.out.println("Sravan Class Obj ** " +address.getHno());
		//address.say();
		
	}
	
	

}
