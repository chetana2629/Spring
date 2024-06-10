package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {

		ApplicationContext context;
		String configPath = "./src/main/resources/spring-config.xml";

		context = new FileSystemXmlApplicationContext(configPath);
        
		//getBean give 
		Object loadedObjet = context.getBean("greet");
		GreetingService gs=(GreetingService)loadedObjet; //Upper typecast
		
		String reply=gs.sayGreeting();
		System.out.println(reply);
		

	}

}
