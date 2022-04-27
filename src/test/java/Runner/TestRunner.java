package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("F:\\Java-Selenium\\com.webservice\\test-output\\com Tests\\testng-failed.xml");
		TestNG runner = new TestNG();
		
		runner.setTestSuites(list);
		
		runner.run();
	}

}
