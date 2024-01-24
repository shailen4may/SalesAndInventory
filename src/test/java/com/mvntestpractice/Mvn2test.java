package com.mvntestpractice;

import org.testng.annotations.Test;

public class Mvn2test
{
	@Test(groups="smoke")
	public void demo3Test()
	{
		System.out.println("---test3---");
	}
	
	@Test
	public void demo4Test()
	{
		System.out.println("---test4---");
	}	

}
