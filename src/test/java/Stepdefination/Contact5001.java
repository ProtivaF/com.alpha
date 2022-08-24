package Stepdefination;

import com.alpha.Utility.Baseclass5001;
import com.alpha.action.ContactpageAction5001;
import com.alpha.action.HomePageAction5001;
import com.alpha.locator.ContactpageLocator5001;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Contact5001 extends Baseclass5001{
	HomePageAction5001 homePageAction5001 = new HomePageAction5001();//create object to access actionclass
	ContactpageAction5001 contactpageAction5001 = new ContactpageAction5001();
	ContactpageLocator5001 contactpageLocator5001 = new ContactpageLocator5001();
	
	@Given("^Launch application \"([^\"]*)\"$")
	public void launch_application(String URL) throws Throwable {
     getURL5001(URL);	
	}

	@Then("^Verify contact functionality display in hoepage$")
	public void verify_contact_functionality_display_in_hoepage() throws Throwable {
		 homePageAction5001.Verifycontactfunctionalitydisplayinhoepage();
	}

	@Then("^click contactlink$")
	public void click_contactlink() throws Throwable {
		 homePageAction5001.clickcontactlink();
		
	}

	@Then("^Verify contact page is display in contact page$")
	public void verify_contact_page_is_display_in_contact_page() throws Throwable {
		contactpageAction5001.Verifycontactpageisdisplayincontactpage(); 
	}

	@Then("^Verify contact page display with email,name and message field$")
	public void verify_contact_page_display_with_email_name_and_message_field() throws Throwable {
		contactpageAction5001.Verifycontactpagedisplaywithemailnameandmessagefield();
	}

	@Then("^enter email, name and message$")
	public void enter_email_name_and_message() throws Throwable {
		contactpageAction5001.Verifyusercanwriteemailnameandmessageincontactpage(prop5001.getProperty("Email"),prop5001.getProperty("Name"),prop5001.getProperty("Message"));
	 
	}

	@Then("^Verify user can write email, name and message in contact page$")
	public void verify_user_can_write_email_name_and_message_in_contact_page() throws Throwable {
		contactpageAction5001.Verifyusercanwriteemailnameandmessageincontactpage();
	}

	@Then("^click send message$")
	public void click_send_message() throws Throwable {
		contactpageAction5001.clicksendmessage();
	   
	}

	@Then("^Verify user can send message successfully$")
	public void verify_user_can_send_message_successfully() throws Throwable {
		homePageAction5001.Verifyusercansendmessagesuccessfully();
	}

}


