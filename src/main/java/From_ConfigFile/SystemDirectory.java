package From_ConfigFile;

public class SystemDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String SysPath = System.getProperty("user.dir");
		
		System.out.println("File located dir..................."+SysPath);
		
		ConfigFileReader configObj = new ConfigFileReader();
		configObj.readConfig();

	}

}
