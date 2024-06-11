package example.spring.aop;


import org.springframework.stereotype.Component;

@Component
public class Singer { //target Bean class
	public void perform() { //Target Method
		System.out.println("Singing a song.");
//		throw new RuntimeException();
	}
}
