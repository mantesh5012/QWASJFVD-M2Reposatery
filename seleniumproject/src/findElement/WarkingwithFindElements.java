package findElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingwithFindElements {
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone",Keys.ENTER);
		{
		driver.get("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']");
        System.out.println("iPhonePrice.getText()");

}
}
}