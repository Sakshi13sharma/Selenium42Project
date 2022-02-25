package jackson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String []args )
	{
		// create driver object for chrome browser
		// We will strictly implement methods of webdriver 
		System.setProperty("webdriver.chrome.driver", "C:\\Course plans schedules\\418-Software testing\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		
		String expectedTitle = "Google";
        String actualTitle = "";
		//System.out.println(driver.getTitle());
		 // get the actual value of the title
        actualTitle = driver.getTitle();
        //1. to get the url
        System.out.println(driver.getCurrentUrl());
        // validate u landed on current url
        
        //2. to get the page source
        System.out.println(driver.getPageSource());
        //to get the page source
        
       
        //3. To navigate to next pages 
        
        driver.get("http://yahoo.com");
        driver.navigate().back();
        
        driver.navigate().forward();
        
        
        
        
        
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //4. to close current browser
        //driver.close();
	// close all browsers opened by selenium script
         // driver.quit();
		

	
	}
}
