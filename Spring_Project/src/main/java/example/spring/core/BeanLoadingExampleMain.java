package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadingExampleMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-config3.xml");
	 //here in mybean 2 its not automatically loading its loading when we are making request by getBean
		context.getBean("myBean2");
	}

}
