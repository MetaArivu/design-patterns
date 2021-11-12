package com.dip;

public class JSONFormatter implements Formatter {

	public String format(Message message) throws FormatException {
		return message.toJson();
	}
}
