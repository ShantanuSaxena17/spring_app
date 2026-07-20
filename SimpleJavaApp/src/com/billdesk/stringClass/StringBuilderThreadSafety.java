package com.billdesk.stringClass;


public class StringBuilderThreadSafety {
	public static void main(String[] args) throws InterruptedException{
		
		StringBuffer sb = new StringBuffer(""); 
		
		Runnable task = ()->{
			for(int i = 0; i <= 1000; i++) {
				sb.append("A"); 
			}
		};
		
		Thread th1 = new Thread(task);
		Thread th2 = new Thread(task); 
		
		th1.start(); 
		th2.start();
		
		th1.join(); 
		th2.join(); 
		
		
		System.out.println(sb.length());
	}
}
