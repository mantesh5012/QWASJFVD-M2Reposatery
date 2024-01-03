package sinchronizatin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WarkingWithImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(51));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		//driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("123123");
		//driver.findElement(By.xpath("//button[@ id='Check']")).click();
	
		
		

	}

}
