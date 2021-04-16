package test.driver;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestExecutionDriver {
	
	public static void main(String [] args)
	{
		TestNG testNG = new TestNG();
		/*testNG.setDefaultSuiteName("SoftCo");
		testNG.setDefaultTestName("Test Search");
		testNG.setTestClasses(new Class[] {test.unittests.TestSearchPerUserInParallel.class});*/
		List<String> suiteList = new ArrayList<String>();
		suiteList.add("testng.xml");
		testNG.setTestSuites(suiteList);
		testNG.run();
	}
}
