/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.api.veteran_app_api.spring;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Class to access the collections in a neat manor for the Accessor classes.
 * 
 * @author Thomas Rokicki
 *
 */
public class CollectionAccessor {

	private static MongoDatabase database = MongoDatabaseConnection.getInstance(); // Singleton

	public static MongoCollection<Document> getAppCollection() {
		return database.getCollection(CollectionName.USERS.getCollectionName());
	}

	public static MongoCollection<Document> getMissionCollection() {
		return database.getCollection(CollectionName.MISSIONS.getCollectionName());
	}

	public static MongoCollection<Document> getHelpRequestsCollection() {
		return database.getCollection(CollectionName.HELP_REQUESTS.getCollectionName());
	}

}
