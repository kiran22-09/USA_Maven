package com.ablelogix.selenium.USA_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driverobj = new ChromeDriver();
		driverobj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriver DriverObj = new EdgeDriver();
		DriverObj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

}
