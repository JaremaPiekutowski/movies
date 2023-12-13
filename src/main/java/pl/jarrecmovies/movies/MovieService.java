package pl.jarrecmovies.movies;

import org.bson.types.ObjectId;
/* Autowired - used for automatic dependency injection.
Spring will automatically find the appropriate beans that you need
and inject them into your class for you */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // Optional is a container object which may or may not contain a non-null value.
    public Optional<Movie> singleMovie(String imdbId) {
        /*
         * Method from the MongoRepository interface
         * Returns a movie from the database by ID.
         */
        return movieRepository.findMovieByimdbId(imdbId);
    }

}
