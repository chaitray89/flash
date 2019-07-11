package pageobjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Signinbutton {
	
WebDriver driver;
By amazonlink=By.xpath("//*[@id='nav-your-amazon']");

public Signinbutton(WebDriver driver)
{
	this.driver=driver;
}

public WebElement amazonlink()
{
	return driver.findElement(amazonlink);
}
 
}