package Web.testpage;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Screenshot.screenshots;
import Web.baceclass.baceclass;
import Web.locatros.Login_functionality;
import Web.locatros.Validateurl;
import Web.locatros.error_Validation;

public class SendkeysMethod extends baceclass {
	

	@Test(priority = 0)
	public void Verify_Printer() {
		System.out.println("Welcome to TestNG framework");
	}
	@Test(priority = 1)
	public void Validate_URl() throws InterruptedException {
		Validateurl.Verify_URL();
		Validateurl.verify_Title();
	}
	@Test(priority = 2)
	public void Validate_Text() throws InterruptedException {
		Login_functionality.Validate_Text();
	}
	@Test(priority = 3)
	public void Validate_username_nagetiveone() throws InterruptedException {
		Login_functionality.Validate_username(prop.getProperty("u1"));
		Login_functionality.Validate_password(prop.getProperty("p1"));
		Assert.assertEquals(Login_functionality.Validate_LoginButton(), "Login");
		error_Validation.validateError();
	}
	@Test(priority = 4)
	public void Validate_username_nagetivetwo() throws InterruptedException {
		Login_functionality.Validate_username(prop.getProperty("u2"));
		Login_functionality.Validate_password(prop.getProperty("p2"));
		String actu = Login_functionality.Validate_LoginButton();
		String exp = "Login";
		Assert.assertEquals(actu, exp);
		error_Validation.validateError();
	}
	@Test(priority = 5)
	public void Validate_username_nagetivethree() throws InterruptedException {
		Login_functionality.Validate_username(prop.getProperty("u3"));
		Login_functionality.Validate_password(prop.getProperty("p3"));
		Login_functionality.Validate_LoginButton();
		error_Validation.validateError_one();
		error_Validation.validateError_two();
	}
	@Test(priority = 6)
	public void Validate_username_Valid() throws InterruptedException {
		Login_functionality.Validate_username(prop.getProperty("fname"));
		Login_functionality.Validate_password(prop.getProperty("lname"));
		Login_functionality.Validate_LoginButton();
	}
	@AfterMethod
	public void Screenshot(ITestResult result) {
		screenshots.ScreenshotTCF(result);
	}
	
	@BeforeClass
	public void OpenBrowser() {
		OpenWindow();
	}
	@AfterClass
	public void closewindow() {
		TearDown();
	}
}
