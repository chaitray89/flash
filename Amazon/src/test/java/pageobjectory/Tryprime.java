package pageobjectory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Tryprime {

WebDriver driver;
public Tryprime(WebDriver driver)
{
	this.driver=driver;
}
By primelink=By.linkText("Try Prime");
public void tryprimemouseover() throws InterruptedException
{
	WebElement tryprime_link = driver.findElement(By.xpath("//*[@id=\'nav-link-prime\']/span[2]")); 
	//WebElement sublink=driver.findElement(By.xpath("//*[@id=\'prime-header-CTA\']/span/input"));
 Actions builder = new Actions(driver);
 Action mouseOverHome = builder
         .moveToElement(tryprime_link)
         .build();
 mouseOverHome.perform();

 //action.moveToElement(elementToHover).click(elementToClick).build().perform();
 
}
public WebElement tryprimelinkckick()
{
	return driver.findElement(primelink);
}
}
