package A6__popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class child {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
		
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(ids);
		
		driver.switchTo().window(al.get(1));
		
		WebElement more = driver.findElement(By.xpath("//span[text()='More']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(more).perform();
		
		WebElement click = driver.findElement(By.xpath("//span[text()='Cypress']"));
		
		act.click(click).perform();
	
	}
}
