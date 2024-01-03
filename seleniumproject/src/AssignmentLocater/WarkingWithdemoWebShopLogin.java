package AssignmentLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWithdemoWebShopLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch thre web application
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("manteshparit9697@gamail.com");
	driver.findElement(By.id("Password")).sendKeys("mantesh");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
	

	}

}
