package test;

import java.util.Scanner;

public class demobuoi3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// cau 1
		System.out.println("Nhap Canh goc vuong 1: "); 
		float cgv1 = sc.nextFloat();
		System.out.println("Nhap Canh goc vuong 2: "); 
		float cgv2 = sc.nextFloat();
		float cHuyen = (float) Math.sqrt(Math.pow(cgv1, 2) + Math.pow(cgv2, 2));
		System.out.println("Do dai canh huyen: " + cHuyen);
		 
		// cau 2
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap x: ");
		int x = sc.nextInt();
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		float res = (float) (a * Math.pow(x, n));
		System.out.println("P(ax^n) = " + res);
		

        // cau 3
        System.out.println("Nhap so nguyen n co 2 chu so");
        int n = sc.nextInt();
        int res = 0;
        while (n > 0) {
            res += n%10;
            n /= 10;
        }
        System.out.println("Tong cac chu so cua n: " + res);
        
        
        // cau 4
        /*final int N = 5;
        int accumulate = 0;
        System.out.println("Input 5 numbers: ");
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();
        accumulate += sc.nextInt();

        System.out.println("Average of 5 numbers: " + accumulate / N);*/

        // cau 5
        /*System.out.println("Nhap do C: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (float) ((celsius*1.8) + 32.0);
        System.out.println("Do F tuong duong: " + fahrenheit + "℉");*/

        // cau 6
        /*System.out.println("Enter money in US dollars $: ");
        float dollars = sc.nextFloat();
        float vnd = dollars * 23500;
        System.out.println("$" + dollars + " = " + vnd + "VND");*/
		
		
		sc.close();
	}
}
