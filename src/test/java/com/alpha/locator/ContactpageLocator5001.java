package com.alpha.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.alpha.Utility.Baseclass5001;

public class ContactpageLocator5001 extends Baseclass5001{
	
public ContactpageLocator5001() {
		
		PageFactory.initElements(driver, this );		
  }

@FindBy(how=How.ID, using="recipient-email")
public WebElement Email; 


@FindBy(how=How.ID, using="recipient-name")
public WebElement name; 

@FindBy(how=How.ID, using="message-text")
public WebElement message;

@FindBy(how=How.XPATH, using="//button[text()='Send message']")
public WebElement sendmessage;


}
