package com.webservice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.commonSDataSetup;

public class LoginTest extends commonSDataSetup{
	
	
	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login To Application (BT)");
		
	}
	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from Application (AT)");
	}
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected (BM)");
	}
	@AfterMethod
	public void disconnectFronDB() {
		System.out.println("DB Disconnected (AM)");
	}
	@Test(priority = 1, description= " This is login test")
	public void loginTest() {
		System.out.println("Test01");
	}
	@Test(priority = 2, description = "This is logout test")
	public void LogoutTest() {
		System.out.println("Test02");

	}
}
