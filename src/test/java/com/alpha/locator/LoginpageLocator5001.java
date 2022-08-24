package com.alpha.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.alpha.Utility.Baseclass5001;

public class LoginpageLocator5001 extends Baseclass5001{
	
public LoginpageLocator5001() {
		PageFactory.initElements(driver, this );		
  }

@FindBy(how=How.XPATH, using="//h5[text()='Log in']")
public WebElement loginpage;

@FindBy(how=How.ID, using="loginusername")
public WebElement Username;

@FindBy(how=How.ID, using="loginpassword")
public WebElement Password;

@FindBy(how=How.XPATH, using="//button[text()='Log in']")
public WebElement Clickloginbutton;



}
