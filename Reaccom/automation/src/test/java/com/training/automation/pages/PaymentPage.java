package com.training.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://southwest.dev2.southwest.com/air/booking/purchase.html");
	}
	
	@FindBy(xpath="//*[@id=\"passengerFirstName-0\"]\"")
	private WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"passengerLastName-0\"]")
	private WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"passengerSuffix-0\"]")
	private WebElement suffixCombo;
	
	@FindBy(xpath="//*[@id=\"passengerSuffix-0--item-1\"]/button")
	private WebElement suffixComboSelected;
	
	@FindBy (xpath="//*[@id=\"passengerDateOfBirthMonth-0\"]")
	private WebElement monthOfBirth;
	
	@FindBy(xpath="//*[@id=\"passengerDateOfBirthMonth-0--item-9\"]/button")
	private WebElement monthOfBirthSelected; 
		
	@FindBy (xpath="//*[@id=\"passengerDateOfBirthDay-0\"]")
	private WebElement dayOfBirth;
	
	@FindBy (xpath="//*[@id=\"passengerDateOfBirthYear-0\"]")
	private WebElement yearOfBirth;
	
	@FindBy (xpath="//*[@id=\"passengerGender-0\"]")
	private WebElement passengerGenderCombo;
	
	@FindBy(xpath="//*[@id=\"passengerGender-0--item-1\"]/button")
	private WebElement passengerGenderSelected;
	
	@FindBy(xpath="//*[@id=\"contactPhoneNumber\"]")
	private WebElement contactPhoneNumber;
	
	@FindBy(xpath="//*[@id=\"TabbedArea_4-tab-1\"]")
	private WebElement paypalButton;
	
	@FindBy(xpath="//*[@id=\"sendYourReceiptEmail\"]")
	private WebElement emailField;
	
	@FindBy(xpath="//*[@id=\"swa-content\"]/div/div[2]/div/div/section/div/div/div/button")
	private WebElement purchaseButton;
	
	public ConfirmationPage buscar(){
		System.out.println("Ha llegado al nombre");
		getWait().until(ExpectedConditions.elementToBeClickable(firstName));
		firstName.sendKeys("Roberto");
		getWait().until(ExpectedConditions.elementToBeClickable(lastName));
		lastName.sendKeys("Sanchez");
		getWait().until(ExpectedConditions.elementToBeClickable(suffixCombo));
		suffixCombo.click();
		getWait().until(ExpectedConditions.elementToBeClickable(suffixComboSelected));
		suffixComboSelected.click();	
		 	     
		return new ConfirmationPage(getDriver());		
	}
	
	
	

	
	
	

}
