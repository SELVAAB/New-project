package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hook.Hooks;

public class Login {
	
	public WebDriver driver;
	
	
	public Login(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}

	
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username;
	
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginbtn;
	
	
	public void senduser() {
		username.sendKeys("standard_user");
	}
	
	public void sendpass() {
		username.sendKeys("secret_sauce");
	}
	
	public void clickonbtn() {
		loginbtn.click();
	}
}
