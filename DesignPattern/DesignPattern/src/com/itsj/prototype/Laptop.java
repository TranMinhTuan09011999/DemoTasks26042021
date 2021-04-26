package com.itsj.prototype;

public class Laptop implements Cloneable{
	private String os;
	private String color;
	private String browser;
	private String others;
	
	public Laptop(String os, String color, String browser, String others) {
		super();
		this.os = os;
		this.color = color;
		this.browser = browser;
		this.others = others;
	}
	
	@Override
	protected Laptop clone() {
		try {
			return (Laptop) super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Laptop [os=" + os + ", color=" + color + ", browser=" + browser + ", others=" + others + "]";
	}
	
	public void setOthers(String others) {
		this.others = others;
	}
	
}
