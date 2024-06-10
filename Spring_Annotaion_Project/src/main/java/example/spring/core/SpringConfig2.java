package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig2 {
	// Declaring the bean of type Address

	@Bean("addr")
//	@Primary //Making the bean  primary 
	public Address getAddress() {

		Address myAddress = new Address("Dhule", 424005);
		return myAddress;
	}

	// Declaring the bean of type Bean
	@Bean("cust")
	public Customer getCustomer() {
  //Not setting permentAddress asking spring to set auto-wired.
		
		Customer cusomerRef = new Customer();
		cusomerRef.setCustomerId("C001");
		cusomerRef.setName("chetana patil");
		cusomerRef.setAge(27);
		return cusomerRef;
		
	}
	
	@Bean("addr2")
	public Address getAddress2() {

		Address myAddress = new Address("Jalgao", 424005);
		return myAddress;
	}

}
