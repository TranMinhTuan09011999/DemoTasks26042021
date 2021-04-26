package com.itsj.dependencyinjection;

public class EmailMessage implements Message{
	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}
}
