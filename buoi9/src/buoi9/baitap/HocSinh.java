package buoi9.baitap;

import java.util.Scanner;

public class HocSinh {
	String ten;
	int tuoi;
	double toan;
	double ly;
	double hoa;
	
	boolean kTraHopLe() {
		return (this.ten != "" && this.tuoi > 0 && (this.toan >= 0 && this.toan <= 10) && (this.ly >= 0 && this.ly <= 10)
				&& (this.hoa >= 0 && this.hoa <= 10));
	}
	
	void nhapHS() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tên ");
			this.ten = sc.nextLine();
			System.out.println("Nhập tuổi ");
			this.tuoi = sc.nextInt();
			System.out.println("Nhập điểm toán ");
			this.toan = sc.nextDouble();
			System.out.println("Nhập điểm lý ");
			this.ly = sc.nextDouble();
			System.out.println("Nhập điểm hóa ");
			this.hoa = sc.nextDouble();
			
			if (kTraHopLe() == false) {
				System.out.println("Thông tin học sinh ko hợp lệ!");
			}
		} while (kTraHopLe() == false);
		

	}
	
	void tinhDTB() {
		double diemTB = (toan + ly + hoa) / 3;
		System.out.printf("Điểm trung bình %.2f", diemTB);
		System.out.println("\n");
	}
	
	void inHS() {
		System.out.println("Ten " + this.ten);
		System.out.println("Tuoi " + this.tuoi);
		System.out.println("Toan: " + this.toan + " Ly: " + this.ly + " Hoa: " + this.hoa);
		this.tinhDTB();
	}
	
}
