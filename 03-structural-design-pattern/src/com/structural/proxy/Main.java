package com.structural.proxy;

public class Main {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("jane");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
