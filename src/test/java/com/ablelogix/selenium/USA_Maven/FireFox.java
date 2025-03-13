package com.ablelogix.selenium.USA_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver DriverObj = new EdgeDriver();
		DriverObj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
