package com.waheedtechblog.apiutils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = -526833393061707615L;

	public NotFoundException(String message) {
		super(message);
	}

}
