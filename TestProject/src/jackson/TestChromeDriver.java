package jackson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestChromeDriver {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//1. Give me the count of links on the page.
		//2. Count of footer section-
		System.setProperty("webdriver.gecko.driver",
				"C:\\Course plans schedules\\418-Software testing\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com/practice.php");
	}
}