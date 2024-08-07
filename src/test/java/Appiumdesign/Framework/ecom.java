package Appiumdesign.Framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

@Test
public class ecom {
	
	public AndroidDriver driver;
	public void ecomproject() throws MalformedURLException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Madhu_EMU");
		options.setApp("C:\\Users\\madhukar.v\\eclipse-workspace\\Appium\\YBL\\src\\test\\java\\Resources\\General-Store.apk");
		//options.setChromedriverExecutable("C:\\Users\\madhukar.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//options.setCapability("browserName", "chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
	}
	
	public void git()
	{
		System.out.println("user 2");
		System.out.println("user 1");
		System.out.println("user merge");
	}
	
	public void merge()
	{
		
		System.out.println("merge");
	}

}
