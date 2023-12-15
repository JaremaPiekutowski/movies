package pl.jarrecmovies.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    // Just by declaring this method, Spring will automatically implement it.
    // It will know by what property to search for the movie.
    // This is a framework magic.
}
