package buoi10.thuvien;

public class Book {
	private String name;
	private String isbn;
	private String author;
	
	public Book(String name, String isbn, String author) {
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title " + this.name + " ISBN " + this.isbn + " by " + this.author);
	}
	
}
