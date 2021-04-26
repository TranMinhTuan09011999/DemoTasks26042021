package com.itsj.dependencyinjection;

public class MainDependencyInjection {
	public static void main(String[] args) {
		Message message = new EmailMessage();
		
		User user = new User(message);
		user.send();
	}
}
