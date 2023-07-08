package A1_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox1 {
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		
		Select s=new Select(month);
		
		s.selectByVisibleText("Jun");
		
		s.selectByValue("8");
		
		s.selectByIndex(4);
		
		
		
		
		
		
		
		
		
		
	}

}
