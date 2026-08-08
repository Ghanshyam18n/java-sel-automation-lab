package scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginTest {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://viazen.pro/demo.html");
	
	String[] users = {"Admin", "Manager", "Staff", "Client"};
	
	    for(String user : users) {
	    	System.out.println("Login as "+user);
	    	
	    	if(user.equals("Admin")) {
	    		//enter Admin ID & Password
	    	}
	    	else if(user.equals("Manager")) {
	    		//enter manager ID and Password
	    	}
	    	else if(user.equals("Staff")) {
	    		//enter staff ID and password
	    	}
	    	else if(user.equals("Client")) {
	    		// enter client p
	    	}
	    }
	}
}
