package pageobjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Musicalinstrumentsearch {

	WebDriver driver;
	public Musicalinstrumentsearch(WebDriver driver)
	{
		this.driver=driver;
	}
	/*
	By depart=(By.xpath("//*[@id=\'nav-link-shopall\']/span[2]"));
	
	Actions a =new Actions(driver);
	{	
		a.moveToElement((WebElement) driver.findElement(depart));
	}
	public Actions departby()
	{
		return a;
	}
	*/
	
By books=By.xpath("//*[@id=\'nav-flyout-shopAll\']/div[2]/span[8]");
By childernsbook1=By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[8]/div[1]/a[2]/span");
By booksforeverystage1=By.linkText("Baby to 2");
//By nextarrow=By.cssSelector("#a-autoid-1 > span");

	public void department()
	{
		WebElement link_Home = driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]")); 
     Actions builder = new Actions(driver);
     Action mouseOverHome = builder
             .moveToElement(link_Home)
             .build();
     mouseOverHome.perform();
	
	}
	public WebElement booksmeth()
	{
		return driver.findElement(books);
	}
	
	public WebElement childernsbook() {
		// TODO Auto-generated method stub
		return driver.findElement(childernsbook1);
	}
	public WebElement booksforeverystage() 
	{
		return driver.findElement(booksforeverystage1);
	}
	/*  public WebElement nextbutton()
	{
		return driver.findElement(nextarrow);
	} */
}

/*
public void department()
{
	WebDriver driver = null;
   	WebElement val=driver.findElement(By.xpath("//*[@id=\'nav-link-shopall\']/span[2]"));
	Actions a =new Actions(driver);	
		a.moveToElement((WebElement)(val)).build().perform();
*/