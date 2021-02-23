package wrapperclasses;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class BrowserInitiation{
	
	public WebDriver driver;
	public OperatingSystem WIN;
	public OperatingSystem MAC;
	public EventFiringWebDriver e_driver;
	public WebEventListener eventListener;
	
	@BeforeTest
	@Parameters({"os", "browser", "url"})
	public WebDriver browserinit(String os, String browser, String url) {
		
		
		if(os.equalsIgnoreCase("Windows") || browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().operatingSystem(WIN.WIN).setup();
			driver= new ChromeDriver();
		}
		else if(os.equalsIgnoreCase("Windows") || browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().operatingSystem(WIN.WIN).setup();
			driver= new FirefoxDriver();
		}
		else if(os.equalsIgnoreCase("Mac") || browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().operatingSystem(MAC.MAC).setup();
			driver= new ChromeDriver();
		}
		else if(os.equalsIgnoreCase("Mac") || browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().operatingSystem(MAC.MAC).setup();
			driver= new FirefoxDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		return driver;
		
	}
	
	@AfterTest
	public void browserClose(){
		
		driver.quit();
		
	}

	
}
