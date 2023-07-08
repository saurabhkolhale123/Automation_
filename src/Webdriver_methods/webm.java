package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webm {public static void main(String[] args) {
	

WebDriver driver = new ChromeDriver();

    driver.get("https://www.facebook.com/");

   String title=driver.getTitle();
                String url=driver.getCurrentUrl();
//
//                driver.close();
//                driver.quit();
//                driver.manage().window().maximize();
//                driver.manage().window().minimize();
//                
//                driver.navigate().to("https://www.google.com/");
//                driver.navigate().forward();
//                driver.navigate().back();
//                driver.navigate().refresh();
//                
//                Dimension d=new Dimension(950, 740);
//                driver.manage().window().setSize(d);
//                
                
}
}