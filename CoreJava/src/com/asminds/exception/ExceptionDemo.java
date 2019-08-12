package com.asminds.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		try
		{
		System.out.println("Hii");
		int r=10/0;
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("Welcome");
		}
	}
}
