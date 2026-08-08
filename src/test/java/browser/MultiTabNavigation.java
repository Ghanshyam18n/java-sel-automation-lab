package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTabNavigation {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String[] urls = 
		
			{	
		        "https://www.india.gov.in/",
		        "https://github.com/Ghanshyam18n"
		   };
		
	    boolean firsturl = true;
	    
		for(String url : urls) {
			
			if(!firsturl) {
			driver.switchTo().newWindow(WindowType.TAB);
			}
			
			System.out.println("Launch "+url);
			driver.get(url);
			firsturl = false;
		}
	}

}
