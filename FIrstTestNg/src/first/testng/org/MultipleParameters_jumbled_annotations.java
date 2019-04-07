package first.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleParameters_jumbled_annotations {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/";
	    public WebDriver driver ; 
	     @AfterTest                            //Jumbled
	      public void terminateBrowser(){
	          driver.close();
	      }
	     @BeforeTest                            //Jumbled
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          System.setProperty("webdriver.gecko.driver", driverPath);
	          driver = new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	      @Test                                //Jumbled
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      
}
