package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() 
	{
		File src=new File("./configuration\\config.properties");
		try {
		FileInputStream fis=new FileInputStream(src);
	prop=new Properties();
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	public String getUrl()
	{
	String url=prop.getProperty("baseURL");
	
		return url;
		}
	public String getuname()
	{
		String uName=prop.getProperty("username");
		return uName;
	}
	public String getPwd()
	{
		String pwd=prop.getProperty("password");
		return pwd;
	}
	public String getChromepath()
	{
		String ChromePath=prop.getProperty("chromepath");
		return ChromePath;
	}
	public String getFFpath()
	{
		String FFPath=prop.getProperty("firefoxpath");
		return FFPath;
	}

}
