package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	
	//PageFactory
	
	@FindBy(xpath = "//a[contains(@href,'https://freecrm.com/')]")
	WebElement crmLogo;
	
	
	@FindBy(xpath = "//span[normalize-space()='Log In']")
	WebElement loginbButton;

	public LandingPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	
	}
	
	public String pageTitle() {
		return driver.getTitle();		
	}
	
	public Boolean ecrmLogo() {
		
		return crmLogo.isDisplayed();
	}
	
	public LoginPage clickLoginButton () throws IOException {
		loginbButton.click();
		return new LoginPage();
		
	}

}
