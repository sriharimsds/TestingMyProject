package st.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import smarttrack.pages.HomePage;
import smarttrack.pages.LoginPage;
import smarttrack.parent.BaseParent;

public class LoginPageTestcases extends BaseParent{
	LoginPage lp;
	HomePage homepage;
	public LoginPageTestcases() {
		super();
		
	}
@BeforeMethod
public void setup() {
	intilization();
	lp=new LoginPage();
	
}
@Test(priority=2)
public void LoginPageTitleTestcase() {
	String title=lp.validateLoginTitle();
	Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
}
@Test(priority=1)
public void Loginbuttontestcase() {
	homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	
	

}









@AfterMethod
public void tear() {
	driver.quit();
	
}
}
