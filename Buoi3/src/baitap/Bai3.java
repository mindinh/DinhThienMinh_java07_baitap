package baitap;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// cau 3
        System.out.println("Nhap so nguyen n co 2 chu so");
        int num = sc.nextInt();
        int kqCau3 = 0;
       
        kqCau3 += num%10;
        num /= 10;
        kqCau3 += num%10;
        
        System.out.println("Tong cac chu so cua n: " + kqCau3);
        

		sc.close();

	}

}
