package hack.veteran_app.api.veteran_app_api.services.mappers;

import java.time.ZonedDateTime;

import org.bson.Document;

import hack.veteran_app.common.veteran_app_common.entities.HelpRequest;

public class HelpRequestMapper {

	public static HelpRequest map(Document object) {
		HelpRequest response = new HelpRequest();
		response.setUsername(object.getString("username"));
		response.setDate(ZonedDateTime.parse(object.getString("date")));

		return response;
	}

}
