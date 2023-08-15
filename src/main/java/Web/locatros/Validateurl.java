package Web.locatros;

import Web.baceclass.baceclass;

public class Validateurl extends baceclass{
	
// Verify URL
	public  static void Verify_URL() {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(driver.getCurrentUrl().equalsIgnoreCase(url)) {
			System.out.println("The current url was matched");
		}else {
			System.out.println("The current url was not matched");
		}
		System.out.println("The current url is...." + driver.getCurrentUrl());
	}

// Verify getTitle
   public static void verify_Title() {
	String title = "OrangeHRM";
	if(driver.getTitle().equals(title)) {
		System.out.println("The title was matched");
	}
	else {
		System.out.println("The title was not matched");
	}
	System.out.println("The title is..." + driver.getTitle());
	}
}
