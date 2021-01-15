package DP.duynguyen.lab1;

public class Logger {
	private Logger() {}
	
	private static Logger uniqueInstance;
	
 	 public static Logger getInstance() {
		if(uniqueInstance == null) {
			synchronized (Logger.class) {
				if(uniqueInstance == null) {					
					uniqueInstance = new Logger();
				}
			}
		}
		return uniqueInstance;
	}
	
}
