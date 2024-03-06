package anu.Appium;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() 
	{
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), null);
		
	}
		
	
}
 
