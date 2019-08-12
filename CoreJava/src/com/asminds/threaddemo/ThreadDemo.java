package com.asminds.threaddemo;

class Emp extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Emp t1=new Emp();
		Emp t2=new Emp();
		t1.run();
		t2.run();
	}
}
