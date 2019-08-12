package com.asminds.exception;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) throws PiinoException,ArithmeticException {
		int pinno=1000;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Pinno");
		int newPinno=s.nextInt();
		
		if(pinno==newPinno) {
			System.out.println("Valid Pinno");
		}else {
			throw new PiinoException("Invalid Pinno");
		}
		
	}
}
