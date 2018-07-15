package pl.wewo.church.calendar.user;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by lasjak on 7/4/2017.
 */
public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(String login);

}
