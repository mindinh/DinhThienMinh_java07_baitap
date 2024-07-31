package buoi10.thuvien;

public class TextBook extends Book {
	private String subject;

	public TextBook(String name, String isbn, String author, String subject) {
		super(name, isbn, author);
		this.subject = subject;
		
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("Subject " + this.subject);
	}
}
