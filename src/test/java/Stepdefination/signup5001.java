package Stepdefination;

import com.alpha.Utility.Baseclass5001;
import com.alpha.action.HomePageAction5001;
import com.alpha.action.SignuppageAction5001;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signup5001 extends Baseclass5001{
	HomePageAction5001 homePageAction5001 = new HomePageAction5001();
	SignuppageAction5001 signuppageAction5001 = new SignuppageAction5001();
	
	@Then("^Verify signup functionality display in homepage$")
	public void verify_signup_functionality_display_in_homepage() throws Throwable {
		homePageAction5001.Verifysignupfunctionalitydisplayinhomepage();
	}

	@Then("^click signuplink$")
	public void click_signuplink() throws Throwable {
		homePageAction5001.clicksignuplink();
	  
	}

	@Then("^Verify signup page is display in signup page$")
	public void verify_signup_page_is_display_in_signup_page() throws Throwable {
		 signuppageAction5001.Verifysignuppageisdisplayinsignuppage();
	}

	@Then("^Verify signup page display with username and password field$")
	public void verify_signup_page_display_with_username_and_password_field() throws Throwable {
		signuppageAction5001.Verifysignuppagedisplaywithusernameandpasswordfield();
	}

	@Then("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
		signuppageAction5001.Verifyusercanwriteusernameandpasswordinsignuppage(prop5001.getProperty("Username"),prop5001.getProperty("Password"));
	}

	@Then("^Verify user can write username and password in signup page$")
	public void verify_user_can_write_username_and_password_in_signup_page() throws Throwable {
		signuppageAction5001.Verifyusercanwriteusernameandpasswordinsignuppage();
	}

	@When("^Click signup button$")
	public void click_signup_button() throws Throwable {
		signuppageAction5001 .Clicksignupbutton();
	}

	@Then("^Verify user can signup successfully$")
	public void verify_user_can_signup_successfully() throws Throwable {
		homePageAction5001.Verifyusercansignupsuccessfully();
	}

	@Then("^keep username and password filed empty$")
	public void keep_username_and_password_filed_empty() throws Throwable {
		signuppageAction5001.keepusernameandpasswordfiledempty();
	}

	@Then("^Verify user cannot signup without username and password$")
	public void verify_user_cannot_signup_without_username_and_password() throws Throwable {
		signuppageAction5001.Verifyusercannotsignupwithoutusernameandpassword();
	}


}
