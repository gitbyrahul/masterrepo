package com.webservice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.commonSDataSetup;
@Test(groups="user-registrtion")
public class GroupDemoTest extends commonSDataSetup{
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Run After Class");
	}
	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("Run this Before regression");
	}
	@AfterGroups(value="regression")
	public void AfterGroup() {
		System.out.println("Run this After regression ");
	}
	
	@Test(priority = 1, groups="regression" )
	public void aTest1() {
		System.out.println("Test01");
	}
	@Test(priority = 2, groups="regression" )
	public void bTest2() {
		System.out.println("Test02");

	}
	@Test(groups={"regression", "sanity"})
	public void bTest3()
	{
		System.out.println("test3");
	}
	@Test(groups="sanity")
	public void bTest4()
	{
		System.out.println("test4");
	}
}
