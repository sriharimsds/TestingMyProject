package smarttrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttrack.parent.BaseParent;

public class LoginPage extends BaseParent {
	// inherit the properties of parent class 
	
// Page Factory- OR----> now take all 'xpaths' of the elements.

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement Loginbutton;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement Signup;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
public String validateLoginTitle() {
	return driver.getTitle();
	
}
public HomePage login(String un,String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	Loginbutton.submit();
	return new HomePage();	
}
}

