package com.webservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.commonSDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest extends commonSDataSetup{

	@Test
	public void titleTest() 
	{
		SoftAssert softassert = new SoftAssert();
		String ExpectedTitle = "Electronics, Cars, hh Fashion, Collectibles & More | eBay";
		String ExpectedText = "Search1";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		String ActualTitle = driver.getTitle();
		
		System.out.println("Verifying Title");
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		
		String ActualText = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verifying Text");

		softassert.assertEquals(ActualText, ExpectedText, "Text verification failed");
		System.out.println("Closing Browser");

		driver.close();
		softassert.assertAll();
	}

}
