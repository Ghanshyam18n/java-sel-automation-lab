package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LauchUrls {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String[] urls = {
				"https://google.com.com",
				"https://github.com/Ghanshyam18n",
				"https://samsung.com"
		};
		
		for(String url : urls) {
			if(url.equals("https://samsung.com")) {
				System.out.println("Lanched "+url);
				driver.get("https://samsung.com");
			}
			else if(url.equals("https://github.com/Ghanshyam18n")) {
				System.out.println("Lauchn "+url);
				driver.get("https://github.com/Ghanshyam18n");
			}
			else if(url.equals("https://google.com.com")) {
				System.out.println("Launch "+url);
				driver.get("https://google.com.com");
			}
				
		}
		
	}

}
