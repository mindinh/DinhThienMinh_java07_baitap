package btvn1;

import java.util.Scanner;

public class Cau5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tienGui;
		do {
			System.out.println("Nhập số tiền ban đầu");
			tienGui = sc.nextInt();
		} while (tienGui < 1);
		
		int tienMuon;
		do {
			System.out.println("Nhập số tiền muốn có trong tương lai");
			tienMuon = sc.nextInt();
		} while (tienMuon < 1);
		
		
		double lai;
		do {
			System.out.println("Nhập % lãi tiết kiệm");
			lai = sc.nextDouble();
		} while (lai < 0);
		
		
		lai /= 100;
		int soNam = 0;
		while (tienGui < tienMuon) {
			tienGui *= (1 + lai);
			System.out.println(tienGui);
			++soNam;
		}

		System.out.println("Số năm cần gửi " + soNam);
		
		
		sc.close();
		

	}

}
