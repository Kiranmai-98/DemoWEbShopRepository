package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecentlyViewedProductsPage 
{
	private static By fictionLoc = By.xpath("//a[text()='Fiction']");
	private static By atcLoc1 = By.xpath("(//input[@value='Add to cart'])[1]");
	private static By actualMsgOfAddedCartLoc = By.xpath("//p[@class='content']");
	
	public static void clickOnFiction(WebDriver driver)
	{
	   driver.findElement(fictionLoc).click();
	}
	
	public static void clickOnAddTOCart(WebDriver driver)
	{
		driver.findElement(atcLoc1).click();
	}
	
	public static String  getActualMsgOfCarting(WebDriver driver)
	{
	    WebDriverWait wait = new WebDriverWait(driver,50);
	    wait.until(ExpectedConditions.presenceOfElementLocated(actualMsgOfAddedCartLoc));
	    String actualMsgOfAddedCart = driver.findElement(actualMsgOfAddedCartLoc).getText();
	    return actualMsgOfAddedCart;
	}

}
