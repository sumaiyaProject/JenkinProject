package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.CustomerProfilePage;
import pages.CustomerProfileUpdatePage;

public class CustomerProfileUpdateVarificition extends Base{
	
	CustomerProfilePage custProfile = new CustomerProfilePage();
	CustomerProfileUpdatePage custUpdateInfo = new CustomerProfileUpdatePage();
	
	@Then("I will click My Profile")
	public void i_will_click_my_profile() {
		custProfile.click_MyProfile();
	}

	@Then("I will click update info")
	public void i_will_click_update_info() {
		custUpdateInfo.click_Update_Info();
	}

	@Then("I see {string} page")
	public void i_see_page(String string) {
		assertEquals("Update Customer Info",custUpdateInfo.fname()); 
	}

	@Then("I update contact")
	public void i_update_contact() {
		custUpdateInfo.UpdateContact();
		
		custUpdateInfo.cname("0123456789");
	
	}

	@Then("I update address")
	public void i_update_address() {
		custUpdateInfo.UpdateAddress();
		
		custUpdateInfo.aname("123 test road,TX");
		
	}

	@Then("I click submit button")
	public void i_click_submit_button() {
		custUpdateInfo.submitbtn();
	}

	@Then("I will click refresh url")
	public void i_will_click_refresh_url() {
		driver.navigate().refresh();
	}

	@Then("I will see updated contact")
	public void i_will_see_updated_contact() {
		System.out.println("updated value "+custUpdateInfo.UpdatedCont("value"));
		
		assertEquals("0123456789", custUpdateInfo.UpdatedCont("value"));
	}

	@Then("I will see updated address")
	public void i_will_see_updated_address() {
		System.out.println("updated value "+custUpdateInfo.UpdatedAddress("value"));
	
		assertEquals("123 test road,TX", custUpdateInfo.UpdatedAddress("value"));
	}

}
