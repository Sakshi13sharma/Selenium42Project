package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Course plans schedules\\418-Software testing\\geckodriver.exe");
		
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
		System.out.println(driver1.getTitle());
		
		driver1.findElement(By.id("email")).sendKeys("This is my first test");
		driver1.findElement(By.name("pass")).sendKeys("this is password");
	   //driver1.findElement(By.linkText("Forgot account?")).click();
	// Every object may not have ids, class name or name, Xpath and CSS preferred
		//Alphanumeric id may vary on every refresh 
		//class names shud nt hv spaces
	}



}
