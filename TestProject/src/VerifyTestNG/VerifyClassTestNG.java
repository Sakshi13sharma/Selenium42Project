package VerifyTestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
///3990458

import org.testng.annotations.Test;

public class VerifyClassTestNG {
	
	public WebDriver driver;
  @Test(priority = -1)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Course plans schedules\\418-Software testing\\chromedriver.exe");
		
	  driver = new ChromeDriver();
	  
  }
  @Test(priority = 0)
  public void launchBrowser() {
  String expectedTitle = "Omnivox- cegep de";
  driver.get("https://www.omnivox.com/");
  String actualTitle = driver.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle);
  }

  @Test(dependsOnMethods = {"launchBrowser"}, priority =3)

  public void closeBrowser() {

   

 // driver.quit();

  }

  }