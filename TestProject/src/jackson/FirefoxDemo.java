package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Course plans schedules\\418-Software testing\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://cegepgim.omnivox.ca/Login/Account/Login?L=ANG");
		System.out.println(driver1.getTitle());

		driver1.findElement(By.xpath("//*[@id=\'Identifiant\']")).sendKeys("777");
		
		// whenever xpath starts with html, its not correct ,avoid using in tht situation 
		driver1.findElement(By.cssSelector("#Password")).sendKeys("aa");
	}

}
