package second.priority.org;

import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.firefox.FirefoxDriver;			
import org.testng.Assert;			
import org.testng.annotations.Test;			

public class Demo_of_TestNG_code_without_Priority {		
    WebDriver driver;			
    String driverPath = "/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/";

	    // Method 1: Open Browser say Firefox			
	    @Test		
	    public void openBrowser() {	
	        System.setProperty("webdriver.gecko.driver", driverPath);
            driver = new FirefoxDriver();				
	    }		

	    // Method 2: Launch Google.com			
	    @Test		
	    public void launchGoogle() {				
	        driver.get("http://www.google.co.in");						
	    }		
        
	    // Method 3: Perform a search using "Facebook"			
	    @Test		
	    public void peformSeachAndClick1stLink() {				
	        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");								
	    }		

	    // Method 4: Verify Google search page title.			
	    @Test		
	    public void FaceBookPageTitleVerification() throws Exception {				
	        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
	        Thread.sleep(3000);		
	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
	    }		
	}		
