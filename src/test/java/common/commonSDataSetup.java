package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonSDataSetup {

	@BeforeSuite
	public void datasTearDown() {
		System.out.println("Common data setup");
	}
	@AfterSuite
	public void dataTearDown() {
		System.out.println("common data cleanup");
	}
}

