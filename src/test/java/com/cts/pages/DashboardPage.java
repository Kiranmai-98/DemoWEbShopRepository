package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage 
{
	private static By loginLoc = By.linkText("Log in");
	public static void clickOnLogin(WebDriver driver)
	{
		driver.findElement(loginLoc).click();
	}

}
