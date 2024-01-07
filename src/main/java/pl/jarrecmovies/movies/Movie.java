package pl.jarrecmovies.movies;

/* This annotation is used to automatically generate a constructor
with arguments for all fields in your class. */
import lombok.AllArgsConstructor;

/* Data annotation - generates getters, setters, toString, equals
and hashCode methods  */
import lombok.Data;

// This annotation generates a constructor with no parameters.
import lombok.NoArgsConstructor;

// Class used to handle _id field of documents in MongoDB
import org.bson.types.ObjectId;

// Annotation for ID field
import org.springframework.data.annotation.Id;

/* With this annotation we tell Spring Data MongoDB that a class
represents a MongoDB document to be stored in the database. */
import org.springframework.data.mongodb.core.mapping.Document;

// Used to handle references to other documents in MongoDB
import org.springframework.data.mongodb.core.mapping.DocumentReference;

// List class - used to store multiple objects
import java.util.List;

/* We define a collection - a group of MongoDB documents. */
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference
    private List<Review> reviews;

    public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster,
            List<String> backdrops, List<String> genres) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }
}
