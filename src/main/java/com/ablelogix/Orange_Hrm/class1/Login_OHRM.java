package com.ablelogix.Orange_Hrm.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Orange_Hrm.DriverFactory;

public class Login_OHRM {
	
	public static void main(String a[]) {
		
		WebDriver driver = DriverFactory.createDriver("edge");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//login
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
	}

}

