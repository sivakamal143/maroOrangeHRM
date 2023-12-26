package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Login_Function extends TestBase
{
	@FindBy(name="username")
	WebElement us;
	
	@FindBy(name="password")
	WebElement pas;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbuton;
	
	public Login_Function(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	public void validateLogin()
	{
	   us.sendKeys(proj.getProperty("user"));
	   pas.sendKeys(proj.getProperty("pass"));
	   loginbuton.click();
	}
	
	
	
	

}
