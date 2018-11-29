package st.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import smarttrack.pages.SignupPage;
import smarttrack.parent.BaseParent;
import smarttrack.utilities.util;

public class Signuptestcases extends BaseParent {

	SignupPage su;
	String sheetName="Signup";
	public Signuptestcases()
	{
		super();
	}
	
@BeforeMethod

public void setup() {
	intilization();
	su= new SignupPage();
}

@Test(priority=1)
public void navigatesignup() {
	su.navigatetoSignupPage();
}

@Test(priority=2)

public void validateSUTC() {
	su.navigatetoSignupPage();
	String signuptitle= su.ValidateSinguppage();
	//System.out.println(signuptitle);
Assert.assertEquals(signuptitle, "CRMPRO - CRM Pro for customer relationship management, sales, and support");			
}

@DataProvider

	public Object[][] getCRMTestData() {
	Object Data[][]=util.getTestData(sheetName);
	return Data;	
	}

@Test(priority=3,dataProvider="getCRMTestData")
public void Formtestcases(String firstname,String lastname,String email,String confirmemail,String username, String password, String confirmpassword)
 {
	su.navigatetoSignupPage();
	su.validateForm(firstname,lastname,email,confirmemail,username,password,confirmpassword);
	
	
}

@AfterMethod
public void tear() {
	driver.quit();
}
}
