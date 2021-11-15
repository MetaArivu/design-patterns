package com.creational.factory.method;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println(new JSONWriter().getFile());
		System.out.println(new CSVWriter().getFile());
	}
}
