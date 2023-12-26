package com.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Admin_Functionality;
import com.pages.Login_Function;
import com.pages.Logout_Function;
import com.util.Downdrop;
import com.util.UtilTestCls;

@Listeners(com.util.Linsteners.class)
public class AdminSearch extends TestBase
{
  
  public static Login_Function li;
  public static Logout_Function lo;
  public static Admin_Functionality ad;
  public static String sheetname1="admni";
  
  @BeforeClass
  public void intializeselect()
  {
	 
	  li= new Login_Function(driver);
	  lo=new Logout_Function(driver);
	  ad= new Admin_Functionality(driver);
	 
	  
  }
  
  @DataProvider
	public String[][] exl() throws Throwable
	{
		String[][] data = UtilTestCls.getexceldata(sheetname1);
		return data;
			
	}
  
  @Test(dataProvider = "exl")
  public void validateAdmin(String usename, String empname) throws Throwable
  {
	  li.validateLogin();
	  ad.validateselect( usename, empname);
	 // ad.validateselect( usename, empname );
	  //lo.validateLogout();
  }
  
}
