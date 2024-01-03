package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWithCccSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch thre web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//identify user name with css selector
		driver.findElement(By.cssSelector("[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type=submit]")).click();

	}

}
