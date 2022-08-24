 package com.alpha.action;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.alpha.Utility.Baseclass5001;
import com.alpha.locator.HomePageLocator5001;

public class HomePageAction5001 extends Baseclass5001 {
	
	HomePageLocator5001 homePageLocator5001 = new HomePageLocator5001();
	
	public void Verifycontactfunctionalitydisplayinhoepage() throws Exception {
	boolean display= homePageLocator5001.clickcontact.isDisplayed();
	Assert.assertTrue(display);
	Thread.sleep(3000);	
	}
	
	public void clickcontactlink() throws Exception {
		
		 homePageLocator5001.clickcontact.click();
		 Thread.sleep(3000);
	}
	
	public void Verifyusercansendmessagesuccessfully() throws Exception {
		
	boolean	homepage=homePageLocator5001.homepagedisplay.isDisplayed();
	Assert.assertTrue(homepage);
	Thread.sleep(3000);
	}
	
	public void Verifysignupfunctionalitydisplayinhomepage() throws Exception {
	boolean Signupdisplay =	homePageLocator5001.DisplaySignup.isDisplayed();
	Assert.assertTrue(Signupdisplay);
	Thread.sleep(3000);
	}
	
    public void clicksignuplink() throws Exception {
		
	homePageLocator5001.ClickSignup.click();
		Thread.sleep(3000);		
    }

    public void Verifyusercansignupsuccessfully() throws Exception {
	
    boolean	displayed=homePageLocator5001.homepagedisplay.isDisplayed();
    Assert.assertTrue(displayed);
    Thread.sleep(3000);	
    }
    
    public void  Clickloginlink() throws Exception {
    	 homePageLocator5001.Clicklogin.click();
    	 Thread.sleep(3000);	
    }
	
	
	
	
	

}

