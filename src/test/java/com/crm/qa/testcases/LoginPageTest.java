package com.crm.qa.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LandingPage LandingPage;
	LoginPage LoginPage;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		LandingPage = new LandingPage();

	}
	
	
	@Test	
	public void Login() throws IOException {
		
		LoginPage = LandingPage.clickLoginButton();
		LoginPage.Login(Properties.getProperty("username"), Properties.getProperty("password"));
		
		Boolean HomeLableIsDisplayed = LoginPage.HomeLableDisplayed();
		assertTrue(HomeLableIsDisplayed);	
		
	}
	
	
	
	@AfterMethod
	private void tearDown() {
		driver.quit();
	}

}
