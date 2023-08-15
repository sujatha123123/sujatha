package Web.locatros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Web.baceclass.baceclass;
import Web.utils.Wait_Commands;

public class error_Validation extends baceclass{

static By error = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
static By error1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
static By error2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");

	//error 1
	public static String validateError() throws InterruptedException {
		Wait_Commands.waitForVisiblityofallelements(error);	
		WebElement element = driver.findElement(error);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(2000);
		return text;
	}
	
	public static String validateError_one() throws InterruptedException {
		Wait_Commands.waitForVisiblityofallelements(error1);
		WebElement element = driver.findElement(error1);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(2000);
		return text;	
}
public static String validateError_two() throws InterruptedException {
Wait_Commands.waitForVisiblityofallelements(error2);
WebElement element = driver.findElement(error2);
String text = element.getText();
System.out.println(text);
Thread.sleep(2000);
return text;
}
}
