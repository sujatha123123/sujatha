package Web.testpage;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Screenshot.screenshots;
import Web.baceclass.baceclass;
import Web.locatros.Login_functionality;
import Web.locatros.Validateurl;

public class Validate_Login extends baceclass{
	
    @Test(priority = 0)
    public void Verify_Printer() {
    	System.out.println("Welcome to TestNG framework");
    }
    @Test(priority = 1)
    public void Validate_URL() {
    	Validateurl.Verify_URL();	
    }
    @Test(priority = 2)
    public void Validate_Title() {
    Validateurl.verify_Title();
    }
    
    @Test(priority = 3)
    public void Validate_Text() throws InterruptedException {
    	Login_functionality.Validate_Text();
    }
    @Test(priority = 4)
    public void Validate_username_pass() throws InterruptedException {
        Login_functionality.Validate_username(prop.getProperty("fname"));
        Login_functionality.Validate_password(prop.getProperty("lname"));
}
  
	@Test(priority = 5)
	public void Validate_LoginClick() throws InterruptedException {
		Login_functionality.Validate_LoginButton();
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
	}
}
