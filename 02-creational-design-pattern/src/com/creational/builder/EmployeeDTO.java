package com.creational.builder;

public class EmployeeDTO {


	private final String email;
	private final String from;
	private final String cc;
	private final String bcc;
	private final String subject;

	public EmployeeDTO(String email, String from,  String cc, String bcc, String subject) {
		super();
		this.email = email;
		this.from = from;
		this.cc = cc;
		this.bcc = bcc;
		this.subject = subject;
	}

	public static class Builder {

		private String email;
		private String from;
		private String to;
		private String cc;
		private String bcc;
		private String subject;

		public Builder email(String _email) {
			this.email = _email;
			return this;
		}

		public Builder from(String _from) {
			this.from = _from;
			return this;
		}
 

		public Builder cc(String _cc) {
			this.cc = _cc;
			return this;
		}

		public Builder bcc(String _bcc) {
			this.bcc = _bcc;
			return this;
		}

		public Builder subject(String _subject) {
			this.subject = _subject;
			return this;
		}

		public EmployeeDTO build() {
			return new EmployeeDTO(email, from, cc, bcc, subject);
		}

	}

	
	
	@Override
	public String toString() {
		return "EmailBuilderExample [email=" + email + ", from=" + from + ", cc=" + cc + ", bcc=" + bcc + ", subject="+ subject + "]";
	}





}
