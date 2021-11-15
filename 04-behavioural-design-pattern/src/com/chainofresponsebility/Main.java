package com.chainofresponsebility;

public class Main {

	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

		fileLogger.setNextLogger(new ConsoleLogger(AbstractLogger.INFO));

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

		errorLogger.setNextLogger(fileLogger);
		

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		//loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		
		System.out.println();
		
		//loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		System.out.println();
		
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}
