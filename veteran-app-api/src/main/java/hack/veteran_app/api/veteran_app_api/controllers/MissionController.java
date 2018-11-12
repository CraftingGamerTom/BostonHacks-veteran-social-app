package hack.veteran_app.api.veteran_app_api.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.bson.conversions.Bson;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import hack.veteran_app.api.veteran_app_api.spring.CollectionAccessor;
import hack.veteran_app.api.veteran_app_api.spring.MongoDatabaseConnection;
import hack.veteran_app.common.veteran_app_common.entities.Mission;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;
import io.swagger.annotations.ApiOperation;

public class MissionController {

	final Logger logger = Logger.getLogger(this.getClass());

	@ApiOperation(value = "Get Missions", response = Mission.class)
	@RequestMapping(value = "missions", method = RequestMethod.GET)
	public List<Mission> getMissions() throws UnauthorizedException, NotFoundException, InternalServerErrorException,
			UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");

		return new ArrayList<Mission>();
	}

	@ApiOperation(value = "Get Mission by uuid", response = Mission.class)
	@RequestMapping(value = "/missions/{uuid}", method = RequestMethod.GET)
	public Mission getMissionByUUID(@PathParam("uuid") String uuid) throws UnauthorizedException, NotFoundException,
			InternalServerErrorException, UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		MongoCollection collection = CollectionAccessor.getMissionCollection();

		return new Mission();
	
	}

	@ApiOperation(value = "POST Mission", response = Mission.class)
	@RequestMapping(value = "/missions", method = RequestMethod.GET)
	public Mission post(@RequestBody Mission mission) String uuid) throws UnauthorizedException, NotFoundException,
			InternalServerErrorException, UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		MongoCollection collection = CollectionAccessor.getMissionCollection();

		return new Mission();
	}
}
