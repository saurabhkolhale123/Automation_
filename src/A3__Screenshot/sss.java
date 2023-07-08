package A3__Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sss {
public static void main(String[] args) throws IOException {
	
	
WebDriver driver  =new ChromeDriver();

driver.get("https://www.flipkart.com/");

 
  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(src);
	
	File des=new File("D:\\study\\flip.jpg");
	
	FileHandler.copy(src, des);
}
}
