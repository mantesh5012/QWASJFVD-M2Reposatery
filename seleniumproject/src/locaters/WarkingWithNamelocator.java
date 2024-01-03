package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWithNamelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch thre web application
		driver.get("http://mandesktop-5g34i0q/login.do");
		//identify user name 
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify the passward
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify the login button
		driver.findElement(By.id("loginButton")).click();
		
		
		

	}

}
