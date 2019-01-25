package com.training.automation.test;

import org.testng.annotations.Test;

import com.training.automation.pages.SelectFlightsChangePage;
import com.training.automation.pages.SelectFlightsReaccomsPage;
import com.training.automation.pages.BookingHomePage;
import com.training.automation.pages.ChangeHomePage;
import com.training.automation.pages.ConfirmationPage;
import com.training.automation.pages.PaymentPage;
import com.training.automation.pages.PricePage;
import com.training.automation.pages.ReaccomHomePage;
import com.training.automation.pages.ReconcilePage;

public class DotcomTests extends BaseTest{

	@Test
	public void testWikiHome(){
		ReaccomHomePage home = getWikiHomePage();
		SelectFlightsReaccomsPage selectFlightsPage = home.buscar();
		
	}
//	public void testWikiHome(){
//		BookingHomePage home = getWikiHomePage();
//		ReconcilePage selectFlightsPage = home.buscar();
//		PricePage pricePage=selectFlightsPage.buscar();
//		PaymentPage paymentPage=pricePage.buscar();
//		ConfirmationPage confirmationPage=paymentPage.buscar();
//	}
}
