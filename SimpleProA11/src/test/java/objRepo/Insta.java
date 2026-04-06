package objRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objRepository.InstaLoginPage;

public class Insta {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		InstaLoginPage lp= new InstaLoginPage(driver);
		lp.getUnTF().sendKeys("Hari@123");
		lp.getPwTf().sendKeys("HArikjassjhsj");
		driver.navigate().refresh();
		lp.getUnTF().sendKeys("Hari@123");
		lp.getPwTf().sendKeys("HArikjassjhsj");
	
	}
}
