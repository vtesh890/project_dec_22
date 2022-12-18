package org.stepdefinition;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.pages.Loginpage;
import org.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import net.bytebuddy.implementation.bind.annotation.SuperMethod;

public class LoginSteps extends BaseClass {
	Loginpage l;
	RegistrationPage r;
	
	
	@Given("The user should be in etsy page")
	public void the_user_should_be_in_etsy_page() {

	    browserLaunch("chrome");
	    urlLaunch("https://www.etsy.com");
	    
	    maximize();
	    
	    implicitwait(10);	    
	}
	@When("The user has to fill the username {string} and password {string}")
	public void the_user_has_to_fill_the_username_and_password(String user, String pass) {
		l=new Loginpage();
		click(l.getbtnsignin());
		sendkeys(l.getTxtUsername(), user);
		sendkeys(l.getTxtPasword(), pass);
	   
	}


	@When("The user has to click the {string} button")
	public void the_user_has_to_click_the_button(String button) {
		
			if(button.equals("signin")) {
				click(l.getbtnsignin());
			}
	
}


	@Then("The user navigate to the invalid login page")
	public void the_user_navigate_to_the_invalid_login_page() {
		waiturl(10,"etsy.com");	  
    	   Assert.assertTrue("verify url",getcurrenturl().contains("etsy.com"));
    	   System.out.println("user in invalid page");
    	   quit();
    	
    	
    	
	    
	}
	
				
			
}
	   
	

	
		
		
	
	   
	


	




	

	
		
	  
	




//@Given("The user should be in facebook page")
//
// 
//
//public void the_user_should_be_in_facebook_page() {
//   browserLaunch("chrome");
//   urlLaunch("https://www.facebook.com");
//   maximize();
//   implicitwait(10);
//}
//
//@When("The user has to fill the username {string} and password {string}")
//public void the_user_has_to_fill_the_username_and_password(String user, String pass) {
//	l=new Loginpage();
//	sendkeys(l.getTxtUsername(),user);
//	sendkeys(l.getTxtpassword(), pass);
//   
//}
//
//@When("The user has to click the {string} button")
//public void the_user_has_to_click_the_button(String string) {
//	click(l.getbtnlogin());
//   
//}
//
//@Then("The user navigate to the invalid login page")
//public void the_user_navigate_to_the_invalid_login_page() {
////	WebDriverWait w=new WebDriverWait(driver, 10); 
////	w.until(ExpectedConditions.urlContains("privacy"));
////	Assert.assertTrue("verify the url",driver.getCurrentUrl().contains("privacy"));
////	System.out.println("user invalid page");
//
//	waiturl(20, "privacy");
//	Assert.assertEquals("verify url",getcurrenturl().contains("privacy"));
//	System.out.println("user invalid page");
//	
//	
//	
//   
//
//}
//}








	
	


	
		
	
//	@Given("The user should be in esty loginpage")
//	public void the_user_should_be_in_esty_loginpage() {
//		browserLaunch("chrome");
//		urlLaunch("https://www.flipkart.com/");
//		maximize();
//		
//		
//		implicitwait(10);
//		
	   
//	}

//	@When("The user has to fill the username {string} and password {string}")
//	public void the_user_has_to_fill_the_username_and_password(String user, String pass) {
//	   F=new FlipkartLogin();
//	   
//		
//	   sendkeys(F.getTxtUsername(),user);
//	   sendkeys(F.getTxtpassword(),pass);
//		
//	}
//
//	@When("The user has to click the {string} button")
//	public void the_user_has_to_click_the_button(String button) {
//		
////		if(button.equals("login")) {
//		 click(F.getbtnlogin());
//		}
//		else if(button.equals("register")) {
//			click(r.getbtnsubmit());
//		}
//		else {
//			throw new NullPointerException();
//		}
	    
//	}

//	@Then("The user navigate to the invalid login page")
//	public void the_user_navigate_to_the_invalid_login_page() {
//	    waiturl(20,"etsy.com");
//	    Assert.assertTrue("verify url",getcurrenturl().contains("etsy.com"));
//	    System.out.println("user in Invalid page");
//	    quit();
//	}
	
	


	
		
		
		
		
		
		
	
	    
//	@When("The user has to fil the username and password")
//	public void the_user_has_to_fil_the_username_and_password(io.cucumber.datatable.DataTable data) {
//		List<String>li=data.asList();
//		String user = li.get(0);
//		System.out.println(user);
//		String pass = li.get(1);
//		System.out.println(pass);
//		Map<String, String>mp=data.asMap(String.class, String.class);
//        String user = mp.get("username");
//        System.out.println(user);
//  
//        String pass = mp.get("password");
//        System.out.println(pass);
	// 2D map or 2D with Header
//	List<Map<String,String>>list=data.asMaps();
//	Map<String,String>mp=list.get(1);
	
//	String user = mp.get("username");
//	System.out.println(user);
	
//	String pass = mp.get("password");
//	System.out.println(pass);
                
				
		
	   
//		WebElement txtusername = driver.findElement(By.name("email"));
//		txtusername.sendKeys(mp.get("username"));
//		WebElement txtpass = driver.findElement(By.name("password"));
//		txtpass.sendKeys(mp.get("password"));
	    
//	}

//	@When("The user has to click the login button")
//	public void the_user_has_to_click_the_login_button() {
//		WebElement btnlogin = driver.findElement(By.name("submit_attempt"));
//          btnlogin.click();		
//	}
	   

//	@Then("The user navigate to the invalid login page")
//	public void the_user_navigate_to_the_invalid_login_page() {
//		WebDriverWait w=new WebDriverWait(driver, 20);
//		w.until(ExpectedConditions.urlContains("etsy.com"));
//		Assert.assertTrue("verify url", driver.getCurrentUrl().contains("etsy.com"));
//		System.out.println("user in invalid page");
//		driver.quit();
	   
//	}






