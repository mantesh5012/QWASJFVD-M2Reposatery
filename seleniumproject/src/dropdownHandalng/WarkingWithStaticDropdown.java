package dropdownHandalng;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import launchBrowser.ChromeBrowser;

public class WarkingWithStaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
	WebElement dropdown=driver.findElement(By.id("select3"));
          
          
	
	
	

	}

}

