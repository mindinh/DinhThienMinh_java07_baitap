package btvn2;

import java.util.Scanner;

public class Cau3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0, i = 0;
		
		while (i <= 1000) {
			if (i % 3 == 0) {
				count++;
			}
			i++;
		}
		
		System.out.println("Có " + count + " số chia hết cho 3 từ 0-1000");
		
		sc.close();
	}

}
