package com.kk.dp;

public class Singleton {
	private Singleton()
	{
		
	}
	
	private static Singleton singleton=null;
	
	public static Singleton getInstance()
	{
		System.out.println("object fetching");
		if(singleton==null)
		{
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void test()
	{
		System.out.println("object created");
	}

}


