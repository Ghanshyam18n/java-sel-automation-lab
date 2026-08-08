package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
Store browser names and launch each browser using Selenium.   
   print launching + Browser name.
 
 */
public class LaunchingBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		String[] browserName = {
				
				"Chrome", "Edge"
		};
		
		for(String browser : browserName) {
			
			if(browser.equals("Chrome")) {
			System.out.println("Launching "+browser);
			 driver = new ChromeDriver();
		}
			else if(browser.equals("Edge")) {
				System.out.println("Launching "+browser);
				driver = new EdgeDriver();
			}
	}
	
	}
}
