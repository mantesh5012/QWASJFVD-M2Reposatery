package AssignmentLocater;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrkingWithDemoappRagistati {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(200);
		driver.findElement(By.id("name")).sendKeys("mantesh");
		driver.findElement(By.id("email")).sendKeys("manteshparit9697");
		driver.findElement(By.id("password")).sendKeys("mango123");
		driver.findElement(By.className("Register")).click();
		
		
		
	}
}