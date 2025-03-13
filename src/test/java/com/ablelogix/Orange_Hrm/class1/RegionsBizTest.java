package com.ablelogix.Orange_Hrm.class1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;


public class RegionsBizTest {
	
	static RegionsBiz regObj;
	
	@BeforeAll
	public static void setUP() {
		 regObj = new RegionsBiz();
	}
	

	@Test
	public void testregionID() {
		System.out.println("Inside testregionID.....................");
		boolean actualresult = regObj.ChkregIdEmpty("NRT");
		Assert.assertEquals(actualresult, true);		
	}
	
	@Test
	public void testregionName() {
		System.out.println("Inside testregionName.....................");
		boolean actualresult = regObj.ChkregNameEmpty("NorthAmerica");
		Assert.assertEquals(actualresult, true);		
	}
	
	@Test
	public void testRegIDOptions() {
		System.out.println("Inside testregionIDOptions.....................");
		boolean actualresult = regObj.ChkRegIDOptions("NRT");
		Assert.assertEquals(actualresult, true);		
	}
	
	@Test
	public void testRegNameOptions() {
		System.out.println("Inside testregionNameOptions.....................");
		boolean actualresult = regObj.ChkRegNameOptions("NorthAmerica");
		Assert.assertEquals(actualresult, true);		
	}

}
