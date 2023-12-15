package pl.jarrecmovies.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    // This is a Spring class that allows us to do more complex operations
    // on the database.
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbIdString) {
        // This is a MongoDB query that will insert a new review into the database.
        Review review = reviewRepository.insert(new Review(reviewBody));

        // This is a MongoDB query that will find a movie with the given imdbId
        // and push the review into the reviewIds array.
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbIdString))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
