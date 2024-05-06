package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.generics;

public class Login extends generics {

	public WebDriver driver;
	
	//Global variable
	
	
	
	//constructor

	public Login(WebDriver driver) {
		this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	
	//locating elements set variables
	
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginbtn;

	
	
	//performing actions page class itself
	
	
	public void senduser() {
	//	username.sendKeys("standard_user");
	sendykeys(username, "standard_user");
	sendykeys(password, "secret_sauce");
		click(loginbtn);
	}

	public void sendpass() {
		//password.sendKeys("secret_sauce");
		
		
	}

	public void clickonbtn() {
		//loginbtn.click();
	}

	
}
