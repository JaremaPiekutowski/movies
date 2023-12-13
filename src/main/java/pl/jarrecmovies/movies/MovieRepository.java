package pl.jarrecmovies.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // Just by declaring this method, Spring will automatically implement it.
    // It will know by what property to search for the movie.
    // This is a framework magic.
    Optional<Movie> findMovieByimdbId(String imdbId);
}
