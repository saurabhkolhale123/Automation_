package A1_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ml {public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("file:///C:/Users/saurabh/Documents/select.html");
	
	WebElement select = driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(select);
	
	boolean multiple=s.isMultiple();
	System.out.println(multiple);
	
	s.selectByVisibleText("ind");
	s.selectByValue("2");
	String text=s.getFirstSelectedOption().getText();
	System.out.println(text);
	
	List<WebElement> list = s.getAllSelectedOptions();
	
	for(WebElement s1:list)
	{
		System.out.println(s1.getText());
	}
	
	
	
	
	
}
}