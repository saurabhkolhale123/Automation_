package Framwork1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBaccountpage {
	
	    @FindBy(xpath=" (//div[text()='My Account']) ") private WebElement myaccount;

	    @FindBy(xpath=" //span[text()=' My profile '] ") private WebElement  myprofile;
	    WebDriver driver1;
	    public PBaccountpage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    	driver1=driver;
	    }

	    
	    public void clickonmyaccount()
	    {
	    	Actions act=new Actions(driver1);
	    	act.moveToElement(myaccount).perform();
		}
	    
	    public void clickonmyprofile() {
			myprofile.click();
		}
	    
	    
	    
	    
	    
	    
	    
}
