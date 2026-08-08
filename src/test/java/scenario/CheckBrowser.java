package scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrowser {
	public static void main(String[] args) {
		WebDriver driver = null;
		
		String[] browsers = {"Chrome", "Edge"};
		
		for(String browser : browsers ) {
			if(browser.equals("Chrome")) {
				driver = new ChromeDriver();
				System.out.println(browser+" found");
			}
		}
	}

}
