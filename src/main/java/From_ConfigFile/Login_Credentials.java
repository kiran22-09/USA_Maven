package From_ConfigFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Credentials {
	
	
	public void loginTest(String username,String password,WebDriver driver) {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				//enter the user name
				String xpath_username = "//input[@name='username']";
				WebElement usernameELM = driver.findElement(By.xpath(xpath_username));
				usernameELM.sendKeys(username);
				//enter the password
				String xpath_pwd = "//input[@name='password']";
				WebElement passwordELM = driver.findElement(By.xpath(xpath_pwd));
				passwordELM.sendKeys(password);
				WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
				btnSubmit.click();
	}
	
	
	public boolean chkDashBoardLINK(WebDriver driver) {
		String xpath_valid_SBI = "//h6[contains(.,'Dashboard')]";
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement dashBoardELM  = driver.findElement(By.xpath(xpath_valid_SBI));
		
		
		String value =  dashBoardELM.getText();
		System.out.println("text is ..............."+value);
		if(dashBoardELM.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		
	}

}