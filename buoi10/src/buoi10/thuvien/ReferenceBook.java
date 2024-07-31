package buoi10.thuvien;

public class ReferenceBook extends Book {
	private String field;

	public ReferenceBook(String name, String isbn, String author, String field) {
		super(name, isbn, author);
		this.field = field;
		
	}
	
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("Field " + this.field);
	}
}
