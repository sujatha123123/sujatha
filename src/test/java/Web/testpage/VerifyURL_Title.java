package Web.testpage;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Screenshot.screenshots;
import Web.baceclass.baceclass;
import Web.locatros.Validateurl;

public class VerifyURL_Title extends baceclass{
	
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
