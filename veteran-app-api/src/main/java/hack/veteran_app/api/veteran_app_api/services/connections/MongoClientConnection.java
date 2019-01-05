/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.api.veteran_app_api.services.connections;

import org.apache.log4j.Logger;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoClientConnection {

	final static Logger logger = Logger.getLogger(MongoClientConnection.class);

	private static MongoClient client = null;

	protected MongoClientConnection() {

	}

	public static MongoClient getInstance() {
		if (client == null) {
			logger.info("Creating Mongo Client.");
			String uri = "mongodb://hackathon:haax@localhost:25560/hackathonDatabase?authSource=admin";
			MongoClientURI mongoClientURI = new MongoClientURI(uri);
			client = new MongoClient(mongoClientURI);
			logger.info("Mongo Client Created.");
		}
		return client;
	}

}
