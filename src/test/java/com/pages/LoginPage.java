package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class='authorization-link'])[1]")
	private WebElement signIn;
	
	@FindBy(name ="login[username]")
	private WebElement loginText;
	
	@FindBy(name ="login[password]")
	private WebElement passwordText;
	
	@FindBy(xpath="(//*[@id='send2'])[1]")
	private WebElement submitBtn;
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void enterUserName(String username) {
		loginText.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordText.sendKeys(password);
	}
	
	public void clickOnSubmit() {
		submitBtn.click();
	}
	
	
}
