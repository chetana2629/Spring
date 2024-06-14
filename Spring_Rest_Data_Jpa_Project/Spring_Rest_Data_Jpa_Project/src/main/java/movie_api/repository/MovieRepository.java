package movie_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movie_api.entity.Movie;

//@Repository no need to use this bez this interface inherited it becomes Managed Componet automatically
 public interface MovieRepository extends JpaRepository<Movie, Integer>  {
	 //No futher code for presistency
	 // it is managed intrenally
	 //However if any further customization is required that can be done.
 }
