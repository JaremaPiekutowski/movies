package pl.jarrecmovies.movies;

/* Autowired - used for automatic dependency injection.
Spring will automatically find the appropriate beans that you need
and inject them into your class for you */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        /*
         * Method from the MongoRepository interface
         * Returns all the movies from the database.
         */
        return movieRepository.findAll();
    }
}
