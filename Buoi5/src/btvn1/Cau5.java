package btvn1;

import java.util.Scanner;

public class Cau5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tienGui = 5000000;
		int tienMuon = 50000000;
		
		float lai = 0.046f;
		
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
