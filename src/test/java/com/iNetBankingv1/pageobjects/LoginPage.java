package com.iNetBankingv1.pageobjects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class LoginPage {
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="uid")
	WebElement userName;
	
	
  @FindBy(name="password")
  WebElement passWord;
 
  
  @FindBy(name="btnLogin")
  WebElement submit;
 
  
  @FindBy(linkText="Log out")
	WebElement logOut;
  public void setUserName(String uname)
  {
	  userName.sendKeys(uname);
  }
  public void setPassword(String pwd)
  {
	  passWord.sendKeys(pwd);
  }
  public void Setsubmit()
  {
	  submit.click();
  }
  public void setlogOut()
  {
	  logOut.click();
  }
  
}
