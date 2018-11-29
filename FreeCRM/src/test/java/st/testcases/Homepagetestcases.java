package st.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import smarttrack.pages.ContactsPage;
import smarttrack.pages.DealsPage;
import smarttrack.pages.TasksPage;
import smarttrack.parent.BaseParent;
import smarttrack.utilities.util;
import smarttrack.pages.HomePage;
import smarttrack.pages.LoginPage;

public class Homepagetestcases extends BaseParent {
	LoginPage lp;
	HomePage homepage;
	ContactsPage cp;
	TasksPage tp;
	DealsPage dp;
	
	public Homepagetestcases() {
		super();
	}
	
	
@BeforeMethod	
public void setup() {
	intilization();
	lp=new LoginPage();
	homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));	
}
@Test
public void validatecontacslink() {
	util.Swithchtoframe();
	homepage.validateContactslink();

	
}
@AfterMethod
public void tear() {
	driver.quit();
}	

}
