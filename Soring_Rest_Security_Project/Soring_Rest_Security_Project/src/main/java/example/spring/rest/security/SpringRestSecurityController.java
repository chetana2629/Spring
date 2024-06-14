package example.spring.rest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestSecurityController {

	@GetMapping("/greet")  //No security
	public String doGreet() {
		return "welcome to the world of spring security";
	}

	@GetMapping("/regular-work") //Accessible to regular users as well as administrator
	public String doregularWork() {
		return "Doing some regular work";
	}

	@GetMapping("/admin-work") //Accessible to administrator only.
	public String doAdminWork() { 
		return "Doing some Admin work";
	}
	
	
	
	
}
