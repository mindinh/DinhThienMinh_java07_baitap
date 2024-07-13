package btvn2;

import java.util.Scanner;

public class Cau3_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for (int i=0; i<=1000; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		
		System.out.println("Có " + count + " số chia hết cho 3 từ 0-1000");
		
		sc.close();

	}

}
