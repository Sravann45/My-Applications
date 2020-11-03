package sravan.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Sravan lax = (Sravan)context.getBean("chinna");
    	lax.getAddress().setHno("MBNR");
    	lax.kids();
    }
}
