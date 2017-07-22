package com.calculator.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateUtilTest {

	

	@Test
	public void testCalculateTotal() {
		
		  CalculateUtil calculateUtil=new CalculateUtil("Test2.txt");
		  float sum=calculateUtil.calculateTotal();
		  assertEquals(45.0, sum,0);
		
	}

}
