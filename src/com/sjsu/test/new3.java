package com.sjsu.test;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class new3 {

	@Test
	public void test3() throws Exception 
	{
		
		WebDriver driver = null;
		File appDir = new File("C://Andriod/sdk/build-tools/android-4.4.2");
		File app = new File(appDir, "IMDb.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(CapabilityType.VERSION, "4.3");
		capabilities.setCapability(CapabilityType.PLATFORM, "WINDOWS");
		// Here we mention the app's package name, to find the package name we
		// have to convert .apk file into java class files
		capabilities.setCapability("app-package", "com.imdb.mobile");
		// Here we mention the activity name, which is invoked initially as
		// app's first page.
		capabilities.setCapability("app-activity", "HomeActivity");
		// capabilities.setCapability("app-wait-activity","LoginActivity,NewAccountActivity");
		capabilities.setCapability("app", app.getAbsolutePath());

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		

		Thread.sleep(3000);
		List<WebElement> tvrecaps = driver.findElements(By.className("android.widget.ImageView"));
		tvrecaps.get(0);
		Thread.sleep(3000);
		driver.findElement(By.name("Celebs")).click();
		List<WebElement> images = driver.findElements(By.className("android.widget.ImageView"));
		if (images.size()==12)
		   
	     System.out.println("12 images are found in MostViewed Celebs");
		driver.findElement(By.name("STARmeter")).click();
	       Thread.sleep(3000);
	       List<WebElement> actors = driver.findElements(By.className("android.widget.TextView"));
	       boolean flag=false;
	       for(WebElement local: actors){
		         String list = local.getText();  
		       
		         if(list.contains("Jerry Gao")){
		      
		         System.out.println("Actor Verified");
		         }
		         else
		        	 flag=true;
		         System.out.println(list);
		        
		        }
	       if(flag)
	    	   
	       System.out.println("No actor Found");
	       
	         }
	        
}
