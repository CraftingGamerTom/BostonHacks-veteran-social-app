package hack.veteran_app.api.veteran_app_api.controllers;

import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hack.veteran_app.api.veteran_app_api.services.accessors.UserDatabaseAccessor;
import hack.veteran_app.common.veteran_app_common.entities.Mission;
import hack.veteran_app.common.veteran_app_common.entities.User;
import hack.veteran_app.common.veteran_app_common.entities.lists.UserList;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

public class UserController {

	final Logger logger = Logger.getLogger(this.getClass());

	@ApiOperation(value = "Get Users", response = UserList.class)
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public UserList getUsers(
			@ApiParam(value = "The return size limit", required = false) @RequestParam(value = "limit", required = false, defaultValue = "10") int limit)
			throws UnauthorizedException, NotFoundException, InternalServerErrorException, UnauthorizedException,
			NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		return UserDatabaseAccessor.getMany(limit);
	}

	@ApiOperation(value = "Get User", response = User.class)
	@RequestMapping(value = "users/{username}", method = RequestMethod.GET)
	public User getUser(@ApiParam(value = "The username", required = true) @PathParam("username") String username)
			throws UnauthorizedException, NotFoundException, InternalServerErrorException, UnauthorizedException,
			NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		User response = UserDatabaseAccessor.getByUsername(username);
		return response;
	}

}
