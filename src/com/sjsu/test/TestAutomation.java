package com.sjsu.test;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestAutomation 
{
	public static void main(String args[]) throws MalformedURLException, InterruptedException
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
		
		
		
		
		
		//Automating test case for select current location checkbox
		
				
				
			List<WebElement> tvrecaps = driver.findElements(By.className("android.widget.ImageView"));
				tvrecaps.get(0);
				Thread.sleep(3000);
		driver.findElement(By.name("Movies")).click();
			
		    Thread.sleep(3000);
			driver.findElement(By.name("Showtimes & Tickets")).click();
			 Thread.sleep(7000);
			 driver.findElement(By.name("Today")).click();
			 driver.findElement(By.name("Friday")).click();
			Thread.sleep(7000);
			 driver.findElement(By.name("Your Location")).click();
			 
			 //WebElement ele = driver.findElement(By.className("android.widget.EditText"));
	
			
			

			
			 driver.findElement(By.className("android.widget.Button")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.name("Theaters")).click();
			 driver.findElement(By.name("Your Location")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.className("android.widget.CheckBox")).click();
			 driver.findElement(By.className("android.widget.EditText")).click();
			 
		        
			 driver.findElement(By.className("android.widget.Spinner")).click();
			 
			 driver.findElement(By.name("United Kingdom")).click();
			/* List<WebElement> texts1 = driver.findElements(By.className("android.widget.FrameLayout"));
			 for(WebElement donekey: texts1){
		         String list = donekey.getText();        
		         if(list.equals("enter")){
		          donekey.click();
		         }
		        }*/
			 driver.findElement(By.className("android.widget.Button")).click();
			 
			
			 
			 
			
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void Search()
	{
		
		
		
		
	}
}