package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnquiryPage 
{
	private static By fullNameLoc = By.id("FullName");
	private static By mailLoc = By.xpath("//input[@placeholder='Enter your email address']");
	private static By submitLoc = By.xpath("//input[@value='Submit']");
	private static By msgLoc = By.xpath("//div[@class='result']");
	
	public static void enteringFullName(WebDriver driver,String myName)
	{
	  WebElement fullNameEle = driver.findElement(fullNameLoc);
      fullNameEle.clear();
      fullNameEle.sendKeys(myName);
	}
    
	public static void enteringEmail(WebDriver driver,String myMail)
	{
        WebElement emailEle = driver.findElement(mailLoc);
        emailEle.clear();
        emailEle.sendKeys(myMail);
	}
    
	public static void enterQuery(WebDriver driver,String enquiryQn)
	{
        driver.findElement(By.id("Enquiry")).sendKeys(enquiryQn);
              
	}
	public static void clickOnSubmit(WebDriver driver)
	{
		driver.findElement(submitLoc).click(); 
	}
	public static String getActualSubmittedMsg(WebDriver driver)
	{
		String actEnqSubMsg = driver.findElement(msgLoc).getText();
		return actEnqSubMsg;
	}

}
