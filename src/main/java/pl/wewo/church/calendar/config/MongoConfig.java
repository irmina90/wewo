package pl.wewo.church.calendar.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by lasjak on 7/4/2017.
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {


	protected String getDatabaseName() {
		return "wewo";
	}

	public Mongo mongo() throws Exception {
		return new MongoClient("localhost", 27017);
	}
}
