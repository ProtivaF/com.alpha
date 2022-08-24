package com.alpha.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.alpha.Utility.Baseclass5001;

public class SignuppageLocator5001 extends Baseclass5001 {
	
public SignuppageLocator5001() {
		
		PageFactory.initElements(driver, this );		
  }


@FindBy(how=How.ID, using="signin2")
public WebElement ClickSignup;

@FindBy(how=How.ID, using="sign-username")
public WebElement Username;

@FindBy(how=How.ID, using="sign-password")
public WebElement Password;


@FindBy(how=How.XPATH, using="//button[text()='Sign up']")
public WebElement ClickSignupbutton;

@FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/div[3]/button[1]")
public WebElement Close;



}
