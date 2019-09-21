package com.waheedtechblog.apiutils.service;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.waheedtechblog.apiutils.exception.InvalidInputException;
import com.waheedtechblog.apiutils.utils.EncoderDecoderUtils;

@Service
public class EncoderServiceImpl implements EncoderService {

	private static final Logger logger = LoggerFactory.getLogger(EncoderServiceImpl.class);

	@Override
	public String getEncodedMessgae(String message) {
		logger.debug("Message to be encoded: {}", message);
		if (StringUtils.isEmpty(message)) {
			throw new InvalidInputException("Either message is null or empty");
		}
		return EncoderDecoderUtils.getEncodedMessgae(message);
	}

	@Override
	public String getDecodedMessage(String message) {
		logger.debug("Message to be Decoded: {}", message);
		if (StringUtils.isEmpty(message)) {
			throw new InvalidInputException("Either message is null or empty");
		}
		return EncoderDecoderUtils.getDecodedMessage(message);
	}

	@Override
	public String getEncodedUrl(String url) {
		logger.debug("URL to be encoded: {}", url);
		if (StringUtils.isEmpty(url)) {
			throw new InvalidInputException("Either message is null or empty");
		}
		return EncoderDecoderUtils.getEncodedUrl(url);
	}

	@Override
	public String getDecodedUrl(String encodedUrl) {
		logger.debug("URL to be decoded {}", encodedUrl);
		if (StringUtils.isEmpty(encodedUrl)) {
			throw new InvalidInputException("Either message is null or empty");
		}
		return EncoderDecoderUtils.getDecodedUrl(encodedUrl);
	}

	@Override
	public String getJwtPayload(String jwt) {
		logger.debug("Message to be Decoded: {}", jwt);
		if (StringUtils.isEmpty(jwt) || StringUtils.split(jwt, ".").length != 3) {
			throw new InvalidInputException("Either message is Invalid or Empty");
		}
		String payload = StringUtils.substringBetween(jwt, ".", ".");
		return EncoderDecoderUtils.getDecodedMessage(payload);
	}

	@Override
	public String getEncodedFile(MultipartFile file) {
		if (file.isEmpty()) {
			throw new InvalidInputException("file cannot be empty");
		}
		byte[] fileInBytes = null;
		try {
			fileInBytes = file.getBytes();
		} catch (IOException e) {
			logger.error("Something went wrong internally: {}", e.getMessage(), e);
			throw new RuntimeException("Something went wrong: " + e.getMessage());
		}
		return EncoderDecoderUtils.getEncodedMessage(fileInBytes);
	}
}
