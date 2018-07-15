package pl.wewo.church.calendar.event;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.wewo.church.calendar.user.User;

import java.time.LocalDateTime;

@Data
@Document(collection = "event")
public class Event {

	@Id
	private String id;
	private String name;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
//	private User owner;

}
