package pages;

import org.openqa.selenium.By;

import base.Base;

public class CustomerProfileUpdatePage extends Base {
	By UpdateInfo = By.xpath("//button[@name='send']");
	By UpdateInfolevel = By.xpath("//h2[text()='Update Customer Info']");
	By UpdateContact = By.xpath("//input[@name='contact']");
	By UpdateAddress = By.xpath("//input[@name='address']");
	By submit = By.xpath("//button[@name='update']");
	By updatedCont = By.name("contact");
	By updatedAddress = By.name("address");

	public void click_Update_Info() {
		click(UpdateInfo);
		
	}

	public String fname() {
		return getText(UpdateInfolevel);
	}

	public void UpdateContact() {
		clear(UpdateContact);
	}

	public void cname(String name) {
		sendKeys(UpdateContact, name);
	}

	public void UpdateAddress() {
		clear(UpdateAddress);
	}

	public void aname(String name) {
		sendKeys(UpdateAddress, name);
	}

	public void submitbtn() {
		click(submit);
	}

	public String UpdatedCont(String contact) {
		return getAttributeValue(updatedCont, contact);
	}

	public String UpdatedAddress(String name) {
		return getAttributeValue(updatedAddress, name);
	}
}
