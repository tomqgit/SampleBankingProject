package com.SampleBankingProject.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "http://demo.guru99.com/v4";
	public String username = "mngr298394";
	public String pasword = "gAmagUg";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Step1 logger");
		logger = Logger.getLogger("SampleBankingProject.log");
		System.out.println("Step2 logger");
		PropertyConfigurator.configure("log4j.properties");
		System.out.println("Step3 logger");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
