package sravan.java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {

 @RequestMapping("/java")
 public String customerInformation() {
      return "Hey, I am from external tomcat";
 }

}
