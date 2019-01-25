package com.training.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReconcilePage extends BasePage {

	public ReconcilePage(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://southwest.dev2.southwest.com/air/booking/select.html?adultPassengersCount=1&departureDate=2018-12-31&departureTimeOfDay=ALL_DAY&destinationAirportCode=HOU&fareType=USD&originationAirportCode=MCO&passengerType=ADULT&returnDate=2019-01-02&returnTimeOfDay=ALL_DAY&seniorPassengersCount=0&tripType=roundtrip");
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#air-booking-fares-0-1 > .fare-button_primary-blue > button")
	private WebElement departingFlight;
	
    //@FindBy(css="#air-booking-fare-drawer-1-0 > button")
	@FindBy(xpath="//*[@id=\"air-booking-product-0\"]/div[5]/span/ul/li[1]/div[6]/div/button")
	private WebElement continueSubmitButton;
    
    @FindBy(css="#air-booking-fares-1-1 > .fare-button_primary-blue > button")
	private WebElement returnFlight;    
    
    //@FindBy(css="#air-booking-fare-drawer-1-1 > button")
    @FindBy(xpath="//*[@id=\"air-booking-product-1\"]/div[5]/span/ul/li[1]/div[6]/div/button")
	private WebElement continue2SubmitButton;
    
    @FindBy(xpath="//*[@id=\"air-booking-product-2\"]")
    private WebElement submitButton;
	
	public PricePage buscar(){
		 System.out.println("Ha llegado");
		 getWait().until(ExpectedConditions.elementToBeClickable(departingFlight));		
		 departingFlight.click(); 
	     getWait().until(ExpectedConditions.elementToBeClickable(continueSubmitButton));
	     continueSubmitButton.click();
	     getWait().until(ExpectedConditions.elementToBeClickable(returnFlight));		
		 returnFlight.click(); 
	     getWait().until(ExpectedConditions.elementToBeClickable(continue2SubmitButton));
	     continueSubmitButton.click();
	     getWait().until(ExpectedConditions.elementToBeClickable(submitButton));
	     submitButton.click();	     
	     return new PricePage(getDriver());    
		}
	
	
	
}
;