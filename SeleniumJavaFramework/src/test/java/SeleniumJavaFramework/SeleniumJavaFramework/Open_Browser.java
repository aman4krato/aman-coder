package SeleniumJavaFramework.SeleniumJavaFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 class Open_Browser {


    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.actitime.com/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        driver.close();
       
    }

}