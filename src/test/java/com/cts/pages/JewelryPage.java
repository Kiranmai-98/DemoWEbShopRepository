package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JewelryPage 
{
	private static By locketLoc = By.linkText("Black & White Diamond Heart");
	private static By atcLoc = By.xpath("(//input[@value='Add to cart'])[1]");
	
	public static void clickOnOneItem(WebDriver driver)
	{
	    driver.findElement(locketLoc).click();
	}
	public static void clickOnAddToCart(WebDriver driver)
	{
	    driver.findElement(atcLoc).click();
	}

}
