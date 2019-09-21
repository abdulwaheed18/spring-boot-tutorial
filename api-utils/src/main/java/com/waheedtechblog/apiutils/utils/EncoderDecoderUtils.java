/**
 * 
 */
package com.waheedtechblog.apiutils.utils;

import java.util.Base64;

/**
 * Java Utility to encode decode messages and URL.
 * 
 * @author AbdulWaheed18@gmail.com
 *
 */
public class EncoderDecoderUtils {

	public static String getEncodedMessgae(String message) {
		return getEncodedMessage(message.getBytes());
	}

	public static String getEncodedMessage(byte[] message) {
		return Base64.getEncoder().encodeToString(message);
	}

	public static String getDecodedMessage(String message) {
		byte[] decodedBytes = Base64.getDecoder().decode(message);
		return new String(decodedBytes);
	}

	public static String getEncodedUrl(String url) {
		return Base64.getUrlEncoder().encodeToString(url.getBytes());
	}

	public static String getDecodedUrl(String encodedUrl) {
		byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
		return new String(decodedBytes);
	}
}
