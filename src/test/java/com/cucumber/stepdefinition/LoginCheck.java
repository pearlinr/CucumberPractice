package com.cucumber.stepdefinition;

import org.testng.Assert;

import BaseClass.BaseClass;
import POM.LoginCheckPOM;
import cucumber.api.java.en.Then;

public class LoginCheck extends BaseClass {
	@Then("^User need to validate the page logo$")
	public void user_need_to_validate_the_page_logo() throws Throwable {
		LoginCheckPOM lc = new LoginCheckPOM(driver);
		isDisplay(lc.getLogo());

	}

	@Then("^User need to validate the signin button and click$")
	public void user_need_to_validate_the_signin_button_and_click() throws Throwable {
		LoginCheckPOM lc = new LoginCheckPOM(driver);
		isEnabled(lc.getSignIn());
		singleClick(lc.getSignIn());
	}

	@Then("^User need to validate the email id field and enter the valid email id \"([^\"]*)\"$")
	public void user_need_to_validate_the_email_id_field_and_enter_the_valid_email_id(String emailid) throws Throwable {
		LoginCheckPOM lc = new LoginCheckPOM(driver);
		KeysToSend(emailid, lc.getEmail());
	}

	@Then("^User need to validate the password feild and enter the valid password \"([^\"]*)\"$")
	public void user_need_to_validate_the_password_feild_and_enter_the_valid_password(String password)
			throws Throwable {
		LoginCheckPOM lc = new LoginCheckPOM(driver);
		KeysToSend(password, lc.getPassword());
	}

	@Then("^User need to validate the submit button and click$")
	public void user_need_to_validate_the_submit_button_and_click() throws Throwable {
		LoginCheckPOM lc = new LoginCheckPOM(driver);
		isEnabled(lc.getSubmitButton());
		singleClick(lc.getSubmitButton());
	}

	@Then("^User need to validate the username \"([^\"]*)\" and pass the message \"([^\"]*)\"$")
	public void user_need_to_validate_the_username_and_pass_the_message(String userName, String message) throws Throwable {
		LoginCheckPOM lc = new LoginCheckPOM(driver);
		Assert.assertEquals(getElementText(lc.getUserName()), userName);
		System.out.println(message);
	}

	@Then("^User need to logout the page and validate signin button$")
	public void user_need_to_logout_the_page_and_validate_signin_button() throws Throwable {
		LoginCheckPOM lc = new LoginCheckPOM(driver);
		singleClick(lc.getLogout());
		Assert.assertEquals(getElementText(lc.getLoginButton()), "Sign in");
		System.out.println("Successfully logged out");

	}
}
