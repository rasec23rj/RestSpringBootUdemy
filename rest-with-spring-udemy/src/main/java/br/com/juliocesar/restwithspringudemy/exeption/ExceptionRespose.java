package br.com.juliocesar.restwithspringudemy.exeption;

import java.util.Date;

public class ExceptionRespose {

	private static final long serivalVersionUID = 1L;

	private Date timestamp;
	private String message;
	private String details;

	public ExceptionRespose(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
