package com.training.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChangeHomePage extends BasePage{

	public ChangeHomePage(WebDriver pDriver) {
		super(pDriver);
		//pDriver.get("http://www.wikipedia.org");
		pDriver.get("https://southwest.dev2.southwest.com/air/change/");
	}
	
//	@FindBy(id="searchInput")
//	private WebElement searchInput;
//	
//	@FindBy(xpath="//*[@id=\"search-form\"]/fieldset/button")
//	private WebElement searchButton;
//
//	public WebElement getSearchInput() {
//		return searchInput;
//	}
//
//	public WebElement getSearchButton() {
//		return searchButton;
//	}
//	
//	public ArticlePage buscar(String busqueda){
//		searchInput.sendKeys(busqueda);
//		getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
//		searchButton.click();
//		return new ArticlePage(getDriver());
//	}
	
	@FindBy(id="confirmationNumber")
	private WebElement confirmationNumber;
	
//	@FindBy(id="englishModalNumber")
//	private WebElement englishModal;
	
	@FindBy(id="passengerFirstName")
	private WebElement passengerFirstNameInput;
	
	@FindBy(id="passengerLastName")
	private WebElement passengerLastNameInput;
	
	
	@FindBy(id="form-mixin--submit-button")
	private WebElement continueButton;
	
	//@FindBy(css="")
		
	//@FindBy()
	
	public SelectFlightsChangePage buscar(){
//	getWait().until(ExpectedConditions.elementToBeClickable(englishModal));
//	englishModal.click();
	confirmationNumber.sendKeys("TPSYMT");
	passengerFirstNameInput.sendKeys("Jefry");
	passengerLastNameInput.sendKeys("Jem");
	getWait().until(ExpectedConditions.elementToBeClickable(continueButton));
	continueButton.click();	
	return new SelectFlightsChangePage(getDriver());
    }
}
