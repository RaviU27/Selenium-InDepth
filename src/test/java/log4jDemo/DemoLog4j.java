package log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 class DemoLog4j {
	
   static Logger log = LogManager.getLogger(DemoLog4j.class);
	
	public static void main(String[] args) {
		System.out.println("Hello World...");
		
		log.info("This is the information message");
		log.error("This is an error msg");
		log.warn("This is warning");
		
	}
	static class test{
		
		System.out.println("test");
	}
}