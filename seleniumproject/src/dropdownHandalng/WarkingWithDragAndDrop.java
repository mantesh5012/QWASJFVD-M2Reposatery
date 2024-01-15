package dropdownHandalng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WarkingWithDragAndDrop {
	public class WarkingWithDobleClick {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
			//drag web element
			WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
			//drop tha web element
			WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
			Actions act = new Actions(driver);
			Thread.sleep(3000);
			act.dragAndDrop(drag, drop).perform();
			Thread.sleep(3000);

}
}
}