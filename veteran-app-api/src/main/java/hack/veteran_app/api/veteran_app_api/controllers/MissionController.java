package hack.veteran_app.api.veteran_app_api.controllers;

import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.bson.conversions.Bson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import hack.veteran_app.api.veteran_app_api.spring.CollectionAccessor;
import hack.veteran_app.api.veteran_app_api.spring.MongoDatabaseConnection;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;

public class MissionController {

	final Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping(value = "users/{username}", method = RequestMethod.GET)
	public String getMission(@RequestParam("username") String username) throws UnauthorizedException, NotFoundException, InternalServerErrorException,
			UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		MongoCollection collection = CollectionAccessor.getMissionCollection();
		
		Bson filter = Filters.eq("username", username);
		User user = collection.find(filter).first();

		return result;
	}
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String getMission(@PathParam("username") String username) throws UnauthorizedException, NotFoundException, InternalServerErrorException,
			UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		MongoCollection collection = CollectionAccessor.getMissionCollection();
		
		Bson filter = Filters.eq("username", username);
		User user = collection.find(filter).first();

		return result;
	}
}
