/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.sdk.backend;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;
import okhttp3.ResponseBody;

public class ExceptionHelper {
	final static Logger logger = Logger.getLogger(ExceptionHelper.class);

	public static void throwErrorException(ResponseEntity<String> response)
			throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		if (response.getStatusCode() == HttpStatus.UNAUTHORIZED) {
			throw new UnauthorizedException();
		} else if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
			throw new NotFoundException();
		} else if (response.getStatusCode() == HttpStatus.INTERNAL_SERVER_ERROR) {
			throw new InternalServerErrorException();
		} else {
			throw new InternalServerErrorException(InternalServerErrorException.UNKNOWN);
		}
	}

	public static void throwErrorException(int error_code, ResponseBody response)
			throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			logger.error("Retrofit Error occured: " + response.string());
			if (error_code == HttpStatus.UNAUTHORIZED.value()) {
				throw new UnauthorizedException(response.string());
			} else if (error_code == HttpStatus.NOT_FOUND.value()) {
				throw new NotFoundException(response.string());
			} else if (error_code == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				throw new InternalServerErrorException(response.string());
			} else {
				throw new InternalServerErrorException(InternalServerErrorException.UNKNOWN);
			}
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
}
