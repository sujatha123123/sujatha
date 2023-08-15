package Web.utils;

import org.openqa.selenium.JavascriptExecutor;
import Web.baceclass.baceclass;

public class Page_scrolling  extends baceclass{
	public static void page_one() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)"," ");
	}
	public static void page_two() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,400)"," ");
	}
	public static void page_three() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(400,600)"," ");
	}
	public static void page_four() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(600,800)"," ");
	}
	public static void pageup_one() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)"," ");
	}
	public static void pageup_two() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,-200)"," ");
	}
	public static void pageup_three() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,-300)"," ");
	}
	public static void pageup_four() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(800,-300)"," ");
	}

}
