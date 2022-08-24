package Stepdefination;

import com.alpha.Utility.Baseclass5001;
import com.alpha.action.HomePageAction5001;
import com.alpha.action.LoginpageAction5001;
import com.alpha.action.ProfilepageAction5001;

import cucumber.api.java.en.Then;

public class Login5001 extends Baseclass5001 {
	HomePageAction5001 homePageAction5001 = new HomePageAction5001();
	LoginpageAction5001 loginpageAction5001 = new LoginpageAction5001();
	ProfilepageAction5001 profilepageAction5001 = new ProfilepageAction5001();

	
	@Then("^Click loginlink$")
	public void click_loginlink() throws Throwable {
		homePageAction5001.Clickloginlink();
	   
	}

	@Then("^Verify login option display with username and password in login page\\.$")
	public void verify_login_option_display_with_username_and_password_in_login_page() throws Throwable {
		loginpageAction5001.Verifyloginoptiondisplaywithusernameandpasswordinloginpage();
	}

	@Then("^Enter user name and password and click login$")
	public void enter_user_name_and_password_and_click_login() throws Throwable {
		loginpageAction5001 .Enterusernameandpasswordandclicklogin(prop5001.getProperty("Username"), prop5001.getProperty("Password"));
		
	}

	@Then("^Verify user Profile Page display with valid username and password\\.$")
	public void verify_user_Profile_Page_display_with_valid_username_and_password() throws Throwable {
		 profilepageAction5001.VerifyuserProfilePagedisplaywithvalidusernameandpassword();
	}

	@Then("^Enter invalid username and invalid password and click login$")
	public void enter_invalid_username_and_invalid_password_and_click_login() throws Throwable {
		loginpageAction5001.Enterinvalidusernameandinvalidpasswordandclicklogin(prop5001.getProperty("InvalidUsername"),prop5001.getProperty("InvalidPassword"));
	}

	@Then("^Verify user login not successful with invalid username and password$")
	public void verify_user_login_not_successful_with_invalid_username_and_password() throws Throwable {
		loginpageAction5001.Verifyuserloginnotsuccessfulwithinvalidusernameandpassword();
	}

	@Then("^Enter invalid username and valid password and click login$")
	public void enter_invalid_username_and_valid_password_and_click_login() throws Throwable {
	
	}

	@Then("^Verify user login not successful with invalid username and valid password$")
	public void verify_user_login_not_successful_with_invalid_username_and_valid_password() throws Throwable {
	 
	}

	@Then("^Enter valid username and invalid password and click login$")
	public void enter_valid_username_and_invalid_password_and_click_login() throws Throwable {
	
	}

	@Then("^Verify user login not successful with valid username and invalid password$")
	public void verify_user_login_not_successful_with_valid_username_and_invalid_password() throws Throwable {

	}

	@Then("^keep username and password filed empty and click login$")
	public void keep_username_and_password_filed_empty_and_click_login() throws Throwable {

	}

	@Then("^Verify user wont be able to login without username and password$")
	public void verify_user_wont_be_able_to_login_without_username_and_password() throws Throwable {
	
	}

	@Then("^enter password and click login$")
	public void enter_password_and_click_login() throws Throwable {
	 
	}

	@Then("^Verify user wont be able to login without username$")
	public void verify_user_wont_be_able_to_login_without_username() throws Throwable {
	
	}

	@Then("^enter username and click login$")
	public void enter_username_and_click_login() throws Throwable {
	   
	}

	@Then("^Verify user wont be able to login without password$")
	public void verify_user_wont_be_able_to_login_without_password() throws Throwable {
	    
	}


	
}	