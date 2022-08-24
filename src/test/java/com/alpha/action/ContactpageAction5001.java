package com.alpha.action;

import org.testng.Assert;

import com.alpha.Utility.Baseclass5001;
import com.alpha.Utility.utility5001;
import com.alpha.locator.ContactpageLocator5001;

public class ContactpageAction5001 extends Baseclass5001 {
	
	ContactpageLocator5001 contactpageLocator5001 = new ContactpageLocator5001();
	
	public void Verifycontactpageisdisplayincontactpage() throws Exception {
		boolean display= contactpageLocator5001.Email.isDisplayed();
		Assert.assertTrue(display);
		utility5001.takescreenshot(driver,"contact page");
		Thread.sleep(5000);
	}
	
	public void Verifycontactpagedisplaywithemailnameandmessagefield() throws Exception {
	boolean	display=contactpageLocator5001.message.isDisplayed();
	utility5001.takescreenshot(driver,"name");
	Assert.assertTrue(display);	
	Thread.sleep(5000);
	
	}
	
	public void  Verifyusercanwriteemailnameandmessageincontactpage(String a, String b, String c) throws Exception {
		contactpageLocator5001.Email.sendKeys(a);
		contactpageLocator5001.name.sendKeys(b);
		contactpageLocator5001.message.sendKeys(c);
		Thread.sleep(5000);
	}
	
	public void Verifyusercanwriteemailnameandmessageincontactpage() throws Exception {
	boolean display =contactpageLocator5001.sendmessage.isDisplayed();	
	Assert.assertTrue(true);	
	Thread.sleep(5000);
	}
	
	public void clicksendmessage() throws Exception {
		contactpageLocator5001.sendmessage.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
		
		
	}


