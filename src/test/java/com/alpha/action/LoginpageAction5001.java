package com.alpha.action;

import org.testng.Assert;

import com.alpha.Utility.Baseclass5001;
import com.alpha.locator.LoginpageLocator5001;

public class LoginpageAction5001 extends Baseclass5001 {
	
	LoginpageLocator5001 loginpageLocator5001 = new LoginpageLocator5001();
	
public void Verifyloginoptiondisplaywithusernameandpasswordinloginpage() throws Exception {
	boolean display=loginpageLocator5001 .loginpage.isDisplayed();
	Assert.assertTrue(display);
	Thread.sleep(3000);	
	}
	
public void Enterusernameandpasswordandclicklogin(String n, String p) throws Exception {
	loginpageLocator5001.Username.sendKeys(n);
	loginpageLocator5001.Password.sendKeys(p);
	Thread.sleep(3000);
	loginpageLocator5001.Clickloginbutton.click();
	Thread.sleep(3000);
	}

public void Enterinvalidusernameandinvalidpasswordandclicklogin (String In, String Ip) throws Exception {
	loginpageLocator5001.Username.sendKeys(In);
	loginpageLocator5001.Password.sendKeys(Ip);
	loginpageLocator5001.Clickloginbutton.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
}

public void Verifyuserloginnotsuccessfulwithinvalidusernameandpassword() throws Exception {
    boolean display=loginpageLocator5001.Clickloginbutton.isDisplayed();
	Assert.assertTrue(display);
	Thread.sleep(3000);
}

}
