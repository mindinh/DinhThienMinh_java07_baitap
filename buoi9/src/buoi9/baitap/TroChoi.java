package buoi9.baitap;

public class TroChoi {
	String ten;
	int soLuot = 0;
	
	
	void batDau() {
		System.out.println("Welcome to " + this.ten);
		System.out.println("......................");
		soLuot += 1;
	}
	
	void choiLai() {
		System.out.println("Restarting");
		System.out.println("......................");
		soLuot += 1;
		
	}
	
	void ketThuc() {
		System.out.println("Exiting " + this.ten);
		System.out.println("......................");
		System.out.println("Số lượt chơi là " + this.soLuot );
	}
}
