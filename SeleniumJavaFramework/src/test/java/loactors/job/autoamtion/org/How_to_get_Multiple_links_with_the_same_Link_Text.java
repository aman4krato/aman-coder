package loactors.job.autoamtion.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class How_to_get_Multiple_links_with_the_same_Link_Text {
	public static void main(String[] args) {								
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
    	System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
        WebDriver driver = new FirefoxDriver();					
        		
        driver.get(baseUrl);					
        String theLinkText = driver.findElement(By					
                .partialLinkText("egis"))			
                .getText();		
        System.out.println(theLinkText);					
        theLinkText = driver.findElement(By					
                .partialLinkText("EGIS"))			
                .getText();		
        System.out.println(theLinkText);					

        driver.quit();		
    }
}
