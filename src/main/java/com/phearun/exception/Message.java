package com.phearun.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
	
	private String field;
	
	private String message;
	
	private MessageType type;
}
