package com.SampleBankingProject.testCases;


import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SampleBankingProject.pageObjects.LoginPage;

public class TC_Login_TC001 extends BaseClass {
	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("UID entered");
		lp.setPassword(pasword);
		logger.info("Pwd entered");
		lp.clickSubmit();
		System.out.println(driver.getTitle());		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			System.out.println("IF statement");
			Assert.assertTrue(true);
			logger.info("The title matches");
				}
		else {
			System.out.println("Else statement");
			Assert.assertTrue(false);
			logger.info("The title doesn't match");
		}
	}
	

}
