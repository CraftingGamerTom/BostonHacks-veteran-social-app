package hack.veteran_app.api.veteran_app_api.services.mappers;

import org.bson.Document;

import hack.veteran_app.common.veteran_app_common.entities.Mission;

public class MissionMapper {

	public static Mission map(Document object) {
		Mission response = new Mission();
		// response.setId(object.getObjectId("_id"));
		response.setUuid(object.getString("uuid"));
		response.setTitle(object.getString("title"));
		response.setDescription(object.getString("description"));

		return response;
	}

}
