package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@class='navigation']/ul/li[1]")
	private WebElement clickOnWhats;
	
	@FindBy(xpath= "//span[contains(text(),'New in women')]")
	private WebElement pageText;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class='greet welcome'])[1]/span")
	private WebElement newPageText;
	
	public String getTextFromHomePage() {
		return newPageText.getText();
	}

	public void clickOnWhatsNewSection() {
		clickOnWhats.click();
	}

	public String getTextonWhatsNew() {
		return pageText.getText();
	}
	
}
