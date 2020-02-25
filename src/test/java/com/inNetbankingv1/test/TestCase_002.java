package com.inNetbankingv1.test;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iNetBankingv1.pageobjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TestCase_002 extends BaseClass {
  @Test(dataProvider="LoginData")
  public void loginDDT(String uname,String pwd) {
	  LoginPage lp=new LoginPage(driver);
	  
	  lp.setUserName(uname);
	  log.info("user name entered");
	  lp.setPassword(pwd);
lp.Setsubmit();	
if(isAlertPresent()==true)
{
	log.error("test is failed");
	driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
}else
{
	lp.setlogOut();
	log.error("test is passed");
	driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
}

  }
  public boolean isAlertPresent()
  {try {
	  driver.switchTo().alert();
	  return true;
  }
  catch(NoAlertPresentException e) {
	return false;
  }
  
	  
  }
  
  @DataProvider(name="LoginData")
  String[][] getData() throws IOException{
	  String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
	  int rowNum=XLUtils.getRowCount(path,"Sheet1");
	  int colcount=XLUtils.getCellCount(path,"Sheet1",1);
	  String logindata[][]=new String [rowNum][colcount];
	  for(int i=1;i<rowNum;i++)
	  {
		  for(int j=0;j<colcount;j++)
		  {
			  logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
		  }
	  }
	  return logindata;
	  
	  
	  
	  
  }
  
}
