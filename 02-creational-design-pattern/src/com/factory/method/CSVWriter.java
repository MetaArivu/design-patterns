package com.factory.method;

public class CSVWriter extends FileWriter{

	@Override
	public String getContent() {
		return "ketan,gote, ketan.gote@gmail.com";
	}
}
