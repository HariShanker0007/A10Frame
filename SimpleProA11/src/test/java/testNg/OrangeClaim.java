package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objRepository.OrangeHomepage;

public class OrangeClaim extends BaseClass {
	
	@Test(groups = "smoke")
	public void claim() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
//		//Creating object for orangeHRM home page
//		OrangeHomepage ohp = new OrangeHomepage(driver);
//		ohp.getclaim().click();
//		System.out.println("Execution Successfully");
	}
}
