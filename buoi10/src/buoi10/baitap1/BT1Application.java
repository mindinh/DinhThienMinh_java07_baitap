package buoi10.baitap1;

import java.util.ArrayList;

public class BT1Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> be = new ArrayList<String>();
		be.add("sdfasf");
		be.add("adadadad");
		FullTimeEmployee a = new FullTimeEmployee("A", 25, 300);
		a.calculate_salary();
		a.display_info();
		
		
		
		PartTimeEmployee b = new PartTimeEmployee("B", 22, 50, 0.46);
		b.calculate_salary();
		b.display_info();
	}

}
