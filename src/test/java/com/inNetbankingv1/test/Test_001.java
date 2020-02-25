package com.inNetbankingv1.test;

import org.testng.Assert;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iNetBankingv1.pageobjects.LoginPage;

public class Test_001 extends BaseClass {
  @Test
  public void f() {
	  //driver.get(baseURL);
	  log.info("browser launched");
	  LoginPage lp=new LoginPage(driver);
	  lp.setUserName(userName);
	  log.info("user name entered");
	  lp.setPassword(passWord);
lp.Setsubmit();	
if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
{
	Assert.assertTrue(true);
	log.info("test pass");
}else
{
	Assert.assertTrue(false);
}
System.out.println(driver.getTitle());
  }
}
