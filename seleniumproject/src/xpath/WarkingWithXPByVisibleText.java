package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWithXPByVisibleText {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			//maximize browser
			driver.manage().window().maximize();
			//launch thre web application
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='✕']")).click();

	}

}
