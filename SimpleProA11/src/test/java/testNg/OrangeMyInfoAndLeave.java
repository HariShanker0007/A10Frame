package testNg;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objRepository.OrangeHomepage;

public class OrangeMyInfoAndLeave extends BaseClass {
	
	@Test(groups = "smoke")
	public void myInfo() {
		OrangeHomepage ohp = new OrangeHomepage(driver);
		ohp.getMyInfo().click();
	}
	
	@Test(groups = "regression")
	public void leave() {
		OrangeHomepage ohp = new OrangeHomepage(driver);
		ohp.getLeave().click();
	}
}
