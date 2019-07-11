package pageobjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logindetails {

	WebDriver driver;
	
	public Logindetails(WebDriver driver)
	{
		this.driver=driver;
	}
	 By Email=By.xpath("//*[@id='ap_email']");
	 By password=By.xpath("//*[@id=\'ap_password\']");
	By submit=By.xpath("//*[@id=\'signInSubmit\']");
	
public WebElement username()
{
	return driver.findElement(Email);
}
public WebElement password()
{
	return driver.findElement(password);
}
public WebElement signin()
{
	return driver.findElement(submit);
}
	
}
