package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.PropertiesUtility;
import objRepository.OrangeHrmLoginPage;

public class OrangeLogin extends BaseClass {

	@Test
	public void loginAndLogOut() throws Throwable {
		
		//CREATE OBJECT
		PropertiesUtility plib = new PropertiesUtility();
				
		//Reading Data
		String BROWSER = plib.orangeHRMtoReadDataFromPropertiesFiles("browser");
		String URL = plib.orangeHRMtoReadDataFromPropertiesFiles("url");
		String UN = plib.orangeHRMtoReadDataFromPropertiesFiles("un");
		String PW = plib.orangeHRMtoReadDataFromPropertiesFiles("pw");
		
		driver.get(URL);
		
		OrangeHrmLoginPage olp = new OrangeHrmLoginPage(driver);
		Reporter.log("Successfully Logged in into Orange HRM",true);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
