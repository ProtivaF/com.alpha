 package com.alpha.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.alpha.Utility.Baseclass5001;

public class HomePageLocator5001 extends Baseclass5001 {
	
	public  HomePageLocator5001 () { //this is constructor method 
		
		PageFactory.initElements(driver, this );//everything you find from the pagefactory is a class given by selenium
			
	}
	
	 @FindBy(how=How.LINK_TEXT, using="Contact")
     public WebElement clickcontact;
	 
	
	 @FindBy(how=How.XPATH, using="//a[text()='Home ']")
     public WebElement homepagedisplay;
	 
	 
	 @FindBy(how=How.XPATH, using="//a[text()='Home ']")
     public WebElement DisplaySignup;
	 
	 @FindBy(how=How.ID, using="signin2")
	 public WebElement ClickSignup;
	
	 @FindBy(how=How.LINK_TEXT, using="Log in")
	 public WebElement Clicklogin;
}

