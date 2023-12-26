package com.tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.TestBase;

import com.pages.Login_Function;
import com.pages.Logout_Function;
import com.pages.Pim_AddEmploye;

import com.util.UtilTestCls;



public class AddEmplyee extends TestBase
{
	public static Login_Function li;
	public static Logout_Function lo;
	public static Pim_AddEmploye pa;
	public static String sheetname="addploy";
	
	@BeforeMethod
	public void intalize()
	{
		set();
		li= new Login_Function(driver);
		lo= new Logout_Function(driver);
		pa= new Pim_AddEmploye(driver);
		li.validateLogin();
	
	}
	
	@DataProvider
	public String[][] exl() throws Throwable
	{
		String[][] data = UtilTestCls.getexceldata(sheetname);
		return data;
			
	}
	
	@Test(dataProvider = "exl" )
	public void AddempSenario(String first,String middle,String last,String id) throws InterruptedException
	{
		
		pa.varifyAddDetails(first,middle,last,id);
		lo.validateLogout();
		
			
	}
	
	
	
    }
