package locaters;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWithIdLocater {
	public static void main(String[] args) {
		//launch the web browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("http://mandesktop-5g34i0q/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		
		driver.findElement(By.id("loginButton")).click();
	}

}
