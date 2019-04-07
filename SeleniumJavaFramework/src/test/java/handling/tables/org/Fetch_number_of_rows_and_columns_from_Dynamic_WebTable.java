package handling.tables.org;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_number_of_rows_and_columns_from_Dynamic_WebTable {
	public static void main(String[] args) throws ParseException {
    	WebDriver wd;
 	   System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
	  wd= new FirefoxDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
        List<WebElement>  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List<WebElement>  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        wd.close();
    }
}
