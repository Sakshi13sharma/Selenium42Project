package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce4Chrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Course plans schedules\\418-Software testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=ca");
		driver.findElement(By.id("username")).sendKeys("This is username");
		driver.findElement(By.id("password")).sendKeys("This is pswd");
		//driver.findElement(By.className("button r4 wide primary")).click();
		// error as compond classes r nt allowed,there shud nt be spaces
		// 2. FInding elements by xpath
		// xpath can be find in different ways
		// Double quotes inside double quotes are not accepted in java so change to
		// single quotes the xpath
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		/*Validating For validating css use $("")

		//*[@id='forgot_password_link']

		$x("//*[@id='forgot_password_link']")

		CSS

		#mydomainLink

		$("#mydomainLink")
*/
	 driver.findElement(By.cssSelector("div#error.loginError")).getText();
		
		System.out.println (driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//By selecting the cssSelector - No direct way to get css selector in chrome. YOu just get from highlighting 
		
	}
}
