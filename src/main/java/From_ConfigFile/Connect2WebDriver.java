package From_ConfigFile;
import org.openqa.selenium.WebDriver;

import com.ablelogix.Orange_Hrm.class1.Driver_Factory;


public class Connect2WebDriver {

	public WebDriver launchBrowser() {
		ConfigFileReader configFileObj = new ConfigFileReader();
		String [] propertyInfo = configFileObj.readConfig();
		String browser = propertyInfo[0];
		
		String URL = propertyInfo[1];
		
		Driver_Factory driverObj = new Driver_Factory();
		WebDriver driver = driverObj.createDriver(browser);
		driver.get(URL);
		
		WebDriver.Options optionsObj = driver.manage();
		WebDriver.Window windowObj = optionsObj.window();
		windowObj.maximize();
		
		return driver;
		
		
	}
	
	
}