package com.factory.method;

public class JSONWriter extends FileWriter {

	@Override
	public String getContent() {
		StringBuilder content = new StringBuilder();
		content.append("{'fname':'ketan','lname':'gote','email':'ketan.gote@gmail.com'}");
		return content.toString();
	}

}
