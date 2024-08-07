package Appiumdesign.Framework;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Appiumdesign.Framework.utilities.Android_actions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ecomone extends ecom {

	public AndroidDriver options;
	@Test
	
	public void loginpg() throws MalformedURLException, InterruptedException
	{
		ecomproject();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageForm pageform = new PageForm(driver);
		pageform.namefieldinput("madhu");
		pageform.genderselection("female");
		pageform.countryname("Belize");
		pageform.submit();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("android:id/text1")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belize\"))")).click();
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("madhu");
		//driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		//driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//without entering name if we submit below o/p will get
		//System.out.println(driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name"));
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
		
		for(int i=0; i<driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size(); i++)
		{
			String names = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(names.equalsIgnoreCase("Jordan 6 Rings"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
			
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			
			
		}
		
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text", "Cart"));
	
	String pname = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	Assert.assertEquals(pname, "Jordan 6 Rings");
	Thread.sleep(6000);
	WebElement ele = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
	
	((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) ele).getId(), "duration",2000
		));
	Thread.sleep(2000);
	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(3000);		
	driver.findElement(By.xpath("//android.widget.CheckBox")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	Thread.sleep(8000);
	Set<String> contexts = driver.getContextHandles();
	//driver.context()
	for(String Cont : contexts)
	{
		System.out.println(Cont);
	}
	Thread.sleep(6000);
	driver.context("WEBVIEW_com.androidsample.generalstore");
	
	
	Thread.sleep(8000);
	driver.findElement(By.name("q")).sendKeys("Madhukar");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	
	
	}

}
