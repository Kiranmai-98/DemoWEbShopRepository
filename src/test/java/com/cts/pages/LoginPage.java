package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private static By userNameLoc = By.xpath("//input[@id='Email']");
	private static By passwordLoc = By.xpath("//input[@id='Password']");
	private static By loginLoc = By.xpath("//input[@value='Log in']");
	
	public static void enteringUserName(WebDriver driver,String userName)
	{
	 driver.findElement(userNameLoc).sendKeys(userName);
	}
	public static void enteringpassword(WebDriver driver,String password)
	{
	 driver.findElement(passwordLoc).sendKeys(password);
	}
	public static void clickOnLogin(WebDriver driver)
	{
	 driver.findElement(loginLoc).click();
	}

}
