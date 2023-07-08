package Framwork1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBmobilenumpage {

	      @FindBy(xpath="(//input[@type='number'])[2] ") private  WebElement num;
	     @FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signwithpassword;
	
	         public PBmobilenumpage(WebDriver driver)
	         {
	        	 PageFactory.initElements(driver, this);
	         }
	
	
	         public void enternum()
	         {
	        	 num.sendKeys("9420746653");
	         }
	
	         public void signwithpassword()
	         {
	        	 signwithpassword.click();
	         }
	
	
}
