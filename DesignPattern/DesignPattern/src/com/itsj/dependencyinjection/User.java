package com.itsj.dependencyinjection;

public class User {
	private Message message;

	public User(Message message) {
		super();
		this.message = message;
	}
	
	public void send() {
		message.sendMessage("Hello...");
	}
}
