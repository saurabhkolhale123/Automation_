package A1_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSL {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/saurabh/Documents/select.html");
		
		WebElement select = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(select);
		
		boolean multiple=s.isMultiple();
		System.out.println(multiple);
		
		
		
		s.selectByVisibleText("ind");
		
		s.selectByValue("3");
		
		s.selectByIndex(1);
		
//		s.deselectByVisibleText("ind");
//		
//		s.deselectByValue("3");
//		
//		s.deselectByIndex(1);
//		
//		s.deselectAll();
		
		
		String text=s.getFirstSelectedOption().getText();
		System.out.println(text);
		
	
		List<WebElement> aso = s.getAllSelectedOptions();
		
		for(WebElement s1:aso)
		{
			System.out.print(s1.getText());
		}
		
		System.out.println();
		
		List<WebElement> ao = s.getOptions();
		
		for(WebElement s2:ao)
		{
			System.out.print(s2.getText());
		}
		
		
		
		
		
		
		
		
		
	}

}
