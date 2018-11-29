package smarttrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttrack.parent.BaseParent;

public class SignupPage extends BaseParent{

// Add the repositories for the sign up page
	@FindBy(xpath="//section[@id='services']//div[@class='row']//div[1]//a[1]")
	WebElement signup;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
    @FindBy(name="surname")	
    WebElement lastname;  
    
    @FindBy(name="email")
    WebElement email;
    
    @FindBy(xpath="//input[@placeholder='Confirm Email']")
    WebElement Cemail;
    
    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement username;
    
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement password;
    
    @FindBy(xpath="//input[@placeholder='Confirm Password']")
    
    WebElement Cpassword;
    
    @FindBy(xpath="//input[@name='agreeTerms']")
    WebElement Agreement;
    
    @FindBy(xpath="//div[@class='myButton']")
    WebElement submitbtn;
    
    public SignupPage() {
    	PageFactory.initElements(driver, this);
    }
    
    public SignupPage navigatetoSignupPage() {
    	driver.navigate().to(prop.getProperty("registrationurl"));
    	return new SignupPage();
    }
    
     public String ValidateSinguppage()
    {
    	return driver.getTitle();
    }
    
  
    public LoginPage validateForm(String FN,String LN,
    		String mail,String cnfrmemail, String un,String pwd,String cnfrmpwd) {
    firstname.sendKeys(FN);
    lastname.sendKeys(LN);
    email.sendKeys(mail);
    Cemail.sendKeys(cnfrmemail);
    username.sendKeys(un);
    password.sendKeys(pwd);
    Cpassword.sendKeys(cnfrmpwd);
    Agreement.click();
    submitbtn.isDisplayed();
    return new  LoginPage();
    
}

    
    
    
    
    
    
}
