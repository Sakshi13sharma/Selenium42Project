package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUPAuthentication {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Course plans schedules\\418-Software testing\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
	      String u = "admin";
	      // adding username, password with URL
	      String str = "https://" + u + ":" + u + "@" +
	      "the-internet.herokuapp.com/basic_auth";
	      driver.get(str);
	      // identify and get text after authentication of popup
	      String t = driver.findElement(By.cssSelector("p")).getText();
	      System.out.println("Text is: " + t);
	      //driver.quit();
	   }
	}