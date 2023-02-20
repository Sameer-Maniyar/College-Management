package com.engineeringCollegeManagement.GlobalException;

import java.util.Date;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ResourceNotFoundException.class)
	public HashMap<String, Object> SourceNotFountException(Exception exception) {
	   HashMap<String, Object> message=new HashMap<>();
		message.put("Error:", exception.getMessage());
		message.put("Time:",new Date());
		return message;
	}

}
