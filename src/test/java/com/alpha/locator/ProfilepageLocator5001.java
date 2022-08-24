package com.alpha.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.alpha.Utility.Baseclass5001;

public class ProfilepageLocator5001 extends Baseclass5001{
	
	public ProfilepageLocator5001() {
		PageFactory.initElements(driver, this );		
  }
	
	@FindBy(how=How.ID, using="nameofuser")
	public WebElement Welcome;

}
