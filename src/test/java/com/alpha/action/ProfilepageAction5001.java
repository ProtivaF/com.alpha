package com.alpha.action;

import org.testng.Assert;

import com.alpha.Utility.Baseclass5001;
import com.alpha.locator.ProfilepageLocator5001;

public class ProfilepageAction5001 extends Baseclass5001 {
	ProfilepageLocator5001 profilepageLocator5001 = new ProfilepageLocator5001();
	
	public void VerifyuserProfilePagedisplaywithvalidusernameandpassword() throws Exception {
	boolean	display = profilepageLocator5001.Welcome.isDisplayed();
	Assert.assertTrue(display);
	Thread.sleep(3000);	
	}

}
