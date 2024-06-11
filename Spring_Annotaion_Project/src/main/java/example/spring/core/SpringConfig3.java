package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan  //will scan class with component in same package
@ComponentScan(basePackages = {"juices","milkshakes","desserts","example"})
public class SpringConfig3 {
	//@Bean method if any
	
	
}
