package com.fitness;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//
	@FindBy(id = "ember1428")
	public WebElement MyHome;
	@FindBy(id = "ember1454")
	public WebElement Food;
	@FindBy(id = "ember1461")
	public WebElement Exercise;
	@FindBy(id = "ember1462")
	public WebElement Reports;
	@FindBy(id = "ember1463")
	public WebElement Apps;
	@FindBy(id = "ember1464")
	public WebElement Community;
	@FindBy(id = "ember1473")
	public WebElement Blog;
	@FindBy(xpath = "//a[@class='shop']")
	public WebElement Shop;
	@FindBy(id = "ember1567")
	public WebElement Premium;
}
