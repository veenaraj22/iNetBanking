package com.inNetbankingv1.test;

import org.testng.annotations.Test;

import com.inetbanking.utilities.ReadConfig;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	 ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getUrl();
	public String userName=readconfig.getuname();
	public String passWord=readconfig.getPwd();
	public static WebDriver driver;
	public static Logger log;
  
  @BeforeMethod
@Parameters("browser")
  public void setUP(String br) {
	 
	   log=Logger.getLogger("ebanking");
	  
		 DOMConfigurator.configure("log4j.xml");
		 if(br.equals("Chrome")) 
		 
		 System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		  driver=new ChromeDriver();
  
		 
		 driver.get(baseURL);
	  
  }


	  
	 
	  
  
  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }

  

}
