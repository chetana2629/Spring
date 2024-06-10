package example.spring.core;

public class CricketMatchResult implements GreetingService {

	private String winningTeam;
	private String losingTeam;
	private int winningMargin;
	private String winningType;

	public CricketMatchResult() {

	}

	public CricketMatchResult(String winningTeam, String losingTeam, int winningMargin, String winningType) {
		super();
		System.out.println("Inside CricketMatchResult(Stirng , string , int, Stirng)");
		this.winningMargin = winningMargin;
		this.winningTeam = winningTeam;
		this.losingTeam = losingTeam;
		this.winningType = winningType;
	}

	public CricketMatchResult(int winningMargin,String losingTeam, String winningTeam, String winningType) {
		super();
		System.out.println("Inside CricketMatchResult(int,String,String,String)");
		this.winningMargin = winningMargin;
		this.winningType = winningType;
		this.losingTeam = losingTeam;
		
		this.winningTeam = winningTeam;
		
	}

	public String getWinningTeam() {
		return winningTeam;
	}

	public void setWinningTeam(String winningTeam) {
		System.out.println("Setting winning Team...");
		this.winningTeam = winningTeam;
	}

	public String getLosingTeam() {
		return losingTeam;
	}

	public void setLosingTeam(String losingTeam) {
		this.losingTeam = losingTeam;
	}

	public int getWinningMargin() {
		return winningMargin;
	}

	public void setWinningMargin(int winningMargin) {
		this.winningMargin = winningMargin;
	}

	public String getWinningType() {
		return winningType;
	}

	public void setWinningType(String winningType) {
		this.winningType = winningType;
	}

	@Override
	public String sayGreeting() {
		String greetingMessage = ("Heartiest Congratulation to team" + winningTeam + "" + " for defeating taem "
				+ losingTeam + " by " + winningMargin + " " + winningType);
		return greetingMessage;
	}

	@Override
	public String toString() {
		return "CricketMatchResult [winningTeam=" + winningTeam + ", losingTeam=" + losingTeam + ", winningMargin="
				+ winningMargin + ", winningType=" + winningType + "]";
	}

}
