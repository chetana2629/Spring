package example.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;

@Controller
@SessionAttributes("validUser")
public class SpringMvcController {

	@RequestMapping("/greet")
	public String getIndexPage() {
		System.out.println("Request received");

		// This method gets invokes when client request for

		return "index"; // it will return view name
	}

	@RequestMapping("/showLogin")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/doValidate", method = RequestMethod.POST)
	public String doValidateUser(@RequestParam("user_name") String uid, @RequestParam("user_password") String pwd) {
		User userObj = new User(uid, pwd);
		boolean valid = UserValidator.isValid(userObj);
		String resultPage = "failure";
		if (valid)
			resultPage = "success";
		return resultPage;
	}
	
	//show the msg of the user name 
	@RequestMapping(value = "/doValidateAgain", method = RequestMethod.POST)
	public String doValidateUserAgain(
			@RequestParam("user_name") 
			String uid, @RequestParam("user_password")
			String pwd ,Model dataModel)
	
	{
		User userObj = new User(uid, pwd);
		boolean valid = UserValidator.isValid(userObj);
		String resultPage = "failureAgain";
		if (valid)
			resultPage = "successAgain";
		dataModel.addAttribute("validUser",uid);
		return resultPage;
	}
}
