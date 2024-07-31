package buoi10.thuvien;

public class ThuVienApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// làm chung bài tập Hệ thống quản lý thư viện có người dùng
		Book b = new Book("ADADAD", "A123", "Adaaf Fsoa");
		b.displayInfo();
		
		TextBook t = new TextBook("Math 11", "M123", "sfasdf tew", "Math");
		t.displayInfo();
		
		ReferenceBook r = new ReferenceBook("RefBook", "R123", "rgfd fgsd", "Physics");
		r.displayInfo();
		System.out.println("\n");

		User a = new User("U123", "Ng van a");
		a.borrow(t);
		a.borrow(r);
		a.displayInfo();
		
		System.out.println("\n");
		
		a.returnBook(b);
		a.returnBook(r);
		a.displayInfo();
	}

}
