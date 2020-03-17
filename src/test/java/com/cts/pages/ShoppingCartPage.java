package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage 
{
	private static By tosLoc = By.id("termsofservice");
	private static By checkoutLoc = By.xpath("//button[contains(text(),'Checkout')]");
	private static By newAddressLoc = By.id("billing-address-select");
	private static By fnLoc = By.id("BillingNewAddress_FirstName");
	private static By countryLoc = By.id("BillingNewAddress_CountryId");
	private static By cityLoc = By.id("BillingNewAddress_City");
	private static By addressLoc = By.id("BillingNewAddress_Address1");
	private static By postCodeLoc = By.id("BillingNewAddress_ZipPostalCode");
	private static By numberLoc = By.id("BillingNewAddress_PhoneNumber");
	private static By continue1Loc = By.xpath("(//input[@title='Continue'])[1]");
	private static By continue2Loc = By.xpath("(//input[@title='Continue'])[2]");
	private static By continue3Loc = By.xpath("(//input[@title='Continue'])[3]");
	private static By continue4Loc = By.xpath("(//input[@title='Continue'])[4]");
	private static By continue5Loc = By.xpath("(//input[@title='Continue'])[5]");
	private static By confirmLoc = By.xpath("//input[@value='Confirm']");
	
	
	public static void acceptTermsOfService(WebDriver driver)
	{
	driver.findElement(tosLoc).click();
	}
	public static void clickOnCheckOut(WebDriver driver)
	{
    driver.findElement(checkoutLoc).click();
	}
    public static void clickOnAddress(WebDriver driver)
    {
    WebElement addressEle = driver.findElement(newAddressLoc);
    Select select1 = new Select(addressEle);
    select1.selectByVisibleText("New Address");
    }
    
    public static void enterFirstName(WebDriver driver)
    {
    WebElement fnEle = driver.findElement(fnLoc);
    fnEle.clear();fnEle.sendKeys("Kiranmai");
    }
    
    public static void selectCountry(WebDriver driver)
    {
    WebElement countryEle = driver.findElement(countryLoc);
    Select select2 = new Select(countryEle);
    select2.selectByVisibleText("India");
    }
    public static void enterCity(WebDriver driver)
    {
    driver.findElement(cityLoc).sendKeys("Andhra");
    }
    public static void enterAddress(WebDriver driver)
    {
    driver.findElement(addressLoc).sendKeys("Guntur");
    }
    public static void enterPostCode(WebDriver driver)
    {
    driver.findElement(postCodeLoc).sendKeys("123456");
    }
    public static void enterPhoneNumber(WebDriver driver)
    {
    driver.findElement(numberLoc).sendKeys("9876543219");
    }
    public static void clickOnContinues(WebDriver driver)
    {
    driver.findElement(continue1Loc).click();
    driver.findElement(continue2Loc).click();
    driver.findElement(continue3Loc).click();
    driver.findElement(continue4Loc).click();
    driver.findElement(continue5Loc).click(); 
    }
    public static void clickOnConfirm(WebDriver driver)
    {
    driver.findElement(confirmLoc).click(); 
    }

}
