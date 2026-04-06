package ddt;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\Admin\\Desktop\\TestDattaa.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		String UN = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String PW = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
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
