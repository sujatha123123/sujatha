package Web.locatros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Web.baceclass.baceclass;
import Web.utils.Wait_Commands;

public class Login_functionality extends baceclass {
	
	static By alltext = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]");
	static By uname = By.name("username");
	static By pass = By.name("password");
	static By login = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	//verify home page text
	public static String Validate_Text() throws InterruptedException {
		Wait_Commands.waitForVisiblityofallelements(alltext);
		WebElement element = driver.findElement(alltext);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
	}
//	Verify Username
	public static void Validate_username(String naa) throws InterruptedException {
		Wait_Commands.waitForVisiblityofallelements(uname);
		WebElement element = driver.findElement(uname);
		boolean b = element.isDisplayed();
		if(b) {
			System.out.println(b);
		}
		element.click();
		Thread.sleep(5000);
		element.clear();
		Thread.sleep(5000);
		element.sendKeys(naa);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(5000);
	}
	//verify Password
		public static void Validate_password(String na) throws InterruptedException  {
			Wait_Commands.waitForVisiblityofallelements(pass);
			WebElement element = driver.findElement(pass);
			boolean b = element.isDisplayed();
			if(b) {
				System.out.println(b);
			}
			element.click();
			Thread.sleep(3000);
			element.clear();
			Thread.sleep(5000);
			element.sendKeys(na);
			System.out.println(element.getAttribute("value"));
			System.out.println(element.getAttribute("type"));
			Thread.sleep(5000);
		}
		//verify Login
		public static String Validate_LoginButton() throws InterruptedException {
			Wait_Commands.waitForVisiblityofallelements(login);
			WebElement element = driver.findElement(login);
			boolean b = element.isDisplayed();
			if(b) {
				System.out.println(b);
			}
			String text = element.getText();
			System.out.println(text);
			element.click();
			Thread.sleep(5000);
			return text;
		}
}
