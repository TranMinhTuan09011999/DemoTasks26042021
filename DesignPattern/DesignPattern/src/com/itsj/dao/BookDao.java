package com.itsj.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDao implements Dao<Books>{

	 private List<Books> books = new ArrayList<>();
	 
	 public BookDao() {
		 books.add(new Books(1, "Java Program"));
		 books.add(new Books(2, "C# Program"));
	 }
	 
	@Override
	public List<Books> getAll() {
		return books;
	}

	@Override
	public Optional<Books> get(int id) {
		return books.stream().filter(u -> u.getBookId() == id).findFirst();
	}

	@Override
	public void save(Books t) {
		books.add(t);
	}

	@Override
	public void update(Books book) {
		get(book.getBookId()).ifPresent(existUser -> {
            existUser.setBookName(book.getBookName());
        });
	}

	@Override
	public void delete(Books book) {
		get(book.getBookId()).ifPresent(existUser -> books.remove(existUser));
	}
	
}
