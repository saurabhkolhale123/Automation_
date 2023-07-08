package A6__findelements_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findele {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///D:/checkboc.html");
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement s1:ele)
		{
		     s1.click();
		     Thread.sleep(1000);
		  	
		}
		
	for(int i=ele.size()-1;i>=0;i--)
	{
		ele.get(i).click();
	}
		
	}

}
