package com.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.util.Downdrop;

public class Admin_Functionality extends TestBase
{
	
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement admin;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement usrname;
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']")
	WebElement empname;
	
    @FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement select;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement select1;
    
    public Admin_Functionality(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void validateselect(String usename, String empname) throws Throwable
    {
    	admin.click();
    	usrname.sendKeys(usename);
    	Thread.sleep(3000);
    	select.click();
    	Robot r= new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	
    	
    			
//    	Downdrop d= new Downdrop();
//    	d.selDropdown(select, "ESS");
    	this.empname.sendKeys(empname);
//    	Downdrop d1= new Downdrop();
//    	d1.selDropdown(select1, "Enabled");
    	
    	
    	
    	
    	
    }
}
