package hack.veteran_app.api.veteran_app_api.services.accessors;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import hack.veteran_app.api.veteran_app_api.services.mappers.MissionMapper;
import hack.veteran_app.api.veteran_app_api.services.mappers.UserMapper;
import hack.veteran_app.common.veteran_app_common.entities.Mission;
import hack.veteran_app.common.veteran_app_common.entities.lists.MissionList;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;

public class MissionDatabaseAccessor {

	public static Mission getByUuid(String uuid) throws NotFoundException {
		MongoCollection<Document> collection = CollectionAccessor.getMissionCollection();
		Document object = collection.find(Filters.eq("uuid", uuid)).first();
		if (object != null) {
			return MissionMapper.map(object);
		} else {
			throw new NotFoundException();
		}
	}

	public static MissionList getMany(int limit) {
		MongoCollection<Document> collection = CollectionAccessor.getMissionCollection();
		FindIterable<Document> object = collection.find();

		List<Mission> list = new ArrayList<Mission>();
		for (Document doc : object) {
			list.add(MissionMapper.map(doc));
		}
		return new MissionList(list);
	}

}
