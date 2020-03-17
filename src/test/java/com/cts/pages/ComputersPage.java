package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputersPage 
{
	private static By desktopLoc = By.linkText("Desktops");
	private static By cheapCompLoc = By.linkText("Build your own cheap computer");
	private static By expCompLoc = By.linkText("Build your own expensive computer");
	private static By atclLoc = By.xpath("//input[@value='Add to compare list']");
	private static By cheapCompCostLoc = By.xpath("(//td[contains(text(),'800.00')])[1]");
	private static By expCompCostLoc = By.xpath("(//td[contains(text(),'800.00')])[2]");
	
	public static void clickOnDesktop(WebDriver driver)
	{
	  driver.findElement(desktopLoc).click();
	}
	
	public static void clickOncheapComputer(WebDriver driver)
	{
	    WebElement cheapComputerEle = driver.findElement(cheapCompLoc);
	    cheapComputerEle.click();
	}
	public static String costOfCheapComp(WebDriver driver)
	{
		String text1 = driver.findElement(cheapCompCostLoc).getText();
		return text1;
	}
	public static void clickOnExpensiveComputer(WebDriver driver)
	{
	    WebElement ExpComputerEle = driver.findElement(expCompLoc);
	    ExpComputerEle.click();
	}
	public static String costOfExpComp(WebDriver driver)
	{
		String text2 = driver.findElement(expCompCostLoc).getText();
		return text2;
	}
	public static void clickToAddToCompareList(WebDriver driver)
	{
	    driver.findElement(atclLoc).click();
	}

}
