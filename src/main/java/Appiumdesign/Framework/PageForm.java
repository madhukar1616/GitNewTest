package Appiumdesign.Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Appiumdesign.Framework.utilities.Android_actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageForm extends Android_actions{
	
	AndroidDriver driver;
	
	
	
	public PageForm (AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement namefield;
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("madhu");
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement genderradiobtn;
	
	//driver.findElement(By.id("android:id/text1")).click();
	@AndroidFindBy(id="android:id/text1")
	private WebElement country;
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	WebElement submit;
	
	public void namefieldinput(String name)
	{
		namefield.sendKeys(name);
		
	}
	
	public void genderselection(String gender)
	{
		if (gender.contains("female"))
		genderradiobtn.click();
	}
	
	public void countryname(String countryName)
	{
		country.click();
		Scrollbar(countryName);
		
	}
	
	public void submit()
	{
		submit.click();
	}
	

}
