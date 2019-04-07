package SeleniumJavaFramework.SeleniumJavaFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Switch_frames_example {
	  public static void main(String[] args) {
	    	System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
		  	WebDriver driver = new FirefoxDriver();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close(); 
	    }
}