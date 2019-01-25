package com.training.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PricePage extends BasePage {

	public PricePage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"swa-content\"]/div/div[2]/div/div/section/div[2]/div/div[2]/div[3]/button")
	private WebElement continueButton;
	
	
	public PaymentPage buscar(){
		 getWait().until(ExpectedConditions.elementToBeClickable(continueButton));
		 continueButton.click();	     
		 return new PaymentPage(getDriver());		
	}

}
