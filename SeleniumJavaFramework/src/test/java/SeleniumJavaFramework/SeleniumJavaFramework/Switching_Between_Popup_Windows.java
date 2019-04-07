package SeleniumJavaFramework.SeleniumJavaFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switching_Between_Popup_Windows {

    public static void main(String[] args) {
    	//need to Add Wait condition manually[[[[[[[[
    	System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
        WebDriver driver = new FirefoxDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
       
    }

}
