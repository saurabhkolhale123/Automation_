package Framwork1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pbprofilepage {
	
	       @FindBy(xpath="//input[@value='sherlock holmes']") private WebElement fullname;
	       
	       WebDriver driver1;
	       public Pbprofilepage(WebDriver driver)
	       {
	    	   PageFactory.initElements(driver, this);
	    	   driver1=driver;
	       }

	       public void switchtochildwindoe()
	       {
	    	   Set<String> ids = driver1.getWindowHandles();
		    	  ArrayList<String> al=new ArrayList<>(ids);
		    	  driver1.switchTo().window(al.get(1));
	       }
	      public void verifyfullname() 
	      {
	    	
			String acttext=fullname.getAttribute("value");
			String exptext="sherlock holmes";
			
			if(acttext.equals(exptext))
			{
				System.out.println("tc pass");
			}
			else {System.out.println("tc fail");}
		} 
	       
	       
}
