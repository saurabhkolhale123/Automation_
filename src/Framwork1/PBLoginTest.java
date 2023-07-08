package Framwork1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.policybazaar.com/");
        
        PBloginpage login=new PBloginpage(driver);
             login.clickonsignin();
             
             PBmobilenumpage num=new PBmobilenumpage(driver);
             num.enternum();
             num.signwithpassword();
             
             PBpasswordpage pwd=new PBpasswordpage(driver);
             pwd.enterpassword();
             pwd.clickonsignin();
             
             Thread.sleep(2000);
             PBaccountpage acc=new PBaccountpage(driver);
             acc.clickonmyaccount();
             acc.clickonmyprofile();
             Thread.sleep(3000);
             
             Pbprofilepage pro=new Pbprofilepage(driver);
             pro.switchtochildwindoe();
             pro.verifyfullname();
             
             
             driver.quit();
             
             
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
