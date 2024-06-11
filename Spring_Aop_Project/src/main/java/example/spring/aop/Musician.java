package example.spring.aop;


import org.springframework.stereotype.Component;

@Component
public class Musician { //target Bean class
	public void perform() { //Target Method
		System.out.println("Playing Guitar...");
	}
}
