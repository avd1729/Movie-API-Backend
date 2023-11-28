package dev.aravind.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
// Data Access Layer for our REST API , talking to the database and getting data
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
