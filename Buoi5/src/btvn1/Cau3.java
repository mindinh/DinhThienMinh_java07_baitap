package btvn1;

import java.util.Scanner;

public class Cau3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int tong = 0;
		
		do {
			System.out.print("Nhập n > 0: ");
			n = sc.nextInt();
			
		} while (n <= 0);
		
		for (int i=1; i<n; i++) {
			if (i % 2 != 0) {
				tong += i;
			}
		}
		
		System.out.println("Tổng số nguyên dương lẻ < n là " + tong);
		
		
		
		sc.close();
	}
}
