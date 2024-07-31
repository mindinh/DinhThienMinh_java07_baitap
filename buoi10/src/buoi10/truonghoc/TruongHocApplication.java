package buoi10.truonghoc;


public class TruongHocApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// làm chung Hệ thống trường học
		Course c1 = new Course("math 101", "MTH101");
		Course c2 = new Course("physics 101", "PHY101");
		
		Student a = new Student("Stu Dent", 20, "123 ads", "S123");
		
		Teacher t1 = new Teacher("Tea Cher", 42, "214 tew", "T123");
		t1.assign("Math");
		Teacher t2 = new Teacher("Tea Cher2", 39, "2434 uio", "T124");
		t2.assign("Physics");
		
		c1.assignTeacher(t1);
		c2.assignTeacher(t2);
		
		a.enroll(c2);
		a.enroll(c1);
		
		a.displayInfo();
		System.out.println("\n");
		t1.displayInfo();
		System.out.println("\n");
		t2.displayInfo();
		System.out.println("\n");
		
		c1.displayInfo();
		c2.displayInfo();
		
	}

}
