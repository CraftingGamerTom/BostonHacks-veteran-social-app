package hack.veteran_app.api.veteran_app_api.services.accessors;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import hack.veteran_app.api.veteran_app_api.services.mappers.HelpRequestMapper;
import hack.veteran_app.api.veteran_app_api.services.mappers.UserMapper;
import hack.veteran_app.common.veteran_app_common.entities.HelpRequest;
import hack.veteran_app.common.veteran_app_common.entities.User;
import hack.veteran_app.common.veteran_app_common.entities.lists.HelpRequestList;
import hack.veteran_app.common.veteran_app_common.entities.lists.UserList;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;

public class HelpRequestDatabaseAccessor {

	public static HelpRequestList getByUsername(String username) throws NotFoundException {
		MongoCollection<Document> collection = CollectionAccessor.getHelpRequestCollection();
		FindIterable<Document> object = collection.find(Filters.eq("username", username));

		List<HelpRequest> list = new ArrayList<HelpRequest>();
		if (object != null) {
			for (Document doc : object) {
				list.add(HelpRequestMapper.map(doc));
			}
			return new HelpRequestList(list);
		} else {
			throw new NotFoundException();
		}
	}

	public static HelpRequestList getMany(int limit) {
		MongoCollection<Document> collection = CollectionAccessor.getHelpRequestCollection();
		FindIterable<Document> object = collection.find();

		List<HelpRequest> list = new ArrayList<HelpRequest>();
		for (Document doc : object) {
			list.add(HelpRequestMapper.map(doc));
		}
		return new HelpRequestList(list);
	}

	public static HelpRequest post(String username) {
		HelpRequest response = new HelpRequest();
		response.setUsername(username);
		response.setDate(ZonedDateTime.now());

		Document document = new Document();
		document.append("username", response.getUsername());
		document.append("date", response.getDate().toString());

		MongoCollection<Document> collection = CollectionAccessor.getHelpRequestCollection();
		collection.insertOne(document);

		return response;
	}

}
