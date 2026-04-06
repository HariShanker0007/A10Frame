package genericUtilities;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DummyBase {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Database Connection",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("pre-Conditions",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Launching Browser",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logout",true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("CLosing the browser",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("post-conditions",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Disconnecting from dataBase",true);
	}
}
