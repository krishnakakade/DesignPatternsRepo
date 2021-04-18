package com.kk.dp;

public class SingltonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		singleton.test();
	}

}
