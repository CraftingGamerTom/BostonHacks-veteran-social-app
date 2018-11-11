
package hack.veteran_app.api.veteran_app_api.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;

@RestController
@RequestMapping("test")
public class TestController {

	final Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() throws UnauthorizedException, NotFoundException, InternalServerErrorException,
			UnauthorizedException, NotFoundException, InternalServerErrorException {
		logger.debug("Reached Endpoint");

		String result = "Hello World!";

		return result;
	}
}
