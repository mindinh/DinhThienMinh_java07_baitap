package baitap;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// cau 4
		// tạo hằng số N = số lượng chữ số là 5
        final int N = 5;
        
        // tạo biến tích lũy cộng 5 số
        int accumulate = 0;
        System.out.println("Input 5 numbers: ");
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        
        accumulate /= N;
        System.out.println("Average of 5 numbers: " + accumulate);
        

		sc.close();
	}
}
