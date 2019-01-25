package com.training.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BookingHomePage extends BasePage {
	
	public BookingHomePage(WebDriver pDriver) {
		super(pDriver);
		//pDriver.get("http://www.wikipedia.org");
		pDriver.get("https://southwest.dev2.southwest.com/air/booking/");
	}
	
	@FindBy(id="originationAirportCode")
	private WebElement originationAirportCodeInput;
	
	@FindBy(xpath="//*[@id=\"swa-content\"]/div/div[2]/div/div/section/div[2]/div[2]/div/form/div[2]/div[2]/label/div[1]/div/div/div/span/span")
	private WebElement iconCalendar1;	
	
	@FindBy(xpath="//*[@id=\"calendar-14-2018-12-31\"]")
	private WebElement selectedDate1;
	
	@FindBy(id="departureTimeOfDay")
	private WebElement departureTimeDay;
	
	@FindBy(xpath="//*[@id=\"departureTimeOfDay--item-0\"]/button")
	private WebElement departureTimeDaySelected;
	
	@FindBy(id="adultPassengersCount")
	private WebElement adultPassengerCountInput;	
	
	@FindBy(xpath="//*[@id=\"NumberSelector_18--flyout-trigger\"]/div/div/div[1]/div/div[2]/button[2]/span/span")
	private WebElement adultPassengerCountSelected;
	
	@FindBy(id="seniorPassengersCount")
	private WebElement seniorPassengerCountInput;
	
	@FindBy(xpath="//*[@id=\"NumberSelector_19--flyout-trigger\"]/div/div/div[1]/div/div[2]/button[2]/span/span")
	private WebElement seniorPassengerCountSelected;
	
	@FindBy(id="destinationAirportCode")
	private WebElement destinationAirportCodeInput;
	
	@FindBy(xpath="//*[@id=\"swa-content\"]/div/div[2]/div/div/section/div[2]/div[2]/div/form/div[2]/div[7]/label/div[1]/div/div/div/span/span")
	private WebElement iconCalendar2;
	
	@FindBy(xpath="//*[@id=\"calendar-21-2019-01-02\"]")
	private WebElement selectedDate2;
	
	@FindBy(id="returnTimeOfDay")
	private WebElement returnTimeOfDayInput;
	
	@FindBy(xpath="//*[@id=\"returnTimeOfDay--item-0\"]/button")
	private WebElement returnTimeOfDaySelected;
	
	@FindBy(id="form-mixin--submit-button")
	private WebElement searchButton;	
	
	
	public ReconcilePage buscar(){
	 System.out.println("Esta comenzando");
     getWait().until(ExpectedConditions.elementToBeClickable(originationAirportCodeInput));	
     originationAirportCodeInput.sendKeys("MCO");
     System.out.println("Esta metiendo el nombre");
     getWait().until(ExpectedConditions.elementToBeClickable(iconCalendar1));
     iconCalendar1.click();
     getWait().until(ExpectedConditions.elementToBeClickable(selectedDate1));
     selectedDate1.click();
     getWait().until(ExpectedConditions.elementToBeClickable(departureTimeDay));
     departureTimeDay.click();
     getWait().until(ExpectedConditions.elementToBeClickable(adultPassengerCountInput));
     adultPassengerCountInput.click();
     destinationAirportCodeInput.sendKeys("HOU");
     getWait().until(ExpectedConditions.elementToBeClickable(iconCalendar2));
     iconCalendar2.click();
     getWait().until(ExpectedConditions.elementToBeClickable(selectedDate2));
     selectedDate2.click();
     getWait().until(ExpectedConditions.elementToBeClickable(returnTimeOfDayInput));
     returnTimeOfDayInput.click();
     getWait().until(ExpectedConditions.elementToBeClickable( returnTimeOfDaySelected));
     returnTimeOfDaySelected.click();
     getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
     searchButton.click();
	 return new ReconcilePage(getDriver());    
	}
}
	
	
	
	
	
	
	
	
	
	
	


