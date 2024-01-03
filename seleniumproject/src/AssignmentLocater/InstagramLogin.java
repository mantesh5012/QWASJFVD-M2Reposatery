package AssignmentLocater;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import launchBrowser.ChromeBrowser;

public class InstagramLogin {
	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch the instgram
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("manteshparit9697@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mantesh@5012");
		driver.findElement(By.className("_acap")).click();
		
	}

}
