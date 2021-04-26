package com.itsj.dependencyinjection;

public class SmsMessage implements Message{
	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}
	
}