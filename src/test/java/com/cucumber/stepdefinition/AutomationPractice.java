package com.cucumber.stepdefinition;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.testrunner.testrunner;

import BaseClass.BaseClass;
import POM.AutomationPracticePOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AutomationPractice extends BaseClass {

	@Then("^User need to validate the page logo$")
	public void user_need_to_validate_the_page_logo() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		isDisplay(ap.getLogo());
	}

	@Then("^User need to validate the signin button and click$")
	public void user_need_to_validate_the_signin_button_and_click() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		isEnabled(ap.getSignIn());
		singleClick(ap.getSignIn());
	}

	@Then("^User need to validate the email id field and enter the valid email id$")
	public void user_need_to_validate_the_email_id_field_and_enter_the_valid_email_id() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getEmail().sendKeys("della@gmail.com");
	}

	@And("^User need to validate the password feild and enter the valid password$")
	public void user_need_to_validate_the_password_feild_and_enter_the_valid_password() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getPassword().sendKeys("emmu@26");
	}

	@And("^User need to validate the submit button and click$")
	public void user_need_to_validate_the_submit_button_and_click() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		isDisplay(ap.getSubmitButton());
		isEnabled(ap.getSubmitButton());
		ap.getSubmitButton().click();
		System.out.println("Logged in successfully");

	}

	@Then("^User need to move the mouse to the product catagery women$")
	public void user_need_to_move_the_mouse_to_the_product_catagery_women() throws Throwable {
		System.out.println("Order 1:");
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		mouseHover(ap.getWomenIcon());

	}

	@Then("^User need to select Blouse catagery$")
	public void user_need_to_select_Blouse_catagery() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getBlouseIcon().click();

	}

	@Then("^User need to select the product by clicking more button$")
	public void user_need_to_select_the_product_by_clicking_more_button() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		mouseHover(ap.getProductImage());
		ap.getMoreButtonForProductDetails().click();

	}

	@Then("^User need to validate the product title$")
	public void user_need_to_validate_the_product_title() throws Throwable {
		Assert.assertTrue(getTitle().contains("Blouse"));
	}

	@Then("^User need to select the quantity,size and colour of the product$")
	public void user_need_to_select_the_quantity_size_and_colour_of_the_product() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		Random r = new Random();
		int i = r.nextInt(6);
		System.out.println(i);
		for (int j = 1; j < i; j++) {
			ap.getQuantityIncrementIcon().click();
		}
		String valueOf = String.valueOf(i);
		String attributeValue = getAttributeValue(ap.getProductQuantityCheck(), "value");
		Assert.assertEquals(valueOf, attributeValue);
		singleDropDown(ap.getProductSize(), 0, null, "M");
		ap.getProductColour().click();
	}

	@Then("^User need to click the add to cart button$")
	public void user_need_to_click_the_add_to_cart_button() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getAddToCart().click();
		System.out.println("Product added Successfully");
	}

	@Then("^User need to proceed to checkout to next page$")
	public void user_need_to_proceed_to_checkout_to_next_page() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getProceed1().click();
	}

	@Then("^User need to scroll the page down$")
	public void user_need_to_scroll_the_page_down() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		scrollToPageDown(ap.getProceed2());
		ap.getProceed2().click();
	}

	@Then("^User need to validate the address for shipping$")
	public void user_need_to_validate_the_address_for_shipping() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getAddressCheck().click();
	}

	@Then("^User need to select the checkbox$")
	public void user_need_to_select_the_checkbox() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getCheckBox().click();
		ap.getProceed3().click();

	}

	@Then("^User need to choose the payment option$")
	public void user_need_to_choose_the_payment_option() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getPayment().click();
		ap.getProceed4().click();
	}

	@Then("^User need to check whether orderplaced or not and validate the order text$")
	public void user_need_to_check_whether_orderplaced_or_not_and_validate_the_order_text() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		String elementText = getElementText(ap.getOrderConfiramtion());
		Assert.assertEquals("Your order on My Store is complete.", elementText);
		System.out.println("Order confirmed");
	}

	@Then("^User need to go to order history and get order number$")
	public void user_need_to_go_to_order_history_and_get_order_number() throws Throwable {
		AutomationPracticePOM ap = new AutomationPracticePOM(driver);
		ap.getOrderHistoryPage().click();
		String orderNumber = getElementText(ap.getOrderNumber());
		System.out.println(orderNumber);
	}
@Then("^User need to logout the page and validate signin button$")
public void logout() {
	AutomationPracticePOM ap = new AutomationPracticePOM(driver);
	ap.getLogout().click();
	Assert.assertEquals("Sign in", getElementText(ap.getLoginButton()));
	System.out.println("Successfully logged out");
}
}
