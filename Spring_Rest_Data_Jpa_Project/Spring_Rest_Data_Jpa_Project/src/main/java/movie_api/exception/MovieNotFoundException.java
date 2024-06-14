package movie_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends RuntimeException {

	private Integer invalidMovieId;

	public MovieNotFoundException(String errorMsg, Integer invalidMovieId) {
		super(errorMsg);
		this.invalidMovieId = invalidMovieId;
	}

	@Override
	public String getMessage() {
		String message = super.getMessage();
		String finalMessage = message + " => " + invalidMovieId;
		return finalMessage;
	}
}
