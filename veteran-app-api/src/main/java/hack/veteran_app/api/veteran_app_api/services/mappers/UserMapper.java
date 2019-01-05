package hack.veteran_app.api.veteran_app_api.services.mappers;

import org.bson.Document;

import hack.veteran_app.common.veteran_app_common.entities.User;

public class UserMapper {

	public static User map(Document object) {
		User response = new User();
		response.setUuid(object.getString("UUID"));
		response.setUserName(object.getString("username"));
		response.setFirstName(object.getString("first"));
		response.setLastName(object.getString("last"));
		response.setEmail(object.getString("email"));
		response.setPassword(object.getString("password"));
		response.setBio(object.getString("bio").toCharArray());

		return response;

	}

}
