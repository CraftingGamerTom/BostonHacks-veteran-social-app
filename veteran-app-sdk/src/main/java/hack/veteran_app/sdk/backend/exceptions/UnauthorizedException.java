/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.sdk.backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Unauthorized")
public class UnauthorizedException extends Exception {

	/**
	 * Auto Generated
	 */
	private static final long serialVersionUID = 3562266346679517386L;

	/**
	 * An Not Found Exception with default error message
	 */
	public UnauthorizedException() {
		super("User is not Authorized to do that.");
	}

	/**
	 * An Not Found Exception with custom error message
	 */
	public UnauthorizedException(String errorMessage) {
		super(errorMessage);
	}

}
