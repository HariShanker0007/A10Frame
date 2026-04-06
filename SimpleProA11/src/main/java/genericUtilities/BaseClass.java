package genericUtilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objRepository.OrangeHomepage;
import objRepository.OrangeHrmLoginPage;

public class BaseClass {

	public WebDriver driver;
	public PropertiesUtility plib = new PropertiesUtility();
	
	@BeforeSuite(groups = {"smoke","regression"})
		public void beforeSuite() {
		Reporter.log("Establisihing DataBase connection", true);
	}

	@BeforeTest(groups = {"smoke","regression"})
	public void beforeTest() {
		Reporter.log("Pre-Conditions", true);
	}

	@BeforeClass(groups = {"smoke","regression"})
	public void beforeClass() throws Throwable {
		String BROWSER = plib.orangeHRMtoReadDataFromPropertiesFiles("browser");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Reporter.log("Launched Browser", true);
	}

	@BeforeMethod(groups = {"smoke","regression"})
	public void beforeMethod() throws Throwable {
		String URL = plib.orangeHRMtoReadDataFromPropertiesFiles("url");
		String UN = plib.orangeHRMtoReadDataFromPropertiesFiles("un");
		String pw = plib.orangeHRMtoReadDataFromPropertiesFiles("pw");
		driver.get(URL);
		OrangeHrmLoginPage lp = new OrangeHrmLoginPage(driver);
		lp.toLogin(UN, pw);
	}

	@AfterMethod(groups = {"smoke","regression"})
	public void afterMethod() throws Throwable {
		OrangeHomepage ohp = new OrangeHomepage(driver);
		ohp.logout();
		Reporter.log("Logged out successfully", true);
	}

	@AfterClass(groups = {"smoke","regression"})
	public void afterClass() throws Throwable {
		driver.quit();
		Reporter.log("Closed browser", true);
	}
	@AfterTest(groups = {"smoke","regression"})
	public void afterTest() {
		Reporter.log("Disconnecting from DataBase connection", true);
	}

	@AfterSuite(groups = {"smoke","regression"})
	public void afterSuite() {
		Reporter.log("Post-Conditions", true);
	}
}
