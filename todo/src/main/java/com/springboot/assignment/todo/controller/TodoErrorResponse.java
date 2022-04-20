package com.springboot.assignment.todo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodoErrorResponse {

	private int status;
	private String message;
	private long timeStamp;

}
