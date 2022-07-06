package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPom 
{
	@FindBy(xpath="//input[@id='email']")
	private WebElement user;
   @FindBy(xpath="//input[@id='pass']")
   private WebElement pass;
   @FindBy(xpath="//button[text()='Log In']")
	private WebElement logIn;
   
	public void user()
	{
		user.sendKeys("1234");
	}
	public void pass()
	{
		pass.sendKeys("9876");
		
	}
	public void logIn()
	{
		logIn.click();
	}
	public  FBPom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
