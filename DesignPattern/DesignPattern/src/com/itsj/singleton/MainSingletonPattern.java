package com.itsj.singleton;

public class MainSingletonPattern {
	public static void main(String[] args) {
		SingletonPattern singletonPattern = SingletonPattern.getInstance();
		singletonPattern.showMessage();
	}
}
