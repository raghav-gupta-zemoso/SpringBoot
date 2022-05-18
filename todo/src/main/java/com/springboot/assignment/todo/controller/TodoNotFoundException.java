package com.springboot.assignment.todo.controller;

public class TodoNotFoundException extends RuntimeException {

	public TodoNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public TodoNotFoundException(String message) {
		super(message);
	}

	public TodoNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
