package com.mockito.demo;

public class calculatorservice {
	
	
	//we have created this service to work on test cases rather than to on server directly
	calculatorservice service;
	
	public int add(int i,int j) {
	
		return service.add(i,j);
	}

}
