package buoi6.baitap1;

import java.util.Scanner;

public class BaiTap1Application {
	
	public static double timSoLonNhat(double a, double b, double c) {
		// nếu 1 số lớn hơn 2 số còn lại thì số đó là lớn nhất
		// nếu ko thì cả 3 số đều bằng nhau
		double max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
		
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
	
	public static float chia(int a, int b) {
		return (float) a / b;
	}
	
	public static void menu(int choice, int a, int b) {
		
		switch (choice) {
		case 1:
			System.out.println("a + b = " + tong(a, b));
			break;
		case 2:
			System.out.println("a - b = " + hieu(a, b));
			break;
		case 3:
			System.out.println("a * b = " + tich(a, b));
			break;
		case 4:
			if (b == 0)
				System.out.println("Số bị chia phải khác 0");
			else
				System.out.println("a / b = " + chia(a, b));
			break;
		default:
			System.out.println("Phép tính ko hợp lệ");
			break;
		}
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
			
			
		System.out.println("1: Cộng, 2: Trừ, 3: Nhân, 4: Chia");
		int choice = sc.nextInt();
			
		menu(choice, a1, b1);	

		
		
		
		sc.close();
	}

}
