package com.waheedtechblog.apiutils.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Service class to handle encode/ decode utils
 * 
 * @author AbdulWaheed18@gmail.com
 *
 */
public interface EncoderService {

	/**
	 * Returns the message in the Base64 encoded Format
	 * 
	 * @param message
	 *            message to be encoded
	 * @return Base64 encoded String
	 */
	public String getEncodedMessgae(String message);

	/**
	 * Returns the decoded message
	 * 
	 * @param message
	 *            message to be decoded
	 * @return Base64 decoded message
	 */
	public String getDecodedMessage(String message);

	/**
	 * Returns the encoded URL
	 * 
	 * @param url
	 *            url to be encoded
	 * @return encoded url
	 */
	public String getEncodedUrl(String url);

	/**
	 * Returns the decoded URL
	 * 
	 * @param encodedUrl
	 *            url to be decoded
	 * @return decoded URL
	 */
	public String getDecodedUrl(String encodedUrl);

	/**
	 * Returns the payload of JWT
	 * 
	 * @param jwt
	 *            jwt to be decoded
	 * @return payload
	 */
	public String getJwtPayload(String jwt);

	/**
	 * Returns the Base64 encoded value for given file.
	 * 
	 * @param file
	 *            file to be Encoded
	 * @return
	 */
	public String getEncodedFile(MultipartFile file);
}
