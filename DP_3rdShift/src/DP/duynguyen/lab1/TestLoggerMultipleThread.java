package DP.duynguyen.lab1;

public class TestLoggerMultipleThread {
	public static void main(String[] args) {
		MultipleThread multipleThread1 = new MultipleThread("1");
		MultipleThread multipleThread2 = new MultipleThread("2");
		MultipleThread multipleThread3 = new MultipleThread("3");
		
		Thread t1 = new Thread(multipleThread1);
		Thread t2 = new Thread(multipleThread2);
		Thread t3 = new Thread(multipleThread3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
