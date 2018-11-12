package hack.veteran_app.api.veteran_app_api.controllers;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hack.veteran_app.common.veteran_app_common.entities.HelpRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "LifeLine", tags = { "LifeLine" })
public class HelpRequestController {

	final Logger logger = Logger.getLogger(this.getClass());

	// @ApiOperation(value = "Get stored devices (Param Query: `name`, `platform`,
	// `os_version`, `screen_height`, `screen_width`)", response =
	// StoredDeviceList.class)

	@ApiOperation(value = "Get the LifeLines for a user", response = HelpRequest.class)
	@RequestMapping(value = "/help-requests/{username}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelpRequest getByUsername(
			@ApiParam(value = "The device's uuid", required = true) @PathVariable(value = "device-uuid") String device_uuid) {
return new HelpRequest();
	}

	@ApiOperation(value = "Get the LifeLines", response = HelpRequest.class)
	@RequestMapping(value = "/help-requests", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelpRequest getMany() {
		return new HelpRequest();

	}
}
