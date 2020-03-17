package com.cts.base;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;


public class LaunchWebDriver 
{
	public static WebDriver driver;
		
	public static void beforeMethod()
	{
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// pageLoad
		driver.get("http://demowebshop.tricentis.com/");
		
	}
	
	@After
	public static void afterMethod()
	{
		Date date = new Date();
		String dateStr = date.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/screenshot/image_" + dateStr + ".png"));
		
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}

}
