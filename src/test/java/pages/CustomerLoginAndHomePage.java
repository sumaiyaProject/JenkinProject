package pages;

import org.openqa.selenium.By;

import base.Base;

public class CustomerLoginAndHomePage extends Base {

	By Login =By.xpath("//a[@href='elogin.php']");
	By clickCustomer=By.xpath("//a[text()='Customer Login']");
	By userId=By.name("mailuid");
	By userPassword=By.name("pwd");
	By login=By.xpath("//input[@name='login-submit']");
	By WelcomeDavid=By.xpath("//h2[text()='Welcome David']");
	
	
	public void click_Login() {
		click(Login);
	}
	public void click_Customer_Login() {
		click(clickCustomer);
	}
	public void enterUserId(String id) {
		//enterUserId.sendKeys(id);
		sendKeys(userId,id);
	}
	public void enterUserPassword(String Password) {
		sendKeys(userPassword,Password);
	}
	public void clickLoginBtn() {
		click(login);
	}
	public String getWelcomeText() {
		return getText(WelcomeDavid);
	}


}
