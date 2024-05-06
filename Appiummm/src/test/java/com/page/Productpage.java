package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.generics;

public class Productpage  extends generics{
	
	
	

	public Productpage(WebDriver driver) {
		this.driver = driver;

	PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//button[@class='btn_primary btn_inventory'])[1]")
	
	private WebElement product;
	
	
	@FindBy(xpath="//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	
	private WebElement onee;
	
	
	
	
	
	@FindBy(xpath = "//div[3]//div[3]//button[1]")
	
	private WebElement two;
	
	
	@FindBy(xpath = "//body//div[@id='page_wrapper']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]")
	
	private WebElement three;
	
	
 
	
	
 
 
}
