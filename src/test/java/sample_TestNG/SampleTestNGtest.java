package sample_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGtest {

	
	@Test(priority=1)
	void setup() {
		
		System.out.println("This is setup method");
		Assert.fail();
	}
	
	@Test(enabled = false)
	void login() {
		
		System.out.println("This is login method");
			
	}
	
	@Test(priority=0, dependsOnMethods = {"setup"}, alwaysRun = true)
	void close() {
		
		System.out.println("This is close method");
			
	}
	
	
	@BeforeMethod
	void beforeMethod() {
		
		System.out.println("This is before method in SampleTestNGtest_@BeforeMethod");
		
	}
	
	@AfterMethod
void AfterMethod() {
		
		System.out.println("This is After method in SampleTestNGtest_@AfterMethod");
		
	}
	@BeforeClass
void beforeClass() {
		
		System.out.println("This is before class in SampleTestNGtest_@BeforeClass");
		
		
	}
@AfterClass
void afterClass() {
	
	System.out.println("This is after class in SampleTestNGtest_@AfterClass");
	
	
}

@BeforeTest
void beforeTest() {
	
	System.out.println("This is before test in SampleTestNGtest_@Beforetest");
	
	
}
@AfterTest
void afterTest() {
	
	System.out.println("This is after Test in SampleTestNGtest_@AfterTest");
	
	
}

@BeforeSuite
void beforeSuite() {
	
	System.out.println("This is before suite in SampleTestNGtest_@Beforesuite");
	
	
}
@AfterSuite
void afterSuite() {
	
	System.out.println("This is after Suite in SampleTestNGtest_@AfterSuite");
	
	
}

void noAnnotation() {
	System.out.println("This one has no annotation in SampleTestNGtest");
}
	
}
