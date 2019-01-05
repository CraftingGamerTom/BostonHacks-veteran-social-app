package hack.veteran_app.api.veteran_app_api.controllers;

import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hack.veteran_app.api.veteran_app_api.services.accessors.MissionDatabaseAccessor;
import hack.veteran_app.common.veteran_app_common.entities.Mission;
import hack.veteran_app.common.veteran_app_common.entities.lists.MissionList;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "Mission", tags = { "Mission" })
public class MissionController {

	final Logger logger = Logger.getLogger(this.getClass());

	@ApiOperation(value = "Get Missions", response = Mission.class)
	@RequestMapping(value = "/missions", method = RequestMethod.GET)
	public MissionList getMissions(
			@ApiParam(value = "The return size limit", required = false) @RequestParam(value = "limit", required = false, defaultValue = "10") int limit)
			throws UnauthorizedException, NotFoundException, InternalServerErrorException, UnauthorizedException,
			NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		return MissionDatabaseAccessor.getMany(limit);
	}

	@ApiOperation(value = "Get Mission by uuid", response = Mission.class)
	@RequestMapping(value = "/missions/{uuid}", method = RequestMethod.GET)
	public Mission getMissionByUUID(@ApiParam(value = "The uuid", required = true) @PathParam("uuid") String uuid)
			throws UnauthorizedException, NotFoundException, InternalServerErrorException, UnauthorizedException,
			NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");
		return MissionDatabaseAccessor.getByUuid(uuid);
	}

	// TODO postMission
	// TODO putMission
	// TODO patchMission
	// TODO deleteMission
}
