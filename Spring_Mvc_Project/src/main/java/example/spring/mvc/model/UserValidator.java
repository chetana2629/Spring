package example.spring.mvc.model;


public class UserValidator {
	
	public static boolean isValid(User currentUserRef) {

		String currentUserName = currentUserRef.getUserId();
		String currentUserPass = currentUserRef.getPassword();
		boolean success = false;
		if (currentUserName.equals("admin") && currentUserPass.equals("asAdmin")

		)
			success = true;
		return success;

	}
}