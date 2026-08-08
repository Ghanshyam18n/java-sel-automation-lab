package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTabNavigation {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String[] urls = 
		
			{	
		        "https://samsung.com",
		        "https://github.com/Ghanshyam18n"
		   };
		
		for(String url : urls) {
			
			driver.switchTo().newWindow(WindowType.TAB);
			System.out.println("Launch "+url);
			driver.get(url);

		}
	}

}
