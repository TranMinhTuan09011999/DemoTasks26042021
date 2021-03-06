package com.itsj.dao;

public class MainDAO {
	public static void main(String[] args) {
		Dao<Books> bookDao=  new BookDao();
		 
        Books book1 = bookDao.get(1).get();
        System.out.println("Book1: " + book1);
         
        book1.setBookName("updated." + book1.getBookName());
        bookDao.update(book1);
         
        System.out.println("All books: ");
        bookDao.getAll().forEach(book -> System.out.println(book));
	}
}
