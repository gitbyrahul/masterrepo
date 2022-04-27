package com.webservice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.commonSDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest extends commonSDataSetup{
	@Test
		public void titleTest() 
		{
			String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com");
			driver.manage().window().maximize();
			String ActualTitle = driver.getTitle();
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			
			driver.close();
		}
}
