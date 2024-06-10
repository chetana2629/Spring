package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasspathXmlContextExampleMain {

	public static void main(String[] args) {
		String configfile="spring-config.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(configfile);
		Object loadedObjet = context.getBean("greet");
		GreetingService gs=(GreetingService)loadedObjet; //Upper typecast
		
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
	}
}
