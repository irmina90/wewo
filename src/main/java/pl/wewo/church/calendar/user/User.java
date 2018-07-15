package pl.wewo.church.calendar.user;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by lasjak on 7/4/2017.
 */

@Data
@Document(collection = "user")
public class User {

	@Id
	private String id;
	private String login;
	private String password;
	private String email;
	private String type;

}
