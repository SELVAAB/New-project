package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.generics;

public class Homepage extends generics{
	
	
	

	public WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;

	PageFactory.initElements(driver, this);

	
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	
	private WebElement dddd;
	
	public void dropdown() throws InterruptedException {
		
		
		selectbyvalue(dddd, "hilo");
		Thread.sleep(30);
		
		selectbyvalue(dddd, "za");
		Thread.sleep(30);
		
		selectbyvalue(dddd, "az");
		Thread.sleep(30);
		
		selectbyvalue(dddd, "lohi");
		
		
	}

	
}
