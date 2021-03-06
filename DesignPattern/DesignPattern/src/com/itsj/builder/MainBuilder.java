package com.itsj.builder;

public class MainBuilder {
	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder("Tuan", "Tran")
		.age(20)
		.phone("0377730290")
		.address("QuangNgai")
		.build();
		System.out.println(user1);
		 
	    User user2 = new User.UserBuilder("Tan", "Tran")
	    .age(22)
	    .phone("0377720593")
	    .build();	 
	    System.out.println(user2);
	 
	    User user3 = new User.UserBuilder("Dao", "Nguyen")
	    .build(); 
	    System.out.println(user3);
	}
}
