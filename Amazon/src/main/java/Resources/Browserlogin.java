package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browserlogin {

public WebDriver driver;
@Test
public WebDriver initialization() throws IOException
{

	Properties prop=new Properties();
	 FileInputStream fis = new FileInputStream("C://Users//chait//Amazon//src//main//java//Resources//data.properties");
	  prop.load(fis);
	  
	  if(prop.getProperty("browser").equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.get(prop.getProperty("url"));
	  }
	
	return driver;	
}

}