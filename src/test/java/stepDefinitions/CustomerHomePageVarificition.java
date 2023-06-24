package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLoginAndHomePage;
import pages.LandingPAGE;

public class CustomerHomePageVarificition extends Base{
	
	LandingPAGE landingPage = new LandingPAGE();
	CustomerLoginAndHomePage customerHomePage = new CustomerLoginAndHomePage();
	
	@Given("I am in landing page http:\\/\\/it.microtechlimited.com")
	public void i_am_in_landing_page_http_it_microtechlimited_com() {
		landingPage.navigateURL();
	}

	@When("I Click on Login menu")
	public void i_click_on_login_menu() {
		customerHomePage.click_Login();
	}

	@When("Click on Customer Login")
	public void click_on_customer_login() {
		customerHomePage.click_Customer_Login();
	}

	@Then("Enter User Id as {string}")
	public void enter_user_id_as(String string) {
		customerHomePage.enterUserId(string);
	}

	@Then("I Enter Password as {string}")
	public void i_enter_password_as(String string) {
		customerHomePage.enterUserPassword(string);
	}

	@Then("I Click on Login Button")
	public void i_click_on_login_button() {
		customerHomePage.clickLoginBtn();
	}

	@Then("Verify that I am in CUSTOMER Home Page")
	public void verify_that_i_am_in_customer_home_page() {
		String welcomeMsg=customerHomePage.getWelcomeText();
		assertEquals("Welcome David" , welcomeMsg);
	}

}
