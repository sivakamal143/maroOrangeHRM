package com.util;


	import java.io.File;
	import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

import com.base.TestBase;
import com.google.common.io.Files;

	public class Linsteners extends TestBase implements WebDriverEventListener
//	{

//		public void onTestStart(ITestResult result) {
//			Reporter.log("Test case start "+result.getName());
//		}
//
//		public void onTestSuccess(ITestResult result) {
//			// TODO Auto-generated method stub
//			Reporter.log("Test case success "+result.getName());
//			}
//
//		public void onTestFailure(ITestResult result) {
//			// TODO Auto-generated method stub
//			TakesScreenshot sh=(TakesScreenshot)TestBase.driver;
//			File fis=sh.getScreenshotAs(OutputType.FILE);
//			File dist=new File("/Envision/"+result.getName()+ System.currentTimeMillis()+".png");
//			try
//			{
//				FileUtils.copyFile(fis, dist);
//			} 
//			catch (IOException e) 
//			{
//				e.printStackTrace();
//			}
//		}
//		public void onTestSkipped(ITestResult result) {
//			// TODO Auto-generated method stub
//			Reporter.log("Test case Skipped "+result.getName());
//		}
//		
//
//	}
	
	{
		public void afterNavigateTo(String url, WebDriver driver) 
		{
			System.out.println("Navigated to:'" + url + "'");
		}
		
		public void beforeChangeValueOf(WebElement element, WebDriver driver) 
		{
			System.out.println("Value of the:" + element.toString() + " before any changes made");
		}
		
		public void afterChangeValueOf(WebElement element, WebDriver driver)
		{
			System.out.println("Element value changed to: " + element.toString());
		}
		
		public void beforeClickOn(WebElement element, WebDriver driver) 
		{
			System.out.println("Trying to click on: " + element.toString());
		}
		
		public void afterClickOn(WebElement element, WebDriver driver) 
		{
			System.out.println("Clicked on: " + element.toString());
		}
		
		public void beforeNavigateBack(WebDriver driver) 
		{
			System.out.println("Navigating back to previous page");
		}
		
		public void afterNavigateBack(WebDriver driver) 
		{
			System.out.println("Navigated back to previous page");
		}
		
		public void beforeNavigateForward(WebDriver driver)
		{
			System.out.println("Navigating forward to next page");
		}
		
		public void afterNavigateForward(WebDriver driver) 
		{
			System.out.println("Navigated forward to next page");
		}
		
		public void onException(Throwable error, WebDriver driver) 
		{
			System.out.println("Exception occured: " + error);
			
			try
			{
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String dest = System.getProperty("user.dir");
				FileUtils.copyFile(src, new File(dest + "/Envison/"+ System.currentTimeMillis()+".png"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		public void beforeFindBy(By by, WebElement element, WebDriver driver)
		{
			System.out.println("Trying to find Element By : " + by.toString());
		}
		
		public void afterFindBy(By by, WebElement element, WebDriver driver)
		{
			System.out.println("Found Element By : " + by.toString());
		}
		
		
		/*
		 * non overridden methods of WebListener class
		 */
		public void beforeScript(String script, WebDriver driver) {
		}
		public void afterScript(String script, WebDriver driver) {
		}
		public void beforeAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
		}
		public void afterAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
		}
		public void afterAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
		}
		public void beforeAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
		}
		public void beforeNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
		}
		public void afterNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
		}
		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
		}
		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub

		}

		public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
			// TODO Auto-generated method stub

		}

		public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
			// TODO Auto-generated method stub

		}

		public void afterSwitchToWindow(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub

		}

		public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
			// TODO Auto-generated method stub

		}

		public void beforeGetText(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub

		}

		public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub

		}
		public void beforeNavigateTo(String url, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}


	}


