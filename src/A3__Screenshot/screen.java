package A3__Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen {

public static void main(String[] args) throws IOException {
	

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://www.gmail.com/");

    
  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   System.out.println(src);
   
   File des=new File("D:\\study\\ab.jpg");
   
   FileHandler.copy(src, des);










}
}