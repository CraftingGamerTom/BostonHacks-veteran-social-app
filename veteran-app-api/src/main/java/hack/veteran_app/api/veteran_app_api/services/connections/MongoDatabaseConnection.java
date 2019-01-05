/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.api.veteran_app_api.services.connections;

import org.apache.log4j.Logger;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDatabaseConnection {

	final static Logger logger = Logger.getLogger(MongoDatabaseConnection.class);
	private static MongoDatabase database = null;

	protected MongoDatabaseConnection() {

	}

	/**
	 * Singleton for the database
	 * 
	 * @return
	 */
	public static MongoDatabase getInstance() {
		if (database == null) {
			logger.info("Connecting to Mongo Database");

			MongoClient client = MongoClientConnection.getInstance();
			database = client.getDatabase("veteranDatabase");
		}
		return database;
	}
}
