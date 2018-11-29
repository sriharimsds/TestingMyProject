package smarttrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttrack.parent.BaseParent;

public class HomePage extends BaseParent{

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement Contactslink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement Dealslink;
	
	@FindBy(xpath="//a[contains(text().'Tasks')]")
	WebElement tasklink;
	
	
	@FindBy(xpath="//a[contains(text(),'Schedule Call')]")
	WebElement schedulecall;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
public ContactsPage validateContactslink() {
	
	Contactslink.click();

	return new ContactsPage();
	
	
}
	
}
