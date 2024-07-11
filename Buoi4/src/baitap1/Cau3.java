package baitap1;

import java.util.Scanner;

public class Cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// nhập thông tin cán bộ 1
		System.out.println("Nhập họ tên cán bộ 1 ");
		String tenCB1 = sc.nextLine();
		System.out.println("Nhập năm sinh cán bộ 1 ");
		int namsinhCB1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập giới tính cán bộ 1 (Nam/Nữ) ");
		String gioitinhCB1 = sc.nextLine();
		
		// nhập thông tin cán bộ 2
		System.out.println("Nhập họ tên cán bộ 2 ");
		String tenCB2 = sc.nextLine();
		System.out.println("Nhập năm sinh cán bộ 2 ");
		int namsinhCB2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập giới tính cán bộ 2 (Nam/Nữ) ");
		String gioitinhCB2 = sc.nextLine();
		
		// nhập thông tin cán bộ 3
		System.out.println("Nhập họ tên cán bộ 3");
		String tenCB3 = sc.nextLine();
		System.out.println("Nhập năm sinh cán bộ 3");
		int namsinhCB3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập giới tính cán bộ 3 (Nam/Nữ) ");
		String gioitinhCB3 = sc.nextLine();
		

		// nếu năm sinh của 1 cán bộ lớn hơn 2 cán bộ còn lại và giới tính là Nam thì sẽ là cán bộ nam nhỏ tuổi nhất
		if (namsinhCB1 > namsinhCB2 && namsinhCB1 > namsinhCB3 && (gioitinhCB1.equals("Nam"))) {
			System.out.println("Cán bộ nam trẻ nhất là " + tenCB1 + " sinh năm " + namsinhCB1);
		}
		else if (namsinhCB2 > namsinhCB1 && namsinhCB2 > namsinhCB3 && (gioitinhCB2.equals("Nam"))) {
			System.out.println("Cán bộ nam trẻ nhất là " + tenCB2 + " sinh năm " + namsinhCB2);
		}
		else if (namsinhCB3 > namsinhCB1 && namsinhCB3 > namsinhCB2 && (gioitinhCB3.equals("Nam"))) {
			System.out.println("Cán bộ nam trẻ nhất là " + tenCB3 + " sinh năm " + namsinhCB3);
		}
		else {
			System.out.println("Không có cán bộ nam trẻ nhất");
		}
		
		
		
		
		sc.close();
	}

}
