package movie_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepositoryRef;

	public Collection<Movie> retrieveAll() {
		Collection<Movie> allMovie = movieRepositoryRef.findAll(); // findAll from JpaRepository will return List
		return allMovie;
	}

	public Movie retrieveOne(Integer movieId) {
		// Movie foundMovie = new Movie(-1,"","",-1); or

		Movie foundMovie = null;
		Optional<Movie> optionalRef = movieRepositoryRef.findById(movieId);
		if (optionalRef.isPresent())
			foundMovie = optionalRef.get();

		return foundMovie;
	}

	public void create(Movie movieRef) {
		movieRepositoryRef.save(movieRef);

	}

	public void update(Movie UpdatedMovieRef) {
		movieRepositoryRef.save(UpdatedMovieRef);
	}

	public void deleteOne(Integer movieId) {
		movieRepositoryRef.deleteById(movieId);
	}

}
