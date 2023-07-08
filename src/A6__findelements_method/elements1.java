package A6__findelements_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements1 {
public static void main(String[] args) {
	
	        WebDriver driver=new ChromeDriver();
	
	
	         driver.navigate().to("https://www.facebook.com/");
	
	
	List<WebElement> ele = driver.findElements(By.xpath("//a"));
	
	
	for(WebElement s1:ele)
	{
		System.out.println(s1.getText());
	}
	
	
	
	
}
}
