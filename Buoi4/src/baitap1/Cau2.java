package baitap1;

import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// nhập 3 số
		int a, b, c;
		System.out.println("Nhập 3 số nguyên: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// tạo biến đếm chẵn lẻ
		int countOdd = 0, countEven = 0;
		
		// nếu a là số chẵn thì đếm chẵn tăng 1 ngược lại đếm lẻ tăng 1
		if (a % 2 == 0) {
			countEven += 1;
		}
		else {
			countOdd += 1;
		}
		
		// nếu b là số chẵn thì đếm chẵn tăng 1 ngược lại đếm lẻ tăng 1
		if (b % 2 == 0) {
			countEven += 1;
		}
		else {
			countOdd += 1;
		}
		
		// nếu c là số chẵn thì đếm chẵn tăng 1 ngược lại đếm lẻ tăng 1
		if (c % 2 == 0) {
			countEven += 1;
		}
		else {
			countOdd += 1;
		}
		
		System.out.println("Có "+ countEven + " số chẵn và " + countOdd + " số lẻ.");
		
		sc.close();
	}

}
