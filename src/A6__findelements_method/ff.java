package A6__findelements_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ff {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	List<WebElement> list = driver.findElements(By.xpath("//a"));
	
	
	for(WebElement s1:list)
	{
		System.out.println(s1.getText());
	}
	
	
	
	
	
	
	
	
}
}
