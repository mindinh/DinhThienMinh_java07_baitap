package btvn2;

import java.util.Scanner;

public class Cau2_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập n ");
		int n = sc.nextInt();
		
		for (; n < 1;) {
			System.out.println("Nhập n ");
			n = sc.nextInt();
		}
		int sumEven = 0;
		
		for (int i=1; i<=n; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		
		System.out.println("Tổng các số chắn từ 1 đến " + n + " là " + sumEven);
		
		
		sc.close();

	}

}
