package com.orgHrm.Tests;

public class basicfun 
{

	public static void main(String[] args) 
	{
		function1();
		
		String res=function2();
		System.out.println(res);
		
		basicfun b=new basicfun();
		b.function3();
		
		res=b.function4();
		System.out.println(res);
	}
	
	//static function without returning any value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//static function with returning value
	public static String function2()
	{
		System.out.println("This is finction 2 code");
		return "Pass";
	}
	
	//non static function without returning value
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//non static function with returning value
	public String function4()
	{
		System.out.println("This is function4 code");
		return "Fail";
	}
}
