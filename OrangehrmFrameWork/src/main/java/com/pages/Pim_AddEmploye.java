package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pim_AddEmploye 
{
	@FindBy(xpath="//span[text()='PIM']")
	   WebElement pimclck ;
	   
	   @FindBy(xpath="//a[text()=\"Add Employee\"]")
	   WebElement addploy;
  
   @FindBy(name="firstName")
   WebElement fstnme;
   
   @FindBy(name="middleName")
   WebElement mdlenme;
   
   @FindBy(name = "astName")
   WebElement lstnme;
   
   @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
   WebElement id;
   
   
   public Pim_AddEmploye(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
 
   public void varifyAddDetails(String first,String middle,String last,String id) throws InterruptedException
   {
	   pimclck.click();
	   Thread.sleep(3000);
	   addploy.click();
	  
	   fstnme.sendKeys(first);
	   mdlenme.sendKeys(middle);
	   lstnme.sendKeys(last);
	   Thread.sleep(3000);
	   this.id.clear();
	   Thread.sleep(3000);
	   this.id.sendKeys(id);
   }
   
  
}
