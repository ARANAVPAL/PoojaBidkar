package pomClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass{
public  void SSMethod(WebDriver driver, String s) throws IOException
{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File desti =new File("D:\\poojaTai\\ScreenShot\\AmazonPro\\"+s+".jpg");
    FileHandler.copy(source, desti);

}

}