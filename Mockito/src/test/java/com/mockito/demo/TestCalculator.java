package com.mockito.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestCalculator {

	calculator c = null;
	calculatorservice service = Mockito.mock(calculatorservice.class);
	
//	@Before
//	public void setup()
//	{
//		c= new calculator(service);
//	}
	
	@Test
	public void testAdd()
	{
		
		assertEquals(5,c.add(2, 3));
	}

}
