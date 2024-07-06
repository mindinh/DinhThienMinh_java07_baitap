package baitap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// cau 2
		System.out.println("Nhap so thuc a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap n nguyen ko am: ");
		int n = sc.nextInt();
		float kqCau2 = (float) (a * Math.pow(8, n));
		System.out.println("P(ax^n) = " + kqCau2);

		sc.close();
	}

}
