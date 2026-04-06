package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.DummyBase;

public class Dummy {
	@Test(enabled = false)
	public void dummySetup() {
		Reporter.log("Checking Base Class",true);
	}
	@Test(dependsOnMethods ="dummySetup" )
	public void dummySetup1() {
		Reporter.log("Checking Browser",true);
	}
}
