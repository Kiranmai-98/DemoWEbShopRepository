Feature: feature description
	In order to use the website
	As a customer
	I want to get access to the portal
	
Background:
Given I have the browser with DemoWebShopPage
When I login to my account using 'bindu.tummala98@gmail.com' as username and 'Bindu@98' as password
	
Scenario: Adding items to cart
When I recently viewed some items
And click on the recently viewed products
And click on an item 
And click on add to cart
Then The added item should be in the shopping cart

Scenario: Comparision of products cost
When I click on add to compare page
Then They should appear on the compare page

Scenario: Editing the information
When click on My account
Then I should be able to edit my information as my name as 'Bindu'

Scenario: Submitting an Enquiry
When I Click on Contact as
And I enter my name as 'Bindu Tummala' and email as 'bindu.tummala98@gmail.com'
Then I can be able to submit an Enquiry as 'Please tell about the details of laptops availability..'

Scenario: To get Details of the order
When I order  anything
Then I can be able to get details of the order


