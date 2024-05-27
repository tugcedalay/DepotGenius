package com.depotgenius.core.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BusinessExceptions extends RuntimeException{
    
	private static final long serialVersionUID = 1L;
	
	private String message;
}
