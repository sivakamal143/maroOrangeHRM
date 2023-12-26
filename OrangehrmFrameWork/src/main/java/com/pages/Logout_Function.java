package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Function 
{
	@FindBy(className ="oxd-userdropdown")
	WebElement profleclck;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutbuton;
	
	public Logout_Function(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateLogout()
	{
		profleclck.click();
		logoutbuton.click();
	}

}
