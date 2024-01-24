package com.mvntestpractice;

import org.testng.annotations.Test;

public class mvn1test 
{
	@Test(groups="smoke")
	public void demo1Test()
	{
		System.out.println("---test1---");
	}
	
	@Test(groups="smoke")
	public void demo2Test()
	{
		System.out.println("---test2---");
	}	

}
