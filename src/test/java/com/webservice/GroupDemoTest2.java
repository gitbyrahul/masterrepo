package com.webservice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.commonSDataSetup;

public class GroupDemoTest2  extends commonSDataSetup{
	
		
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
