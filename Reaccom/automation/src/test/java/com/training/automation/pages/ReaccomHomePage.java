package com.training.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReaccomHomePage extends BasePage {

	public ReaccomHomePage(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://southwest.dev10.southwest.com/air/reaccom/");
	}
	@FindBy(id="confirmationNumber")
	private WebElement confirmationNumber;
	
	@FindBy(id="passengerFirstName")
	private WebElement passengerFirstNameInput;
	
	@FindBy(id="passengerLastName")
	private WebElement passengerLastNameInput;
	
	
	@FindBy(id="form-mixin--submit-button")
	private WebElement continueButton;
	
	
	public SelectFlightsReaccomsPage buscar(){
	confirmationNumber.sendKeys("KRH3XB");
	passengerFirstNameInput.sendKeys("Roberto");
	passengerLastNameInput.sendKeys("Sanchez");
	getWait().until(ExpectedConditions.elementToBeClickable(continueButton));
	continueButton.click();	
	return new SelectFlightsReaccomsPage(getDriver());
    }
}
