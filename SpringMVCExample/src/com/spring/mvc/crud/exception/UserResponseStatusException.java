/**
 * 
 */
package com.spring.mvc.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈")
public class UserResponseStatusException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
