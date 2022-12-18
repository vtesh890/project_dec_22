package org.pages;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="signin"),@FindBy(xpath="//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")})
     private WebElement btnsignin;	   
		@FindAll({@FindBy(id="username"),@FindBy(xpath="//input[@type='email']")})
		private WebElement txtusername;
		@FindAll({@FindBy(id="password"),@FindBy(xpath="//input[@type='password']")})
	    private WebElement txtpassword;
		@FindAll({@FindBy(id="login"),@FindBy(xpath="(//button[@type='submit'])[4]")})
		private WebElement btnlogin;
		
		public WebElement getbtnsignin() {
			return btnsignin;
			
		}
		
		public WebElement getTxtUsername() {
			return txtusername;
		}
		public WebElement getTxtPasword() {
			return txtpassword;
			
		}
	  public WebElement getbtnlogin() {
		return btnlogin;
		  
	  }
	 
		  
	  }
	
	//facebook login
	
//	@FindAll({@FindBy(id="username"),@FindBy(xpath="(//input[@type='text'])[2]")})
//	private WebElement txtusername;
//	
//   @FindAll({@FindBy(id="password"),@FindBy(xpath="//input[@type='password']")})
//   private WebElement txtpassword;
//   @FindAll({@FindBy(id="login"),@FindBy(xpath="(//button[@type='submit'])[2]")})
//   private WebElement btnlogin;
//   
//   public WebElement getTxtUsername() {
//	return txtusername;
//   }
//   public WebElement getTxtpassword() {
//	return txtpassword;
//	   
//	   
//   }
//   public WebElement getbtnlogin() {
//	return btnlogin;
//	   
//   }
//
//}


	
	   
   
	   
	

		
		
	

	
	 
	
	
	
	
	
	


