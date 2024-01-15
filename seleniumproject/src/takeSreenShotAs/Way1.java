package takeSreenShotAs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.apple.com/iphone-15-pro/");
     //explict type type casting
        TakesScreenshot ts =(TakesScreenshot)driver;
     // to use getScreenshotAs Method
        File src = ts.getScreenshotAs(OutputType.FILE);
        

      //create a new file and pass the path where you want to store you screenshot
        File dest = new File("./screenshot/iphone.png");
     // copy from src to dest
        Files.copy(src, dest);
        
    
        
	}

}