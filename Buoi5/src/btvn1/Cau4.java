package btvn1;

import java.util.Scanner;

public class Cau4 {
	
	public static long solve(int n, int x) {
		long res = 0;
		
		for (int i=1; i<=n; i++) {
			res += Math.pow(x, i);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.print("Nhập n: ");
			n = sc.nextInt();
		}
		
		System.out.print("Nhập x: ");
		int x = sc.nextInt();
		
		long res = solve(n, x);
		System.out.println("Tổng S(n) = x + x^2 + x^3 + ... + x^n = " + res);
		

		
		sc.close();
	}

}
