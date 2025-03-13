package From_ConfigFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ConfigFileReader implements FilePath{
	
	static Properties prop = new Properties();
	
	public static String[]  readConfig() {
		
		String ConfFilePath = FilePath.configprop;
		
		String PropInfo[] = new String[2];
		
		File fileObj =  new File(ConfFilePath);
		
		FileReader filereaderObj = null;
		try {
			 filereaderObj = new FileReader(fileObj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(filereaderObj);
			
			String Browser = prop.getProperty("Browser");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return PropInfo;
		
	}

}
