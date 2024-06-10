package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExampleMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config3.xml");
		Object obj = context.getBean("myBean3"); // 1st request
		Object obj2 = context.getBean("myBean3"); // 2nd request
		System.out.println(obj == obj2); // o/p true becz its only one time obj create for 1st req & 2nd time it only
											// return refrence
		System.out.println("===========Prototype============");

		obj = context.getBean("myBean4");
		obj2 = context.getBean("myBean4");
		System.out.println(obj == obj2);
	}
}
