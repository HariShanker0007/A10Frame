package genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	public String demoWebtoReadDataFromPropertiesFiles(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./\\src\\test\\resources\\Thalapathy.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	public String orangeHRMtoReadDataFromPropertiesFiles(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./\\src\\test\\resources\\OrangeLogin.txt");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
