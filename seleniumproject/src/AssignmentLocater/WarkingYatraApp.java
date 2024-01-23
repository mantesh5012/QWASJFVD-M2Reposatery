package AssignmentLocater;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WarkingYatraApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stubwe
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		driver.findElement(By.id("BE_hotel_destination_city")).sendKeys("goa");
		driver.findElement(By.xpath("//input[@name='hotel_checkin_date']")).click();
		driver.findElement(By.xpath("//input[@id='BE_hotel_checkin_date']")).click();
		
		
		

	}

}
