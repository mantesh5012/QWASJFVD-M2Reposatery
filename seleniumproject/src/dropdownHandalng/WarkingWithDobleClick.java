package dropdownHandalng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WarkingWithDobleClick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		//creat the object actions class
		Actions act = new Actions(driver);
		//useb doublle click method
		act.contextClick(driver.findElement(By.id("btn20"))).perform();
	//Thread.sleep(3000);
		
		//close the broser
		driver.quit();
		
		
	}
				
}
