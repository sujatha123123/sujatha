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

public class assert_Validation extends baceclass {
	

 @Test(priority = 0)
 public void Verify_Printer() {
	 System.out.println("Welcome to TestNG framework");
 }
 @Test(priority = 1)
 public void Validate_URL() {
 Validateurl.Verify_URL();
 Validateurl.verify_Title();
}

@Test(priority = 2)
public void Validate_Text() throws InterruptedException {
	String actu = Login_functionality.Validate_Text();
	String expe = "Login\n" + "Username : Admin\n" + "Password : admin123\n" +
			 "Username\n" + "Password\n" + "Login\n" + "Forgot your password?\n" + "\n" +
			 "OrangeHRM OS 5.5\n" + "Â© 2005 - 2023 OrangeHRM, Inc. All rights reserved.";
			 Assert.assertEquals(actu, expe);	 		 
}			 
@Test(priority = 3)
public void Validate_usrname_nagativeone() throws InterruptedException {
Login_functionality.Validate_username(prop.getProperty("fname"));
Login_functionality.Validate_password(prop.getProperty("lname"));
//Assert.assertEquals(Login_functionality.Validate_LoginButton(), "Login")
String act = Login_functionality.Validate_LoginButton();
String exp = "Login";
Assert.assertEquals(act, exp);
}
@AfterMethod
public void Screenshot(ITestResult result) {
	screenshots.ScreenshotTCF(result);
}
@BeforeClass
public void OpeBrowser() {
	OpenWindow();
}
@AfterClass
public void closewindow() {
	TearDown();
}}
