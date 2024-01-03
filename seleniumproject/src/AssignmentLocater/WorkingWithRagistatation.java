package AssignmentLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRagistatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch thre web application
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Mantesh");
		driver.findElement(By.id("LastName")).sendKeys("parit");
		driver. findElement(By.id("Email")).sendKeys("manteshparit9697@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("smith@111");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("smith@111");
		driver.findElement(By.id("register-button")).click();		
		
		

	}

}
