package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopExampleMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAopConfig.class);
		Musician musicianRef = context.getBean(Musician.class);
		musicianRef.perform();
		String className = musicianRef.getClass().getName(); // we will proxy class name
		System.out.println(className);
		System.out.println("==========================");

		Singer singerRef = context.getBean(Singer.class);
		singerRef.perform();
		String className2 = singerRef.getClass().getName(); // we will proxy class name
		System.out.println(className2);
		
	}

}
