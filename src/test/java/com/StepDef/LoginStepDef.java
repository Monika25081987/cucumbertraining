package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.TestRunner.Hooks;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	LoginPage loginPage;
	HomePage homePage;
	
	@Given("I want to launch url")
	public void i_want_to_launch_url() {
		loginPage = new LoginPage(Hooks.driver);
		homePage = new HomePage(Hooks.driver);
	}

	@When("I click on signIn Button")
	public void clickonSignButton() {
		loginPage.clickOnSignIn();
	}


	@When("I click on submit button")
	public void i_click_on_submit_button() {
		System.out.println("clicking on submit button");
		loginPage.clickOnSubmit();
	}

	@Then("I should be redirect to homepage")
	public void i_should_be_redirect_to_homepage() throws InterruptedException {
		Thread.sleep(3000);
		String text = homePage.getTextFromHomePage();
		Assert.assertTrue(text.contains("Welcome"), "Text is not matching");
	}

	@When("I enter {string} and {string} to application")
	public void i_enter_and_to_application(String username, String password) {
		System.out.println("Entering username and password for an application");
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	}
	
//	@Then("I should get {string}")
//	public void i_should_get(String errMsg) throws InterruptedException {
//		Thread.sleep(3000);
//		String text = driver.findElement(By.xpath("//div[@role='alert']/div/div")).getText();
//		Assert.assertEquals(text,errMsg);
//	    
//	}
}
