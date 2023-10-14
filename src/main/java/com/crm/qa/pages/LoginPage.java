package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage  extends TestBase{


	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement UsernameTestBox;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement PasswordTestBox;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//b[normalize-space()='home']")
	WebElement HomeLable;
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public String LoginPageTitle() {
		
		return driver.getTitle();

	}
	
	
	public HomePage  Login(String username, String Passwored) {
		
	UsernameTestBox.sendKeys(username);
	PasswordTestBox.sendKeys(Passwored);
	LoginButton.click();
	
	return new HomePage();
	}
	
	public Boolean HomeLableDisplayed() {
		return HomeLable.isDisplayed();
	}
	
	
}
