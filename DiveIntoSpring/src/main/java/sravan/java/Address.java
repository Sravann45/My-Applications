package sravan.java;

import org.springframework.stereotype.Component;

@Component
public class Address {
private String hno;

public String getHno() {
	return hno;
}

public void setHno(String hno) {
	this.hno = hno;
}

public String toString() {
		// TODO Auto-generated method stub
		return "Hno: 5-12-42/1 Patha Palamoor";
	}

}
