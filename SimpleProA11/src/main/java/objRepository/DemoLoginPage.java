package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {
	WebDriver driver;

	public DemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioBtn;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioBtn;

	@FindBy(id = "FirstName")
	private WebElement fnTf;

	@FindBy(id = "LastName")
	private WebElement lnTf;

	@FindBy(id = "Email")
	private WebElement mailTf;

	@FindBy(id = "Password")
	private WebElement pwTf;

	@FindBy(id = "ConfirmPassword")
	private WebElement cnPwTf;

	@FindBy(id = "register-button")
	private WebElement registerBtn;

	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}

	public WebElement getFemaleRadioBtn() {
		return femaleRadioBtn;
	}

	public WebElement getFnTf() {
		return fnTf;
	}

	public WebElement getLnTf() {
		return lnTf;
	}

	public WebElement getMailTf() {
		return mailTf;
	}

	public WebElement getPwTf() {
		return pwTf;
	}

	public WebElement getCnPwTf() {
		return cnPwTf;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

	public void PersonalDetailsMale(String fn, String ln, String mail, String pw, String cnpw) {
		maleRadioBtn.click();
		fnTf.sendKeys(fn);
		lnTf.sendKeys(ln);
		mailTf.sendKeys(mail);
		pwTf.sendKeys(pw);
		cnPwTf.sendKeys(cnpw);
		registerBtn.click();
	}
	
	public void PersonalDetailsFeMale(String fn, String ln, String mail, String pw, String cnpw) {
		femaleRadioBtn.click();
		fnTf.sendKeys(fn);
		lnTf.sendKeys(ln);
		mailTf.sendKeys(mail);
		pwTf.sendKeys(pw);
		cnPwTf.sendKeys(cnpw);
		registerBtn.click();
	}
	
}
