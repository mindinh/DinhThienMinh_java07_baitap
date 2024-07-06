package baitap;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// cau 1
		System.out.println("Nhap Canh goc vuong 1: "); 
		float cgv1 = sc.nextFloat();
		System.out.println("Nhap Canh goc vuong 2: "); 
		float cgv2 = sc.nextFloat();
		float cHuyen = (float) Math.sqrt(Math.pow(cgv1, 2) + Math.pow(cgv2, 2));
		System.out.println("Do dai canh huyen: " + cHuyen);
		 
		
	
        
		sc.close();

	}

}
