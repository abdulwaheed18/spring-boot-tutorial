package com.waheedtechblog.apiutils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {

	private static final long serialVersionUID = -6955759437619645687L;

	public InvalidInputException(String message) {
		super(message);
	}
}
