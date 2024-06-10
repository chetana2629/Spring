package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDependecyInjectionMain2 {

	public static void main(String[] args) {

		ApplicationContext context;
		String configPath = "./src/main/resources/spring-config.xml";

		context = new FileSystemXmlApplicationContext(configPath);
        
		//getBean give 
		Object loadedObjet = context.getBean("greet3");
		GreetingService gs=(GreetingService)loadedObjet; //Upper typecast
		
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println("=================================");
		 loadedObjet = context.getBean("greet4");
		GreetingService gs2=(GreetingService)loadedObjet; //Upper typecast
		
		String reply2=gs2.sayGreeting();
		System.out.println(reply2);
		

	}

}
