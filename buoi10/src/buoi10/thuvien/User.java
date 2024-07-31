package buoi10.thuvien;

import java.util.ArrayList;

public class User {
	private String userID;
	private String name;
	private ArrayList<Book> borrowedBook;
	
	public User(String id, String name) {
		this.userID = id;
		this.name = name;
		this.borrowedBook = new ArrayList<Book>();
		
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Book> getBorrowedBook() {
		return borrowedBook;
	}
	
	public void setBorrowedBook(ArrayList<Book> borrowedBook) {
		this.borrowedBook = borrowedBook;
	}
	
	public void borrow(Book b) {
		this.borrowedBook.add(b);
		
	}
	
	public void returnBook(Book b) {
		int idx = this.borrowedBook.indexOf(b);
		
		if (idx != -1) {
			this.borrowedBook.remove(idx);
			System.out.println(b.getName() + " return successfully");
		}
		else {
			System.out.println(b.getName() + " not found!");
		}
		
	}
	
	public void displayInfo() {
		System.out.println("User " + this.name + " ID: " + this.userID);
		System.out.println("Borrowed books: ");
		for (Book b : this.borrowedBook) {
			System.out.println("+ " + b.getName());
		}
	}
	
}
