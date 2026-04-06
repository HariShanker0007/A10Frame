package testNg;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objRepository.OrangeHomepage;

public class OrangeClaim extends BaseClass {
	
	@Test(groups = "smoke")
	public void claim() {
		OrangeHomepage ohp = new OrangeHomepage(driver);
		ohp.getclaim().click();
	}
}
