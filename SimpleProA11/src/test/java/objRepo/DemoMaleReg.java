
package objRepo;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericUtilities.ExcelUtility;
import genericUtilities.JavaUtility;
import genericUtilities.PropertiesUtility;
import objRepository.DemoLoginPage;

public class DemoMaleReg {
	public static void main(String[] args) throws Throwable {

		//Creating Object of Utilities
		PropertiesUtility plib = new PropertiesUtility();
		ExcelUtility elib = new ExcelUtility();
		JavaUtility jlib = new JavaUtility();
		
		// GATHERING COMMON DATA
		String BROWSER = plib.demoWebtoReadDataFromPropertiesFiles("browser");
		String URL = plib.demoWebtoReadDataFromPropertiesFiles("url");

		// GATHERING TESTSCRIPTDATA
		String FN = elib.toReadDataFromExcel("Sheet1", 0, 1);
		String LN = elib.toReadDataFromExcel("Sheet1", 1, 1);
//		String MAIL = elib.toReadDataFromExcel("Sheet1", 2, 1);
		String MAIL="tvk"+jlib.randomNumber()+"@gmail.com";
		String PW = elib.toReadDataFromExcel("Sheet1", 3, 1);
		String CNPW = elib.toReadDataFromExcel("Sheet1", 4, 1);

		WebDriver driver = null;
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);

		DemoLoginPage dlp = new DemoLoginPage(driver);
		dlp.PersonalDetailsMale(FN, LN, MAIL, PW, CNPW);
	}
}
