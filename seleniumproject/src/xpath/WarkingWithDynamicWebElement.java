package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWithDynamicWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contain@,'Pke_EE']")).sendKeys("iphone",Keys.ENTER);
		driver.get("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']");
        System.out.println("iPhonePrice.getText()");
      
	}

}
