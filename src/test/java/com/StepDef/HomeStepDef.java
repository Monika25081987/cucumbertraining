package com.StepDef;

import org.testng.Assert;

import com.TestRunner.Hooks;
import com.pages.HomePage;

import io.cucumber.java.en.*;

public class HomeStepDef {

	HomePage homePage;

	public HomeStepDef() {
		homePage = new HomePage(Hooks.driver);
	}

	@When("I click on whats new section")
	public void i_click_on_whats_new_section() {
		homePage.clickOnWhatsNewSection();

	}

	@Then("I should be able to see new in womens text")
	public void i_should_be_able_to_see_new_in_womens_text() throws InterruptedException {
		Thread.sleep(3000);
		String text = homePage.getTextonWhatsNew();
		Assert.assertTrue(text.toUpperCase().contains("NEW IN WOMEN'S"));
	}

}
