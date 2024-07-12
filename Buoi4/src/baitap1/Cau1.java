package baitap1;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CURRENTYEAR = 2024;
		Scanner sc = new Scanner(System.in);
		
		String tenSV1 = "";
		int namsinhSV1 = 0;
		String tenSV2 = "";
		int namsinhSV2 = 0;
		String tenSV3 = "";
		int namsinhSV3 = 0;
		
		// nhập thông tin sv 1
		do {
			System.out.println("Nhập tên sinh viên 1: ");
			tenSV1 = sc.nextLine();
			System.out.println("Nhập năm sinh sinh viên 1: ");
			namsinhSV1 = sc.nextInt();
			// bỏ qua enter
			sc.nextLine();
		} while (namsinhSV1 <= 0 || namsinhSV1 >= CURRENTYEAR || tenSV1 == "");
		
		
		// nhập thông tin sv 2

		do {
			System.out.println("Nhập tên sinh viên 2: ");
			tenSV2 = sc.nextLine();
			System.out.println("Nhập năm sinh sinh viên 2: ");
			namsinhSV2 = sc.nextInt();
			sc.nextLine();
		} while (namsinhSV2 <= 0 || namsinhSV2 >= CURRENTYEAR || tenSV2 == "");
		
		
		
		// nhập thông tin sv 3
		do {
			System.out.println("Nhập tên sinh viên 3: ");
			tenSV3 = sc.nextLine();
			System.out.println("Nhập năm sinh sinh viên 3: ");
			namsinhSV3 = sc.nextInt();
			sc.nextLine();
		} while (namsinhSV3 <= 0 || namsinhSV3 >= CURRENTYEAR || tenSV3 == "");
		
		
		// nếu năm sinh của 1 sinh viên lớn hơn 2 sinh viên còn lại thì sv đó nhỏ tuổi nhất
		if (namsinhSV1 > namsinhSV2 && namsinhSV1 > namsinhSV3) {
			System.out.println("Sinh viên nhỏ tuổi nhất là " + tenSV1 + ". Sinh năm " + namsinhSV1);
			
		}
		else if (namsinhSV2 > namsinhSV1 && namsinhSV2 > namsinhSV3) {
			System.out.println("Sinh viên nhỏ tuổi nhất là " + tenSV2 + ". Sinh năm " + namsinhSV2);
			
		}
		else if (namsinhSV3 > namsinhSV1 && namsinhSV3 > namsinhSV2) {
			System.out.println("Sinh viên nhỏ tuổi nhất là " + tenSV3 + ". Sinh năm " + namsinhSV3);
			
		} // hoặc 3 sinh viên đều cùng năm sinh
		else {
			System.out.println("Sinh viên nhỏ tuổi nhất là " + tenSV3 + ". Sinh năm " + namsinhSV3);
		}
		
		
		
		sc.close();
	}

}
