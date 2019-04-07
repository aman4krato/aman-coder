package loactors.job.autoamtion.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_and_click_radio_button {
	public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");

		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();
			
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
		driver.close();

}
}
