package com.cts.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrdersPage 
{
	private static By orderDetailsLoc = By.linkText("Click here for order details.");
	
	public static void clickForOrderDetails(WebDriver driver)
	{
		driver.findElement(orderDetailsLoc).click();
	}
	
	public static void toPrintDetailsOfOrder(WebDriver driver)
	{
	    WebElement orderDetails = driver.findElement(By.className("data-table"));
	    List<WebElement> allDetails = orderDetails.findElements(By.tagName("tr"));
	    for(WebElement details : allDetails)
	    {
		   System.out.println(details.getText());
	    }
	}

}
