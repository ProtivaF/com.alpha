package com.alpha.action;

import org.testng.Assert;

import com.alpha.Utility.Baseclass5001;
import com.alpha.locator.SignuppageLocator5001;

public class SignuppageAction5001 extends Baseclass5001{
	SignuppageLocator5001 signuppageLocator5001 = new SignuppageLocator5001();
	
	public void Verifysignuppageisdisplayinsignuppage() throws Exception {
	boolean displayed =	signuppageLocator5001.ClickSignup.isDisplayed();	
	Assert.assertTrue(displayed);	
	Thread.sleep(3000);
	}
	
	public void Verifysignuppagedisplaywithusernameandpasswordfield() throws Exception {
	boolean	displayed = signuppageLocator5001.Password.isDisplayed();
	Assert.assertTrue(displayed);
	Thread.sleep(3000);
		
	}
	
	public void Verifyusercanwriteusernameandpasswordinsignuppage(String n, String p) throws Exception {
		 signuppageLocator5001.Username.sendKeys(n);
		 signuppageLocator5001.Password.sendKeys(p);
		 Thread.sleep(3000);	
	}
	
	public void  Verifyusercanwriteusernameandpasswordinsignuppage() throws Exception {
	boolean display =signuppageLocator5001.Username.isDisplayed();
	Assert.assertTrue(display);	
	Thread.sleep(3000);
	}
	
	public void Clicksignupbutton() throws Exception {
		signuppageLocator5001.ClickSignupbutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void keepusernameandpasswordfiledempty() throws Exception {
		signuppageLocator5001.Username.click();
		signuppageLocator5001.Password.click();
		signuppageLocator5001.ClickSignupbutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void Verifyusercannotsignupwithoutusernameandpassword() throws Exception {
		
	boolean	close=signuppageLocator5001.Close.isDisplayed();
	Assert.assertTrue(close);
	Thread.sleep(3000);
	signuppageLocator5001.Close.click();
	Thread.sleep(3000);
	
	

	}
	


}
