package loactors.job.autoamtion.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Accessing_links_using_Partial_Text_Match 
{
	public static void main(String[] args) 
	{									
        String baseUrl = "http://demo.guru99.com/test/accessing-link.html";					
    	System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
        WebDriver driver = new FirefoxDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("here")).click();					
        System.out.println("Title of page is: " + driver.getTitle());							
        driver.quit();		

     }
	
}
