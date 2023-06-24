package pages;

import org.openqa.selenium.By;

import base.Base;

public class CustomerProfilePage extends Base{
	By MyProfile = By.xpath("//a[text()='My Profile']");
	By MyInfo = By.xpath("//h2[text()='My Info']");
	By firstName = By.xpath("//p[text()='First Name']");
	By LastName = By.xpath("//p[text()='Last Name']");
	By email = By.xpath("//p[text()='Email']");
	By birthdate = By.xpath("//p[text()='Date of Birth']");
	By gender = By.xpath("//p[text()='Gender']");
	By contact = By.xpath("//p[text()='Contact Number']");
	By address = By.xpath("//p[text()='Address']");
	
	public void click_MyProfile() {
		click(MyProfile);
	}
	 public String get_MyInfo() { 
		 return getText(MyInfo);
	 }
	 public String fname() { 
		 return getText(firstName);
	 }
	 public String lname() { 
		 return getText(LastName);
	 }
	 public String ename() { 
		 return getText(email);
	 }
	 public String bname() { 
		 return getText(birthdate);
	 }
	 public String gname() { 
		 return getText(gender);
	 }
	 public String cname() { 
		 return getText(contact);
	 }
	 public String aname() { 
		 return getText(address);
	 }
}

