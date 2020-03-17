package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoPage
{	
	private static By firstNameLoc = By.xpath("//input[@id='FirstName']");
	private static By saveLoc = By.xpath("//input[@value='Save']");
	
	public static void clearingFirstName(WebDriver driver)
	{
		driver.findElement(firstNameLoc).clear();
	}
	public static void editingFirstName(WebDriver driver,String editedName)
	{	  
        driver.findElement(firstNameLoc).sendKeys(editedName);
	}
	public static void clickOnSave(WebDriver driver)
	{
        driver.findElement(saveLoc).click();
	}
	public static String toGetEditedName(WebDriver driver)
	{
		  WebElement firstName = driver.findElement(firstNameLoc);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  String fName = js.executeScript("return arguments[0].value;", firstName).toString();
		  return fName;
	}

}
