package pages;
import org.openqa.selenium.By;

import base.Base;

public class LandingPAGE extends Base {
	
	By WelcomeText = By.xpath("//h1[text()='Welcome to MicroTech NA.']");
	
	public void navigateURL() {
		driver.get("https://it.microtechlimited.com/index.html");		
	}
	
	public String welcomeText() {
		return getText(WelcomeText);
	}
}
