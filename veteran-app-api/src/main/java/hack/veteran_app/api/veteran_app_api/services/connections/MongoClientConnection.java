/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.api.veteran_app_api.services.connections;

import org.apache.log4j.Logger;

import com.mongodb.MongoClient;

public class MongoClientConnection {

	final static Logger logger = Logger.getLogger(MongoClientConnection.class);

	private static MongoClient client = null;

	protected MongoClientConnection() {

	}

	public static MongoClient getInstance() {
		if (client == null) {
			logger.info("Creating Mongo Client.");
			client = new MongoClient("localhost", 27017);
			logger.info("Mongo Client Created.");
		}
		return client;
	}

}
