/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.api.veteran_app_api.services.accessors;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import hack.veteran_app.api.veteran_app_api.services.connections.MongoDatabaseConnection;
import hack.veteran_app.api.veteran_app_api.services.constants.CollectionName;

/**
 * Class to access the collections in a neat manor for the Accessor classes.
 * 
 * @author Thomas Rokicki
 *
 */
public class CollectionAccessor {

	private static MongoDatabase database = MongoDatabaseConnection.getInstance(); // Singleton

	public static MongoCollection<Document> getUserCollection() {
		return database.getCollection(CollectionName.USERS.getCollectionName());
	}

	public static MongoCollection<Document> getMissionCollection() {
		return database.getCollection(CollectionName.MISSIONS.getCollectionName());
	}

	public static MongoCollection<Document> getHelpRequestCollection() {
		return database.getCollection(CollectionName.HELP_REQUESTS.getCollectionName());
	}

}
