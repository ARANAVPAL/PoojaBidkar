package PojoPackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PojoClass
{
	public static WebDriver openChrome()
	{
		
	System.setProperty("webdriver.chrome.driver","src"+File.separator+"test"+File.separator+"resources"+File.separator+"Browser"+File.separator+"chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
     return driver;
	}
}
