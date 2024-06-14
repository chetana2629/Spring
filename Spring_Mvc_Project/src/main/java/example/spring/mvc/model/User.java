package example.spring.mvc.model;

public class User {
	private String UserId;
	private String Password;
	
	public User() {
	
	}

	public User(String userId, String password) {
		super();
		UserId = userId;
		Password = password;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", Password=" + Password + "]";
	}
}
