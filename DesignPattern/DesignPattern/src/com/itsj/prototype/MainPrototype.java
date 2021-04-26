package com.itsj.prototype;

public class MainPrototype {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Window10","Black","Chrome","FireWall");
		Laptop laptop2 = laptop1.clone();
		laptop2.setOthers("Teamviewer");
		
		System.out.println(laptop1);
		System.out.println(laptop2);
	}
}
