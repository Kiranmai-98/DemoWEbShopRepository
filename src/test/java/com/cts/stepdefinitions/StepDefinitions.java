package com.cts.stepdefinitions;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.BooksPage;
import com.cts.pages.ComputersPage;
import com.cts.pages.DashboardPage;
import com.cts.pages.EnquiryPage;
import com.cts.pages.HomePage;
import com.cts.pages.JewelryPage;
import com.cts.pages.LoginPage;
import com.cts.pages.MyInfoPage;
import com.cts.pages.OrdersPage;
import com.cts.pages.RecentlyViewedProductsPage;
import com.cts.pages.ShoppingCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions
{
	WebDriver driver;
	@Given("I have the browser with DemoWebShopPage")
	public void i_have_the_browser_with_DemoWebShopPage() 
	{
	  LaunchWebDriver.beforeMethod();
	  this.driver=LaunchWebDriver.driver;	 
	}
	
	@When("I login to my account using {string} as username and {string} as password")
	public void i_login_to_my_account_using_as_username_and_as_password(String userName, String password) 
	{
		DashboardPage.clickOnLogin(driver);		
		LoginPage.enteringUserName(driver, userName);
		LoginPage.enteringpassword(driver, password);
		LoginPage.clickOnLogin(driver);
	}
	
	@When("I recently viewed some items")
	public void i_recently_viewed_some_items() 
	{
	    HomePage.clickOnBooks(driver);
	    BooksPage.clickOnFictionBook(driver);
	}

	@When("click on the recently viewed products")
	public void click_on_the_recently_viewed_products() 
	{
	    HomePage.clickOnRecentlyViewedProducts(driver);
	}

	@When("click on an item")
	public void click_on_an_item() 
	{
		RecentlyViewedProductsPage.clickOnFiction(driver);
	}

	@When("click on add to cart")
	public void click_on_add_to_cart() 
	{
		RecentlyViewedProductsPage.clickOnAddTOCart(driver);	    
	}
	
	@Then("The added item should be in the shopping cart")
	public void the_added_item_should_be_in_the_shopping_cart() 
	{
	  
	    String actualMsgOfAddedCart = RecentlyViewedProductsPage.getActualMsgOfCarting(driver);
	    	
	    System.out.println(actualMsgOfAddedCart);
	    
	    Assert.assertEquals(actualMsgOfAddedCart,"The product has been added to your shopping cart");
	
	}


	@When("I click on add to compare page")
	public void i_click_on_add_to_compare_page() 
	{
	    HomePage.clickOnComputers(driver);	    
	    ComputersPage.clickOnDesktop(driver);	    
	    ComputersPage.clickOncheapComputer(driver);
	    ComputersPage.clickToAddToCompareList(driver);
	   
	    HomePage.clickOnComputers(driver);
	    ComputersPage.clickOnDesktop(driver);
	    ComputersPage.clickOnExpensiveComputer(driver);
	    ComputersPage.clickToAddToCompareList(driver);
	    
	}

	@Then("They should appear on the compare page")
	public void they_should_appear_on_the_compare_page() 
	{
		HomePage.clickOnCompareProducts(driver);
		
		if(driver.getPageSource().toLowerCase().contains("build your own cheap computer") &&
			   driver.getPageSource().toLowerCase().contains("build your own expensive computer"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		String text1 = ComputersPage.costOfCheapComp(driver);		
		String text2 = ComputersPage.costOfExpComp(driver);				
		text1 = text1.replace(".00", "");
		text2 = text2.replace(".00", "");
		int value1 = Integer.parseInt(text1);
		int value2 = Integer.parseInt(text2);
		if(value1>value2)
		{
			System.out.println(value1+" is greater");
		}
		else
		{
			System.out.println(value2+" is greater");
		}
	
	}
	
	@When("click on My account")
	public void click_on_My_account() 
	{
	    HomePage.clickOnMyAccount(driver);
	}

	@Then("I should be able to edit my information as my name as {String}")
	public void i_should_be_able_to_edit_my_information_as_my_name_as(String editedName) 
	{
		
	    MyInfoPage.clearingFirstName(driver);
	    MyInfoPage.editingFirstName(driver, editedName);
	    MyInfoPage.clickOnSave(driver);
	    	    
	    String fName = MyInfoPage.toGetEditedName(driver);
	    System.out.println(fName);
	   
	    Assert.assertEquals("Name changed successfully","Bindu",fName);
	    	  
	}


	@When("I Click on Contact as")
	public void i_Click_on_Contact_as() 
	{
	   HomePage.clickOnContactUs(driver);
	}
	
	@When("I enter my name as {String} and email as {String}")
	public void i_enter_my_name_as_and_email_as_(String myName,String myMail)
	{		
	    EnquiryPage.enteringFullName(driver, myName);
	    EnquiryPage.enteringEmail(driver, myMail);	   
	}

	@Then("I can be able to submit an Enquiry as {String}")
	public void i_can_be_able_to_submit_an_Enquiry_as_(String enquiryQn) 
	{    	    
	    EnquiryPage.enterQuery(driver, enquiryQn);
	    EnquiryPage.clickOnSubmit(driver);
	    
	    String actEnqSubMsg = EnquiryPage.getActualSubmittedMsg(driver);
	    System.out.println(actEnqSubMsg);
	    
	    String expEnqSubMsg = "Your enquiry has been successfully sent to the store owner.";
	    Assert.assertEquals("Enquiry submitted assertion", expEnqSubMsg, actEnqSubMsg);
	    
	}
	
	@When("I order  anything")
	public void i_order_anything() 
	{
	    HomePage.clickOnJewelry(driver);
	    
	    JewelryPage.clickOnOneItem(driver);
	    JewelryPage.clickOnAddToCart(driver);
	    
	    HomePage.clickOnShoppingCart(driver);
	    
	    ShoppingCartPage.acceptTermsOfService(driver);
	    ShoppingCartPage.clickOnCheckOut(driver);
	    ShoppingCartPage.clickOnAddress(driver);
	    ShoppingCartPage.enterFirstName(driver);
	    ShoppingCartPage.selectCountry(driver);
	    ShoppingCartPage.enterCity(driver);
	    ShoppingCartPage.enterAddress(driver);
	    ShoppingCartPage.enterPostCode(driver);
	    ShoppingCartPage.enterPhoneNumber(driver);
	    ShoppingCartPage.acceptTermsOfService(driver);
	    ShoppingCartPage.clickOnConfirm(driver);
	   
	}

	@Then("I can be able to get details of the order")
	public void i_can_be_able_to_get_details_of_the_order() 
	{		
		 OrdersPage.clickForOrderDetails(driver);
		 OrdersPage.toPrintDetailsOfOrder(driver);
	}


}
