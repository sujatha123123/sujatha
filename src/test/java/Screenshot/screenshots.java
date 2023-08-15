package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import Web.baceclass.baceclass;

public class screenshots extends baceclass {
	

	public static void ScreenshotTCF(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("ScreenShots/Screenshot"+result.getClass()+"_OF_"+result.getName()+".png");
				FileUtils.copyFile(source, dest);
				System.out.println("The Screenshot taken as....."+result.getName());
			} catch (Exception e) {
				System.out.println("the screenshot exception is....."+e.getMessage());
			}
		}

	}

}



