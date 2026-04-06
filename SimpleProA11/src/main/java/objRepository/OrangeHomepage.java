package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHomepage {
	WebDriver driver;
	public OrangeHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[.='My Info']")
	private WebElement myInfo;
	
	@FindBy(xpath = "//span[.='Claim']")
	private WebElement claim;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement drop;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutBtn;
	
	@FindBy(xpath = "//a[.='Leave']")
	private WebElement leave;
	
	public WebElement getLeave() {
		return leave;
	}

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getMyInfo() {
		return myInfo;
	}

	public WebElement getclaim() {
		return claim;
	}
	
	public void logout() {
		drop.click();
		logoutBtn.click();
	}
	
}
