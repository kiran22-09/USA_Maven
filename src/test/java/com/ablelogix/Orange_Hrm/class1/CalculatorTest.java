package com.ablelogix.Orange_Hrm.class1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import com.ablelogix.Orange_Hrm.class1.Calculator;

public class CalculatorTest {
	
	static Calculator calc;
	@BeforeAll
	public static void beforeTest() {
		 calc = new Calculator();
	}
	
	
	@Test
	public void testaddition() {
		System.out.println("Inside Addition.....................");
		int actualResult = calc.addition(100, 200);
		Assert.assertEquals(actualResult, 300);
	}
	
	@Test
	public void testsubtraction() {
		System.out.println("Inside Subtraction.....................");
		int actualResult = calc.subtraction(200, 100);
		Assert.assertEquals(actualResult, 100);
	}
	
	@Test
	public void testdivision() {
		System.out.println("Inside division.....................");
		int actualResult = calc.division(200, 100);
		Assert.assertEquals(actualResult, 2);
	}
	
	@Test
	public void testmultiplication() {
		System.out.println("Inside multiplication.....................");
		int actualResult = calc.multiplication(200, 2);
		Assert.assertEquals(actualResult, 400);
	}
	
	




}
