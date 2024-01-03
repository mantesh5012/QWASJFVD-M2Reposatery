package webElamentInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWithsSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//div[text()='Tasks']")).click();
        
        driver.findElement(By.linkText("Projects & Customers")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SBI");
        driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();

	}

}
