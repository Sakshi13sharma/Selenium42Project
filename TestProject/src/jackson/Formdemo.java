package jackson;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formdemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Course plans schedules\\418-Software testing\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
			System.out.println(driver.getCurrentUrl());// validate u landed on same page 
			System.out.println(driver.getTitle());// provide title of the page
			
			// for the radio buttons -Gender
			 WebElement radio1 = driver.findElement(By.xpath("//input[@id='sex-0']"));							
		     WebElement radio2 = driver.findElement(By.xpath("//input[@id='sex-1']"));
		          
		        radio1.click();			
		        System.out.println("Radio Button Option 1 Selected");					
		        				       		
		        radio2.click();			
		        System.out.println("Radio Button Option 2 Selected");
		        System.out.println( radio1.isSelected());
		        
		        //for the Years of experience
		        
		        // For the Profession
		        WebElement manualT= driver.findElement(By.xpath("//input[@id='profession-0']"));
		        WebElement automationT = driver.findElement(By.xpath("//input[@id='profession-1']"));
		        
		        manualT.click();
		        
		        automationT.click();
		        //For the automation tools 
		        
		        WebElement option1 = driver.findElement(By.xpath("//input[@id='tool-0']"));							

         		
		        option1.click();			

		       	
		        if (option1.isSelected()) {					
		            System.out.println("Checkbox is Toggled On");					

		        } else {			
		            System.out.println("Checkbox is Toggled Off");					
		        }		
		         
		        Select drpContinents = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
		        //System.out.println(drpContinents);
		        drpContinents.selectByVisibleText("Africa");

	        
		        // FILEUPLOAD
		        ////input[@id='photo']
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Course plans schedules\\418-Software testing\\SELPIC.jpg");
		        		
	}
}
