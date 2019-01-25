package com.training.automation.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.training.automation.pages.BookingHomePage;
import com.training.automation.pages.ChangeHomePage;
import com.training.automation.pages.MyDriver;
import com.training.automation.pages.ReaccomHomePage;

public class BaseTest {

	MyDriver myDriver;
	
	private ReaccomHomePage wikiHome;
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser"})
	public void beforeSuite(String browser){
		myDriver = new MyDriver(browser);
		wikiHome = new ReaccomHomePage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite(){
		wikiHome.dispose();
	}
	
	public ReaccomHomePage getWikiHomePage(){
		return wikiHome;
	}
}
