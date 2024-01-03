package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarkingWitrhLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch thre web application
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();

	}

}
