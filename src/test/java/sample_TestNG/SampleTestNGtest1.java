package sample_TestNG;

import org.testng.annotations.*;

public class SampleTestNGtest1 {

	@Test(priority=1)
	void setup1() {
		
		System.out.println("This is setup1 method in SampleTestNGtest1_@test");
		
	}
	
	@Test
	void login1() {
		
		System.out.println("This is login1 method in SampleTestNGtest1_@test");
			
	}
	
	@Test(priority=0)
	void close1() {
		
		System.out.println("This is close1 method in SampleTestNGtest1_@test");
		
			
	}
	
	@BeforeMethod
	void beforeMethod() {
		
		System.out.println("This is before method in SampleTestNGtest1_@BeforeMethod");
		
	}
	
	@AfterMethod
void AfterMethod() {
		
		System.out.println("This is After method in SampleTestNGtest1_@AfterMethod");
		
	}
	@BeforeClass
void beforeClass() {
		
		System.out.println("This is before class in SampleTestNGtest1_@BeforeClass");
		
		
	}
@AfterClass
void afterClass() {
	
	System.out.println("This is after class in SampleTestNGtest1_@AfterClass");
	
	
}

@BeforeTest
void beforeTest() {
	
	System.out.println("This is before test in SampleTestNGtest1_@Beforetest");
	
	
}
@AfterTest
void afterTest() {
	
	System.out.println("This is after Test in SampleTestNGtest1_@AfterTest");
	
	
}

@BeforeSuite
void beforeSuite() {
	
	System.out.println("This is before suite in SampleTestNGtest1_@Beforesuite");
	
	
}
@AfterSuite
void afterSuite() {
	
	System.out.println("This is after Suite in SampleTestNGtest1_@AfterSuite");
	
	
}

void noAnnotation() {
	System.out.println("This one has no annotation in SampleTestNGtest1");
}

}
