/**
 * Copyright (c) 2018 Thomas Rokicki
 */

package hack.veteran_app.sdk.backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "Not Acceptable")
public class NotAcceptableException extends Exception {

	/**
	 * Auto Generated
	 */
	private static final long serialVersionUID = 2546407226690246594L;

	public static final String EMAIL_CANNOT_BE_BLANK = "Email cannot be blank.";
	public static final String USERNAME_CANNOT_BE_BLANK = "Username cannot be blank.";

	/**
	 * An Not Found Exception with default error message
	 */
	public NotAcceptableException() {
		super("The provided object was not acceptable.");
	}

	/**
	 * An Not Found Exception with custom error message
	 */
	public NotAcceptableException(String errorMessage) {
		super(errorMessage);
	}
}
