package com.creational.factory.method;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public abstract class FileWriter {

	public String getFile() throws IOException {
		String fileName = Calendar.getInstance().getTimeInMillis()+".txt";
		String content = this.getContent();
		BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(new File(fileName)));
		bw.append(content);
		bw.close();
		return fileName;
	}

	public abstract String getContent();

}