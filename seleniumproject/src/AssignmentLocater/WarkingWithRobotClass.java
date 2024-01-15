package AssignmentLocater;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import warkingwithActionClass.ActionClaas;

public class WarkingWithRobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		act.contextClick().perform();
		

	}

}
