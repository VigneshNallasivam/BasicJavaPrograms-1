package com.java.day1;

public class StaticMethods 
{
 static int num0=5;
 static int num1=10;
 int num2;
 
 static int mul()
 {
	 return num0*num1;
 }
 
 public static void main(String[] args) 
 {
	 StaticMethods obj = new StaticMethods();
	 System.out.println("The Output Is : " +obj.mul());
 }

}
