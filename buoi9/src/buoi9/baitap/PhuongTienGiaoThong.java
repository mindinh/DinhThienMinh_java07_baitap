package buoi9.baitap;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	final int CURRENTYEAR = 2024;
	
	String hang;
	String mau;
	int namSX;
	
	void nhapTTXe() {
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Nhập hãng: ");
			this.hang = sc.nextLine();
			System.out.println("Nhập màu: ");
			this.mau = sc.nextLine();
			System.out.println("Nhập năm sản xuất: ");
			this.namSX = sc.nextInt();
			sc.nextLine();
		} while (this.hang == "" || this.mau == "" || this.namSX < 0 || this.namSX > CURRENTYEAR);
		
		
	}
	
	void inTTXe() {
		System.out.println("Nhập hãng: " + this.hang);		
		System.out.println("Nhập màu: " + this.mau);
		System.out.println("Nhập năm sản xuất: " + this.namSX);
		
	}
	
}
