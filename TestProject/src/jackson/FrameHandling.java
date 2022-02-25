package jackson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FrameHandling {
	  public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver",
					"C:\\Course plans schedules\\418-Software testing\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
	      String url = "https://the-internet.herokuapp.com/frames";
	      driver.get(url);
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // identify element
	      driver.findElement(By.linkText("Nested Frames")).click();
	      // switch to frame with frame name and identify inside element
	      driver.switchTo().frame("frame-bottom");
	      WebElement l = driver.findElement(By.cssSelector("body"));
	      System.out.println("Bottom frame text: " +l.getText());
	      // switch to main page
	      driver.switchTo().defaultContent();
	      driver.quit();
	   }
	}