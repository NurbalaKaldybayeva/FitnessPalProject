package com.fitness;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//	driver.manage().wait();
	
	}
}
