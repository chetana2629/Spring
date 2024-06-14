package movie_api.restcontroller;

import java.security.PublicKey;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import movie_api.entity.Movie;
import movie_api.exception.MovieNotFoundException;
import movie_api.service.MovieService;

//End point
@RestController
public class MovieRestController {
	@Autowired
	public MovieService movieServiceRef;

	// GET /movie_api
	@GetMapping("/movie_api")
	public Collection<Movie> retrieveAll() {
		Collection<Movie> allMovie = movieServiceRef.retrieveAll();
		return allMovie;
	}

	// GET /movie_api/{id}
	@GetMapping("/movie_api/{movieId}")
	public Movie retrieveOne(@PathVariable Integer movieId) {
		Movie foundMovie = movieServiceRef.retrieveOne(movieId);
		// System.out.println(foundMovie);

		/*
		 * if movie found reture that movie if movie is not found throw
		 * MovieNotFoundException
		 */
		if (foundMovie == null) {
			MovieNotFoundException ex = new MovieNotFoundException("Movie with given Id Not found", movieId);
			throw ex;
		}

		return foundMovie;

	}

	// POST /movie_api
	@PostMapping("/movie_api")
	public void create(@RequestBody Movie movieRef) {
		movieServiceRef.create(movieRef);
	}

	// Put for
	@PutMapping("/movie_api")
	public void update(@RequestBody Movie movieRef) {
		movieServiceRef.create(movieRef);
	}

	// Delete /movie_api/{Id}
	@DeleteMapping("/movie_api/{movieId}")
	public void deleteOne(@PathVariable Integer movieId) {
		movieServiceRef.deleteOne(movieId);
	}

}
