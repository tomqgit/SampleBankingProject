package sample_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingInTestNG {
	
	@Test (groups= {"Sanity"})
	void beforeMethod() {
		
		System.out.println("This is before method in SampleTestNGtest_@BeforeMethod");
		
	}
	
	@Test (groups= {"Sanity"})
void AfterMethod() {
		
		System.out.println("This is After method in SampleTestNGtest_@AfterMethod");
		
	}
	@Test (groups= {"Sanity"})
void beforeClass() {
		
		System.out.println("This is before class in SampleTestNGtest_@BeforeClass");
		
		
	}
	@Test (groups= {"Regression"})
void afterClass() {
	
	System.out.println("This is after class in SampleTestNGtest_@AfterClass");
	
	
}

	@Test (groups= {"Regression"})
void beforeTest() {
	
	System.out.println("This is before test in SampleTestNGtest_@Beforetest");
	
	
}
	@Test (groups= {"Sanity" , "Regression"})
void afterTest() {
	
	System.out.println("This is after Test in SampleTestNGtest_@AfterTest");
	
	
}

	@Test (groups= {"Smoke"})
void beforeSuite() {
	
	System.out.println("This is before suite in SampleTestNGtest_@Beforesuite");
	
	
}
	@Test (groups= {"Smoke"})
void afterSuite() {
	
	System.out.println("This is after Suite in SampleTestNGtest_@AfterSuite");
	
	
}
	@Test (groups= {"Sanity", "Smoke" , "Regression"})
void noAnnotation() {
	System.out.println("This one has no annotation in SampleTestNGtest");
}
	
	

}
