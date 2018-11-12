package hack.veteran_app.api.veteran_app_api.controllers;

import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.bson.conversions.Bson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import hack.veteran_app.api.veteran_app_api.spring.CollectionAccessor;
import hack.veteran_app.common.veteran_app_common.entities.User;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;

public class UserController {

	final Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public String getMission(@RequestParam(value = "limit", required = false, defaultValue = "10" ) String username) throws UnauthorizedException, NotFoundException, InternalServerErrorException,
			UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		MongoCollection collection = CollectionAccessor.getMissionCollection();
		
		Bson filter = Filters.eq("username", username);
		User response = collection.find(filter).first();

		return response;
	}
	
	@RequestMapping(value = "users/getByUsername/{username}", method = RequestMethod.GET)
	public String getUser(@PathParam("username") String username) throws UnauthorizedException, NotFoundException, InternalServerErrorException,
			UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		MongoCollection collection = CollectionAccessor.getMissionCollection();
		
		//Bson filter = Filters.eq("username", username);
		// User user = collection.find(filter).first();

		return new User();
	}
	
}
