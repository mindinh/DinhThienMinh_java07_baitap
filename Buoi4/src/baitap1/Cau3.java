package baitap1;

import java.util.Scanner;

public class Cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CURRENTYEAR = 2024;
		Scanner sc = new Scanner(System.in);
		
		String tenCB1 = "";
		int namsinhCB1 = 0;
		String gioitinhCB1 = "";
		
		String tenCB2 = "";
		int namsinhCB2 = 0;
		String gioitinhCB2 = "";
		
		String tenCB3 = "";
		int namsinhCB3 = 0;
		String gioitinhCB3 = "";
		
		// nhập thông tin cán bộ 1
		do {
			System.out.println("Nhập họ tên cán bộ 1 ");
			tenCB1 = sc.nextLine();
			System.out.println("Nhập năm sinh cán bộ 1 ");
			namsinhCB1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập giới tính cán bộ 1 (Nam/Nữ) ");
			gioitinhCB1 = sc.nextLine();
		} while (namsinhCB1 <= 0 || namsinhCB1 > CURRENTYEAR || tenCB1 == "" || (gioitinhCB1 == "" && (!gioitinhCB1.equals("Nam") || !gioitinhCB1.equals("Nữ"))));
		
			
		// nhập thông tin cán bộ 2
		do {
			System.out.println("Nhập họ tên cán bộ 2 ");
			tenCB2 = sc.nextLine();
			System.out.println("Nhập năm sinh cán bộ 2 ");
			namsinhCB2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập giới tính cán bộ 2 (Nam/Nữ) ");
			gioitinhCB2 = sc.nextLine();
		} while (namsinhCB2 <= 0 || namsinhCB2 > CURRENTYEAR || tenCB2 == "" || (gioitinhCB1 == "" && (!gioitinhCB1.equals("Nam") || !gioitinhCB1.equals("Nữ"))));
		
		// nhập thông tin cán bộ 3
		do {
			System.out.println("Nhập họ tên cán bộ 3 ");
			tenCB3 = sc.nextLine();
			System.out.println("Nhập năm sinh cán bộ 3 ");
			namsinhCB3 = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập giới tính cán bộ 3 (Nam/Nữ) ");
			gioitinhCB3 = sc.nextLine();
		} while (namsinhCB3 <= 0 || namsinhCB3 > CURRENTYEAR || tenCB3 == "" || (gioitinhCB1 == "" && (!gioitinhCB1.equals("Nam") || !gioitinhCB1.equals("Nữ"))));
		

		// nếu năm sinh của 1 cán bộ lớn hơn 2 cán bộ còn lại và giới tính là Nam thì sẽ là cán bộ nam nhỏ tuổi nhất
		if ((namsinhCB1 > namsinhCB2 && namsinhCB1 > namsinhCB3 && gioitinhCB1.equals("Nam") && gioitinhCB2.equals("Nam") && gioitinhCB3.equals("Nam")) 
				|| (namsinhCB1 > namsinhCB2 && gioitinhCB3.equals("Nữ") && gioitinhCB2.equals("Nam")) || (namsinhCB1 > namsinhCB3 && gioitinhCB2.equals("Nữ") && gioitinhCB3.equals("Nam"))
				|| (gioitinhCB1.equals("Nam") && gioitinhCB2.equals("Nữ") && gioitinhCB3.equals("Nữ"))) {
			
			System.out.println("Cán bộ nam trẻ nhất là " + tenCB1 + " sinh năm " + namsinhCB1);
		
		}
		else if ((namsinhCB2 > namsinhCB1 && namsinhCB2 > namsinhCB3 && gioitinhCB2.equals("Nam") && gioitinhCB1.equals("Nam") && gioitinhCB3.equals("Nam"))
				|| (namsinhCB2 > namsinhCB1 && gioitinhCB3.equals("Nữ") && gioitinhCB1.equals("Nam")) || (namsinhCB2 > namsinhCB3 && gioitinhCB1.equals("Nữ") && gioitinhCB3.equals("Nam"))
				|| (gioitinhCB2.equals("Nam") && gioitinhCB1.equals("Nữ") && gioitinhCB3.equals("Nữ"))) {
		
			System.out.println("Cán bộ nam trẻ nhất là " + tenCB2 + " sinh năm " + namsinhCB2);
		
		}
		else if ((namsinhCB3 > namsinhCB1 && namsinhCB3 > namsinhCB2 && gioitinhCB3.equals("Nam") && gioitinhCB1.equals("Nam") && gioitinhCB2.equals("Nam"))
				|| (namsinhCB3 > namsinhCB2 && gioitinhCB1.equals("Nữ") && gioitinhCB2.equals("Nam")) || (namsinhCB3 > namsinhCB1 && gioitinhCB2.equals("Nữ") && gioitinhCB1.equals("Nam"))
				|| (gioitinhCB3.equals("Nam") && gioitinhCB1.equals("Nữ") && gioitinhCB2.equals("Nữ"))) {
		
			System.out.println("Cán bộ nam trẻ nhất là " + tenCB3 + " sinh năm " + namsinhCB3);
		
		}
		else {
		
			System.out.println("Không có cán bộ nam trẻ nhất");
		
		}
		
		
		
		
		sc.close();
	}

}
