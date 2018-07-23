package com.fitness;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Main extends Base{
HomePage homePage;
	@Test
	public void Login() throws InterruptedException{
	driver.get("https://www.myfitnesspal.com/");
	
	driver.findElement(By.xpath("//a[.='Log In']")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rob123QW@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1qazxsw2"+Keys.ENTER);
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	homePage=new HomePage(driver);
	homePage.Food.click();
	Thread.sleep(2000);
	homePage.Exercise.click();
	Thread.sleep(2000);
	homePage.Reports.click();
	Thread.sleep(2000);
	homePage.Apps.click();
	Thread.sleep(2000);
	homePage.Community.click();
	Thread.sleep(2000);
	homePage.Blog.click();
	Thread.sleep(2000);
	homePage.Shop.click();
	Thread.sleep(2000);
	homePage.Premium.click();
	}
	
}
