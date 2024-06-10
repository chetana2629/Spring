package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration // marks this class as Configuration unit
public class SpringConfig {
//this class is Equivalent to spring-config.xml

	@Bean // Marks this method as bean registration method by default id will be
			// getHelloBean
	public GreetingService getHelloBean() {

		GreetingService gs = new HelloService();
		return gs;
	}

//	public GreetingService getHelloBean() {

//		return new HelloService();
//	}

	@Bean("greet") // now id will be greet
	public GreetingService getWelcomeBean() {
		GreetingService gs = new WelcomeService();
		return gs;
	}

	@Bean
	@Lazy 
	public GreetingService matchResult() {
		// this is equivalent to setter Injection
		CricketMatchResult result = new CricketMatchResult();
		result.setWinningTeam("India");
		result.setLosingTeam("Pakistan");
		result.setWinningMargin(6);
		result.setWinningType("Runs");
		return result;
	}
	
	@Bean
	@Scope("prototype")
	public GreetingService matchResult2()
	{
		//This is eqivalent to Constructor injection
		GreetingService gs=
		new CricketMatchResult(8,"India","Ireland","wicket");
		return gs;
	}

}
