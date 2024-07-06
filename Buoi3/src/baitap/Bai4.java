package baitap;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// cau 4
        final int N = 5;
        int accumulate = 0;
        System.out.println("Input 5 numbers: ");
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();

        System.out.println("Average of 5 numbers: " +  (accumulate / N));
        

		sc.close();
	}
}
