package hack.veteran_app.api.veteran_app_api.services.accessors;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import hack.veteran_app.api.veteran_app_api.services.mappers.UserMapper;
import hack.veteran_app.common.veteran_app_common.entities.User;
import hack.veteran_app.common.veteran_app_common.entities.lists.UserList;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;

public class UserDatabaseAccessor {

	public static User getByUsername(String username) throws NotFoundException {
		MongoCollection<Document> collection = CollectionAccessor.getUserCollection();
		Bson filter = Filters.eq("username", username);
		Document object = collection.find(filter).first();
		if (object != null) {
			return UserMapper.map(object);
		} else {
			throw new NotFoundException();
		}
	}

	public static UserList getMany(int limit) {
		MongoCollection<Document> collection = CollectionAccessor.getUserCollection();
		FindIterable<Document> object = collection.find();

		List<User> list = new ArrayList<User>();
		for (Document doc : object) {
			list.add(UserMapper.map(doc));
		}
		return new UserList(list);
	}

	// TODO postUser
	// TODO putUser
	// TODO patchUser
	// TODO deleteUser
}
