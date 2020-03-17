package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BooksPage 
{
	private static By fictionLoc = By.xpath("//a[text()='Fiction']");
	
	public static void clickOnFictionBook(WebDriver driver)
	{
      driver.findElement(fictionLoc).click();
	}

}
