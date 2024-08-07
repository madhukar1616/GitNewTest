package Appiumdesign.Framework.utilities;



import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Android_actions {
	
	
	AndroidDriver driver;
	
	
	
	public Android_actions (AndroidDriver driver)
	
	{
		this.driver = driver;
	}
	
	
	public void Scrollbar(String Countryname) 
	{
			
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+Countryname+"))")).click();;
			
		
	}

}
