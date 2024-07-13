package btvn2;

import java.util.Scanner;

public class Cau2_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập n ");
		int n = sc.nextInt();
		
		while (n < 1) {
			System.out.println("Nhập n ");
			n = sc.nextInt();
		}
		
		int sumEven = 0, i = 1;
		
		while (i <= n) {
			if (i % 2 == 0) {
				sumEven += i;
			}
			i++;
		}
		
		System.out.println("Tổng các số chắn tử 1 đến " + n + " là " + sumEven);
		
		sc.close();
	}

}
