package com.webservice;

import org.testng.SkipException;
import org.testng.annotations.Test;

import common.commonSDataSetup;

public class SkipDemoTest extends commonSDataSetup{
	
	boolean datasetup = false;
	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not complete");
	}
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test forcefully");
		throw new SkipException("Skipping this test");
	}
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on condition");
		if(datasetup == true) {
			System.out.println("Execute test");
		}else {
			System.out.println("Do not execute further steps");
			throw new SkipException(" Do not execute further steps ");

		}
	}
	
}
