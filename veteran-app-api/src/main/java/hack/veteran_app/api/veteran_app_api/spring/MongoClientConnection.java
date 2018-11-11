/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.api.veteran_app_api.spring;

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

			// String uri = "mongodb://" + DB_SRV_USR + ":" + DB_SRV_PWD + "@" + DB_URL + ":" + DB_PORT + "/" + dbName
			// 		+ "?authSource=admin";
			// MongoClientURI mongoClientURI = new MongoClientURI(uri);
			//client = new MongoClient(mongoClientURI);
			client = new MongoClient( "54.172.34.193" , 27017 );
			
			logger.info("Mongo Client Created.");
		}
		return client;
	}

}
