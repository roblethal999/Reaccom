package com.training.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectFlightsChangePage extends BasePage {

	public SelectFlightsChangePage(WebDriver pDriver) {
		super(pDriver);
	}
	
	@FindBy(xpath="//*[@id=\"swa-content\"]/div/div[2]/div/div/section/section[2]/div[1]/button")
	private WebElement departureFlight;
	
	@FindBy(xpath="//*[@id=\"swa-content\"]/div/div[2]/div/div/section/section[2]/div[2]/button")
	private WebElement arrivingFlight;
	
	
	
 
}
