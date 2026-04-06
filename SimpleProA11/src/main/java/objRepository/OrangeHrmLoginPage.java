package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPage {
	WebDriver driver;

	public OrangeHrmLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement unTf;

	@FindBy(name = "password")
	private WebElement pwTf;

	@FindBy(xpath = "//button[.=' Login ']")
	private WebElement lgnBtn;

	public WebElement getNameTf() {
		return unTf;
	}

	public WebElement getPwTf() {
		return pwTf;
	}

	public WebElement getLgnBtn() {
		return lgnBtn;
	}

	public void toLogin(String un, String pw) {
		unTf.sendKeys(un);
		pwTf.sendKeys(pw);
		lgnBtn.click();
	}

}
