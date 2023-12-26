package com.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class Downdrop extends TestBase
{
	public void selDropdown(WebElement ele, String str)
	{
		Select sel= new Select(ele);
		sel.selectByVisibleText(str);
		//sel.selectByIndex(c);
		
	}

	
}
