package buoi6.baitap1;

import java.util.Scanner;

public class BaiTap1Application {
	
	public static double timSoLonNhat(double a, double b, double c) {
		if (a > b && a > c) {
			return a;
		}
		else if (b > a && b > c) {
			return b;
		}
		else if (c > a && c > b) {
			return c;
		}
		else {
			return -1;
		}
		
	}
	
	public static boolean soChanLe(double x) {
		if (x % 2 == 0)
			return true;
		return false;
	}
	
	public static double tinhTong3So(double a, double b, double c) {
		
		return a + b + c;
		
	}
	
	public static int tong(int a, int b) {
		return a + b;
	}
	
	public static int hieu(int a, int b) {
		return a - b;
	}
	
	public static int tich(int a, int b) {
		return a * b;
	}
	
	public static int chia(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// cau 1
		System.out.println("Nhập 3 số: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.println("Số lớn nhất là " + timSoLonNhat(a, b, c));
		
		// cau 2
		System.out.println("Nhập 1 số: ");
		double x = sc.nextDouble();
		
		if (soChanLe(x)) {
			System.out.println(x + " là số chẵn");
		}
		else {
			System.out.println(x + " là số lẻ");
		}
		
		// cau 3
		System.out.println("Nhập 3 số: ");
		double so1 = sc.nextDouble();
		double so2 = sc.nextDouble();
		double so3 = sc.nextDouble();

		System.out.println("Tổng 3 số là " + tinhTong3So(so1, so2, so3));
		

		// cau 4
		
		System.out.println("Nhập 2 số nguyên khác 0: ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		
		
		System.out.println("1: +, 2: -, 3: *, 4: /");
		int choice = sc.nextInt();
			
		switch (choice) {
			case 1:
				System.out.println("a + b = " + tong(a1, b1));
				break;
			case 2:
				System.out.println("a - b = " + hieu(a1, b1));
				break;
			case 3:
				System.out.println("a * b = " + tich(a1, b1));
				break;
			case 4:
				if (b == 0)
					System.out.println("Số bị chia phải khác 0");
				else
					System.out.println("a / b = " + chia(a1, b1));
				break;
			default:
				System.out.println("Phép tính ko hợp lệ");
				break;
		}
		
		
		
		sc.close();
	}

}
