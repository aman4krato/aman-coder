package handling.tables.org;

import java.text.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class Fetch_cell_value_of_a_particular_row_and_column_of_the_Dynamic_Table {
	 public static void main(String[] args) throws ParseException {
	    	WebDriver wd;
	  	   System.setProperty("webdriver.gecko.driver","/home/amandeep/eclipse-workspace/SeleniumJavaFramework/BrowserDriver/GeckoDriver/geckodriver/");   	
	 	  wd= new FirefoxDriver();
			 wd.get("http://demo.guru99.com/test/web-table-element.php"); 
			 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WebElement baseTable = wd.findElement(By.tagName("table"));
			  
			 //To find third row of table
			 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
	         String rowtext = tableRow.getText();
			 System.out.println("Third row of table : "+rowtext);
			    
			    //to get 3rd row's 2nd column data
			    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
			    String valueIneed = cellIneed.getText();
			    System.out.println("Cell value is : " + valueIneed); 
			    wd.close();
	    }
}
