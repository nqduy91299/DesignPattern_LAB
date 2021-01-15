package DP.duynguyen.lab1;

public class TestLogger {
	public static void main(String[] args) {
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		System.out.println("Test Logger " + logger1.toString());
		System.out.println("Test Logger " + logger2.toString());
	}
}
