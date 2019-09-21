/**
 * 
 */
package com.waheedtechblog.apiutils.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.waheedtechblog.apiutils.service.EncoderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Encoder Decoder Endpoint
 * 
 * @author AbdulWaheed18@gmail.com
 *
 */
@RestController
@Api(value = "Endpoint for BASE64 Encoding Decoding message or files")
public class EncodeController {

	@Autowired
	private EncoderService encodeService;

	@PostMapping("/encodeMessage")
	@ApiOperation(value = "returns the encoded message", response = String.class, produces = "text/plain", consumes = "text/plain")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Encoded message"),
			@ApiResponse(code = 400, message = "Invalid or Empty Input") })
	public ResponseEntity<String> getEncodedString(@RequestBody String message) {
		return ResponseEntity.ok(encodeService.getEncodedMessgae(message));
	}

	@PostMapping("/decodeMessage")
	@ApiOperation(value = "returns the decoded message", response = String.class, produces = "text/plain", consumes = "text/plain")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Decoded message"),
			@ApiResponse(code = 400, message = "Invalid or Empty Input") })
	public ResponseEntity<String> getDecodedString(@RequestBody String message) {
		return ResponseEntity.ok(encodeService.getDecodedMessage(message));
	}

	@PostMapping("/encodeUrl")
	@ApiOperation(value = "returns the encoded URL", response = String.class, produces = "text/plain", consumes = "text/plain")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Encoded url"),
			@ApiResponse(code = 400, message = "Invalid or Empty Input") })
	public ResponseEntity<String> getEncodedUrl(@RequestBody String message) {
		return ResponseEntity.ok(encodeService.getEncodedUrl(message));
	}

	@PostMapping("/decodeUrl")
	@ApiOperation(value = "returns the decoded URL", response = String.class, produces = "text/plain", consumes = "text/plain")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Decoded URL"),
			@ApiResponse(code = 400, message = "Invalid or Empty Input") })
	public ResponseEntity<String> getDecodedUrl(@RequestBody String message) {
		return ResponseEntity.ok(encodeService.getDecodedUrl(message));
	}

	@PostMapping("/decodeJwt")
	@ApiOperation(value = "returns the payload of JWT", response = String.class, produces = "text/plain", consumes = "text/plain")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Decoded Payload of JWT"),
			@ApiResponse(code = 400, message = "Invalid or Empty Input") })
	public ResponseEntity<String> getJwtPayload(@RequestBody String message) {
		return ResponseEntity.ok(encodeService.getJwtPayload(message));
	}

	@PostMapping("/encodeFile")
	@ApiOperation(value = "returns the encoded value of File", response = String.class, produces = "text/plain", consumes = "text/plain")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Encoded Value of File"),
			@ApiResponse(code = 400, message = "Invalid or Empty Input") })
	public ResponseEntity<String> getEncodeValueForFile(@RequestParam("file") MultipartFile file) {
		return ResponseEntity.ok(encodeService.getEncodedFile(file));
	}
}
