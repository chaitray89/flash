package amzpkg1.Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Browserlogin;
import pageobjectory.Logindetails;
import pageobjectory.Menutextverifiation;
import pageobjectory.Musicalinstrumentsearch;
import pageobjectory.Signinbutton;
import pageobjectory.Tryprime;

public class Launchclass extends Browserlogin {
	

@Test(priority=1)
	public void browserlogin() throws IOException
	{
		// TODO Auto-generated method stub

		Launchclass l=new Launchclass();
		driver=initialization();
		driver.manage().deleteAllCookies();
		//l.initialization();
	//	Signinbutton signin=new Signinbutton(driver);
		//signin.amazonlink().click();	
		}
/*
@Test(dataProvider= "getdata")
public void logindetails(String email,String password)
{
	Logindetails l=new Logindetails(driver);
	l.username().sendKeys(email);
	l.password().sendKeys(password);
	l.signin().click();
}

*/

@Test(priority=4)
public void department1()
{
	
	Musicalinstrumentsearch m=new Musicalinstrumentsearch(driver);
	m.department();	
	m.booksmeth().click();
	m.childernsbook().click();
	//m.booksforeverystage().click();
	//m.nextbutton().click();
	
}
@Test(priority=3)
public void menucheck()
{
	
	Menutextverifiation m1=new Menutextverifiation(driver);
	m1.youramazonmethod(); 
	
}

/*
@DataProvider
public Object[][] getdata()
{
	Object[][] data=new Object[1][2];
	data[0][0]="trchaithra@gmail.com";
	data[0][1]="Goodluck_1";
	return data;
} */
@Test(priority=2)
public void tryprimelink() throws InterruptedException
{
	Tryprime t=new Tryprime(driver);
	t.tryprimemouseover();
	t.tryprimelinkckick().click();
}


}
  