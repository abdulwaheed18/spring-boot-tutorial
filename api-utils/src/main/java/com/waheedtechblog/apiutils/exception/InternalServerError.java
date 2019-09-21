package com.waheedtechblog.apiutils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerError extends RuntimeException {
	private static final long serialVersionUID = -6955759437619645687L;

	public InternalServerError(String message) {
		super(message);
	}
}
