package com.unisofia.fmi.userservice.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unisofia.fmi.userservice.model.Status;

@ControllerAdvice
public class ControllerExceptionHandler {
		
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseBody
	public Status handleUserNotFoundException(HttpServletRequest request, Exception ex) {
		return new Status(false, "No user found.");
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Status handleGenericException(HttpServletRequest request, Exception ex) {
		return new Status(false, ex.getMessage());
	}
}
