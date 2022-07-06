package testClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameters;

import PojoPackage.PojoClass;
import pomClass.FBPom;
import pomClass.UtilityClass;


public class FBLogIn extends PojoClass
{
	WebDriver driver;
    FBPom obj;
	UtilityClass SS;
    @BeforeTest	
@org.testng.annotations.Parameters("browser")

public void launchBrowser(String x)
{
	System.out.println("Before Test");
	if(x.equalsIgnoreCase("Chrome"))
	{
		driver=openChrome();
		
	}
}
	
   @BeforeClass
   public void beforeClass()
   {
	  obj=new FBPom(driver);
	  
   }
   @BeforeMethod
   public void beforeMethod() throws InterruptedException
   {
	   Thread.sleep(3000);
	   
	  driver.get("https://www.facebook.com/"); 
	  Thread.sleep(3000);
	//  SoftAssert SA= new SoftAssert();
	  
//	  SA.assertAll();
	 
   }
   @Test
   public void login() throws InterruptedException, IOException
   {
	   obj.user();
	   Thread.sleep(3000);
	   obj.pass();
	   obj.logIn();
	 //  SS.SSMethod(driver, null);
		//  Thread.sleep(3000);
   }
  @AfterMethod
   public void afterMathod()
   {
	   driver.navigate().back();
   }
   @AfterClass
   public void Classafter()
   {
	   obj=null;
   }
   @AfterTest
   public void afterTest()
   {
	   driver.quit();
   }
}
