package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLoginPage {
		
	WebDriver driver;
	
	public InstaLoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "email")
	private WebElement unTF;
	
	@FindBy(name = "pass")
	private WebElement pwTf;


	public WebElement getUnTF() {
		return unTF;
	}

	public WebElement getPwTf() {
		return pwTf;
	}
	
}
