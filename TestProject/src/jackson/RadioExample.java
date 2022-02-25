package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {
	 public static void main(String[] args) {									
 		
	    		
		 System.setProperty("webdriver.chrome.driver", "C:\\Course plans schedules\\418-Software testing\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();					

	        driver.get("http://demo.guru99.com/test/radio.html");					
	        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
	        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
	        		
	       	
	        radio1.click();			
	        System.out.println("Radio Button Option 1 Selected");					
	        		
	       		
	        radio2.click();			
	        System.out.println("Radio Button Option 2 Selected");					
	        		
	     	
	        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

	         		
	        option1.click();			

	       	
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
	         
	        		
	        		
	        //Selecting Checkbox and using isSelected Method		
	        driver.get("http://demo.guru99.com/test/facebook.html");					
	        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
	        for (int i=0; i<2; i++) {											
	            chkFBPersist.click (); 			
	            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
	        }		
			//driver.close();		
	        		
	    }		
	}