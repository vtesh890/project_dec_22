package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pages.Loginpage;
import org.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registersteps extends BaseClass{
	RegistrationPage r;
	Loginpage l;
	@Given("The user should be in esty page")
	public void the_user_should_be_in_esty_page() {
	
	
		 browserLaunch("chrome");
		    urlLaunch("https://www.etsy.com");
		    
		    
		    maximize();
		    
		    implicitwait(10);	    
		}
	
	
	
	
	
	

	@When("The user has to click the register link")
	public void the_user_has_to_click_the_register_link() {
		l=new Loginpage();
		click(l.getbtnsignin());
		r=new RegistrationPage();
		
		click(r.getBtnregister());
	 
				
		}

	    
	

	@When("The user has to fill the email,firstname and password")
	public void the_user_has_to_fill_the_email_firstname_and_password() {
		
	// invalid register	
		sendkeys(r.getTxtusername(),"venkatesh");
		sendkeys(r.getFirstname(),"Raj");
		sendkeys(r.gettxtpassword(), "9023567");
		click(r.getbtnsubmit());
 
		 
				
			
	}
	
		
		
	
	
	   
	

	
		
		
	
	   
	

	@Then("The user should register the app and receive {string} message")
	public void the_user_should_register_the_app_and_receive(String expected) {
		Assert.assertEquals("verify registration", expected, "Welcome back");
	}
	   
	}

	


	
	

   

	
	
	
	
		
	
	
		
		
		
		
	   
	

	

	

	

	
			

	   
	





