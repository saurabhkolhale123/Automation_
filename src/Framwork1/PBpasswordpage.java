package Framwork1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBpasswordpage {
	
	     @FindBy(xpath="//input[@name='password']")   private WebElement password;
	     @FindBy(xpath="//a[@id='login-in-with-password']")   private  WebElement signin;
	         
	    public  PBpasswordpage (WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	    
	  public void enterpassword()
	  {
		  password.sendKeys("Saurabh@123");
	  }
	    
	    public void clickonsignin() 
	    {
	    	signin.click();
			
		}
	    

}
