package hack.veteran_app.api.veteran_app_api.controllers;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hack.veteran_app.api.veteran_app_api.services.accessors.HelpRequestDatabaseAccessor;
import hack.veteran_app.common.veteran_app_common.entities.HelpRequest;
import hack.veteran_app.common.veteran_app_common.entities.lists.HelpRequestList;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "LifeLine", tags = { "LifeLine" })
public class HelpRequestController {

	final Logger logger = Logger.getLogger(this.getClass());

	@ApiOperation(value = "Get the LifeLines for a user", response = HelpRequest.class)
	@RequestMapping(value = "/help-requests/{username}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelpRequestList getByUsername(
			@ApiParam(value = "The username", required = true) @PathVariable(value = "username") String username)
			throws NotFoundException {
		return HelpRequestDatabaseAccessor.getByUsername(username);
	}

	@ApiOperation(value = "Get the LifeLines", response = HelpRequest.class)
	@RequestMapping(value = "/help-requests", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelpRequestList getMany(
			@ApiParam(value = "The return size limit", required = false) @RequestParam(value = "limit", required = false, defaultValue = "10") int limit) {
		return HelpRequestDatabaseAccessor.getMany(limit);
	}

	@ApiOperation(value = "Post new LifeLine", response = HelpRequest.class)
	@RequestMapping(value = "/help-requests", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelpRequest post(
			@ApiParam(value = "The username", required = true) @PathVariable(value = "username") String username) {
		HelpRequest response = HelpRequestDatabaseAccessor.post(username);
		return response;

	}

	// TODO putHelpRequest
	// TODO patchHelpRequest
	// TODO deleteHelpRequest

}
