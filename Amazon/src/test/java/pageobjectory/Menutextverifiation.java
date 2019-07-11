package pageobjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Menutextverifiation {

WebDriver driver;
public Menutextverifiation(WebDriver driver)
{
	this.driver=driver;
}
//By Departments=By.xpath("//*[@id=\'nav-link-shopall\']/span[2]");
//By your_amazon= By.xpath("//*[@id=\'nav-your-amazon\']");

public  void youramazonmethod() {
	String your_amazon= driver.findElement(By.xpath("//*[@id=\'nav-your-amazon\']")).getText();
Assert.assertEquals(your_amazon,"Your Amazon.com");
System.out.println("assertion is executed is: "+your_amazon);

}
}