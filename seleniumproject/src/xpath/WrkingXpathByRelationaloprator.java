package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrkingXpathByRelationaloprator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(4000);
       driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'or@name='username']")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'and@type='password']")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[@type='submit'or@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

}

