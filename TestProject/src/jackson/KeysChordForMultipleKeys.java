package jackson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysChordForMultipleKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Course plans schedules\\418-Software testing\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://www.google.com/");
	      //identify element
	      WebElement l = driver.findElement(By.name("q"));
	      l.sendKeys("Java");
	      // method Keys.chord
	      String k = Keys.chord(Keys.CONTROL, "A");
	      //handling multiple keys
	      l.sendKeys(k);
	   }
	}