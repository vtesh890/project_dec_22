package org.pages;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass{
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="register"),@FindBy(xpath="(//button[@type='button'])[13]")})
	private WebElement btnregister;
	@FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@type='email']")})
	
	private WebElement txtusername;
	
	
	@FindAll({@FindBy(id="firstname"),@FindBy(xpath="(//input[@type='text'])[3]")})
	private WebElement txtfirstname;
	@FindAll({@FindBy(id="password"),@FindBy(xpath="//input[@type='password']")})
	private WebElement txtpassword;
	
	@FindAll({@FindBy(id="submit"),@FindBy(xpath="(//button[@type='submit'])[4]")})
	private WebElement btnsubmit;
	
	public WebElement getBtnregister() {
		return btnregister;
		
		
	}
	public WebElement getTxtusername() {
		return txtusername;
		
		
	}
		
	
	public WebElement getFirstname() {
		return txtfirstname;
		
	}
	public WebElement gettxtpassword() {
		return txtpassword;
		
		
	}
	
	public WebElement getbtnsubmit() {
		return btnsubmit;
		
	}
}
//	
//	
//	facebook	
//	@FindAll({@FindBy(id="button"),@FindBy(xpath="(//a[@role='button'])[2]")})
//	private WebElement btnsignup;
//	
//	@FindAll({@FindBy(id="firstname"),@FindBy(xpath="(//input[@type='text'])[2]")})
//	private WebElement txtfirstname;
//
//	@FindAll({@FindBy(id="lastname"),@FindBy(xpath="(//input[@type='text'])[3]")})
//	private WebElement txtlastname;
//	
//	@FindAll({@FindBy(id="password"),@FindBy(xpath="(//input[@type='text'])[4]")})
//	private WebElement txtpassword ;
//	
//	@FindAll({@FindBy(id="submit"),@FindBy(xpath="(//button[@type='submit'])[2]")})
//	private WebElement btnsubmit;
//	
//	public WebElement getbtnsignup() {
//		return btnsignup;
//	}
//	
//	public   WebElement getTxtFirstname() {
//		return txtfirstname;
//	}
//	
//	public WebElement getTxtlastname() {
//		return txtlastname;
//	}
//	
//	public WebElement getTxtpassword () {
//		return txtpassword;
//		
//	}
//	
//	public WebElement getbtnsubmit() {
//		return btnsubmit;
//		
//	}
//	
//		
//		
//		
//		
//	}
//
//
//
//		
//		
//		
//		
//		
//		
	


