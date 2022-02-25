package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {
	public static void main(String []args )
	{

	// create driver object for chrome browser
			// We will strictly implement methods of webdriver 
			System.setProperty("webdriver.chrome.driver", "C:\\Course plans schedules\\418-Software testing\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("http://facebook.com");
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("This is my first test");
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("this is password");
		//   driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
			
			// to generate the xpath
			
			//The syntax is 
			// tagname[@attribute='value']
			
			
			// copy the innerhtml to check tagnames
}
}
//button[@id='u_0_d_Gt']