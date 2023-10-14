package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;


public class LandingPageTest  extends TestBase{
	
	LandingPage LandingPage;
	LoginPage LoginPage;
	
	
	public LandingPageTest() throws IOException {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		 LandingPage = new LandingPage();
	}
	
	
	@Test 
	public void checkLandingPageTitle() {
		String LandingpageTitle = LandingPage.pageTitle();
		assertEquals(LandingpageTitle, "#1 Free CRM Power Up your Entire Business Free Forever");
	}
	
	@Test
	public void CheckLoginButton() throws IOException {
		LoginPage = LandingPage.clickLoginButton();
		String LoginPageTitle = LoginPage.LoginPageTitle();
		assertEquals(LoginPageTitle,"Cogmento CRM");

	}
	
@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
