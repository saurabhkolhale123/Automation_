package WebElement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webee {
public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	 WebElement v1 = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
	boolean r=v1.isDisplayed();
	boolean r1=v1.isEnabled();
	boolean r2=v1.isSelected();
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		v1.click();
		v1.getText();
		
}
}
