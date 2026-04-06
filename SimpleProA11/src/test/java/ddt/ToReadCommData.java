package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToReadCommData {
	public static void main(String[] args) throws IOException {

		// step 1
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\commonData.properties");

		// step 2
		Properties prop = new Properties();

		// step3
		prop.load(fis);

		// step 4
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String UN = prop.getProperty("un");
		String PW = prop.getProperty("pw");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PW);

		WebDriver driver = null;

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.get(URL);
		driver.findElement(By.name("email")).sendKeys(UN);
		driver.findElement(By.name("pass")).sendKeys(PW);
	}
}
