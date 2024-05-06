package com.step;

import org.openqa.selenium.WebDriver;

import com.hook.Hooks;
import com.page.Homepage;
import com.page.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step  {
	
	
	
	public  WebDriver driver = Hooks.driver;
	
	Login loginp;
	
	Homepage page;
	
	
	@Given("open chrome browser")
	public void open_chrome_browser() {
	    Login loginp=new Login(driver);
	    loginp.senduser();
	   // loginp.sendpass();
	   // loginp.clickonbtn();
	}

	@Given("click on search button")
	public void click_on_search_button() throws InterruptedException {
	  Homepage page=new Homepage(driver);
	  
	  page.dropdown();
	}

	@When("enter url")
	public void enter_url() {
	
	}

	@When("navigate to login page")
	public void navigate_to_login_page() {
	    
	}

	@When("enter username")
	public void enter_username() {
	  
	}

	@Then("click on login icon")
	public void click_on_login_icon() {
	  
	}

	@Then("enter password")
	public void enter_password() {
	   
	}


}
