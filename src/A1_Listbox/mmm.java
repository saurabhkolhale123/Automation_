package A1_Listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mmm {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("file:///C:/Users/saurabh/Documents/select.html");
	
	WebElement select = driver.findElement(By.xpath("//select[@id=\"1234\"]"));
	
	 Select s=new Select(select);
	 
	 
	 boolean result=s.isMultiple();System.out.println(result);
//	 s.selectByIndex(0);
//	 
//	 s.selectByVisibleText("pak");
//	 s.selectByValue("4");
//	 
//	 
//	 
//	 s.deselectByVisibleText("pak");
//	 s.deselectByIndex(0);
//	 s.deselectByValue("4");
//	 
//	 s.deselectAll();
//	 
//	 
//	 
//	 
//	 
//	String value=s.getFirstSelectedOption().getText();
//	 System.out.println(value);
//	 
//	List<WebElement> v1 = s.getAllSelectedOptions();
//	
//	for(WebElement s1:v1)
//	{
//		System.out.println(s1.getText()+" ");
//	}
//	
	List<WebElement> opt = s.getOptions();
	
	TreeSet t=new TreeSet<>();
	
	
	
	
	for(WebElement s1:opt)
	{
		String data = s1.getText();
		t.add(data);
	  }
	
	System.out.println(t);
	
	
	
	
	
	}
	
}
