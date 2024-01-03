package AssignmentLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.function.CheckedRunnable;
import webElamentInterfaceMethods.WarkingWithsSendKeys;

public class WarkingWithDemodApps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		WebElement requiredfield = driver.findElement(By.name("requiredfield"));
		requiredfield.sendKeys("mantesh parit");
		driver.findElement(By.name("password")).sendKeys("mantes");
	    driver.findElement(By.name("confirmpass")).sendKeys("mantes");
	    driver.findElement(By.name("email")).sendKeys("mantesh@123");
	    driver.findElement(By.name("url")).sendKeys("mantes");
	    driver.findElement(By.name("digits")).sendKeys("12345678");
	    driver.findElement(By.name("number")).sendKeys("1234567891");
	    driver.findElement(By.name("alphanum")).sendKeys("man123");
	    
	    driver.findElement(By.name("minLength")).sendKeys("mantesh");
	    driver.findElement(By.name("maxLength")).sendKeys("mantes");
	    driver.findElement(By.name("rangeLength")).sendKeys("mantesh");
	    


	    
	    
	    
	   
	
		
		

	}

}
