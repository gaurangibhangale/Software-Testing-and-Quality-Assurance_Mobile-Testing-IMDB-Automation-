package com.sjsu.test;

import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class finaltest {
	WebDriver driver = null;

	
    /*public void setUp() throws Exception {
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
    }*/
 
  

	@Test
	public void test1() throws Exception 
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
		driver.findElement(By.name("Movies")).click();

		Thread.sleep(3000);
		driver.findElement(By.name("Showtimes & Tickets")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Today")).click();
		driver.findElement(By.name("Friday")).click();
	Thread.sleep(3000);
		driver.findElement(By.name("Your Location")).click();
		//Runtime.getRuntime().exec("cmd.exe /c start");
		//Runtime runtime=Runtime.getRuntime();
		//String[] cmd= {"C:\Andriod\sdk\platform-tools\"};
		//Process p = runtime.exec(cmd);

		//WebElement ele = driver.findElement(By.className("android.widget.EditText"));


		//driver.findElement(By.className("android.widget.Button")).click();
		//Thread.sleep(5000);
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.className("android.widget.Spinner")).click();
		driver.findElement(By.name("United Kingdom")).click();
		driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(7000);
		
		List<WebElement> movielist = driver.findElements(By.className("android.widget.TextView"));
		for(WebElement local: movielist){
	         String list = local.getText();  
	         if (list.contains("A Thousand Times Good Night") || list.contains("American Interior") || list.contains("Blue Ruin"))
	         {
	       
	       System.out.println(list);
	         System.out.println("Movies found");
	         }
	         
	         }
		

	 //driver.findElement(By.className("android.widget.Spinner")).click();

	 //driver.findElement(By.name("United Kingdom")).click(); */
		 
		
		 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
	}
	
	@Test
	public void test2() throws Exception 
	{
		Thread.sleep(80000);
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
		driver.findElement(By.name("Movies")).click();

		Thread.sleep(3000);
		driver.findElement(By.name("Showtimes & Tickets")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("Theaters")).click();
		driver.findElement(By.name("Today")).click();
		driver.findElement(By.name("Friday")).click();
	Thread.sleep(3000);
		//driver.findElement(By.name("Your Location")).click();
		//driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(4000);
		List<WebElement> texts1 = driver.findElements(By.className("android.widget.RelativeLayout"));
		texts1.get(3).click();
		
		List<WebElement> texts2 = driver.findElements(By.className("android.widget.TextView"));
		for(WebElement local: texts2){
	         String list = local.getText();  
	       
	         if(list.contains("San Jose")){
	       System.out.println(list);
	         System.out.println("Location Verified");
	         }
	        }
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	}
	
	
	
	@Test
	public void test3() throws Exception 
	{
		Thread.sleep(80000);
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
	       for(WebElement local: actors){
		         String list = local.getText();  
		       
		         if(list.contains("Jerry Gao")){
		       System.out.println(list);
		         System.out.println("Actor Verified");
		         
		         }
		         else System.out.println("No actor Found");
		        }
	         }
	
	@Test
	public void test4() throws Exception 
	{
		Thread.sleep(80000);
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
	driver.findElement(By.name("STARmeter")).click();
	       Thread.sleep(3000);
	       List<WebElement> actors = driver.findElements(By.className("android.widget.TextView"));
	       for(WebElement local: actors){
		         String list = local.getText();  
		       
		         if(list.contains("Jerry Gao")){
		       System.out.println(list);
		         System.out.println("Actor Verified");
		         
		         }
		         else System.out.println("No actor Found");
		        }
	         }
	        
	        
}
		


