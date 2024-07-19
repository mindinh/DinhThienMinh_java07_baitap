package buoi7.btvn1;

import java.util.Scanner;

public class BT1Application {
	
	public static void bai1(int n) {
		if (n >= 0) {
			System.out.println("Đây là số nguyên dương");
		}
		else {
			System.out.println("Đây là số nguyên âm");
		}
	}
	
	public static String bai11(int n) {
		if (n % 2 == 0) {
			return "Số chẵn";
		}
		else {
			return "Số lẻ";
		}
	}
	
	public static boolean kiemTraSNT(int n) {
		if (n <= 1)
			return false;
		
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n % i == 0) 
				return false;
		}
		
		return true;
	}
	
	public static void bai2(int n) {
		switch(n) {
			case 1:
				System.out.println("Một");
				break;
			case 2:
				System.out.println("Hai");
				break;
			case 3:
				System.out.println("Ba");
				break;
			case 4:
				System.out.println("Bốn");
				break;
			case 5:
				System.out.println("Năm");
				break;
			case 6:
				System.out.println("Sáu");
				break;
			case 7:
				System.out.println("Bảy");
				break;
			case 8:
				System.out.println("Tám");
				break;
			case 9:
				System.out.println("Chín");
				break;
			case 10:
				System.out.println("Mười");
				break;
			default:
				System.out.println("Số nhập vào ko hợp lệ");
		}
		
	}
	
	public static int bai3(int n) {
		int tong = 0;
		
		for (int i=0; i<=n; i++) {
			if (i % 2 == 0)
				tong += i;
		}
		
		return tong;
	}
	
	public static void timMinMax(int n, int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i=0; i<n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Số lớn nhất trong mảng là: " + max);
		System.out.println("Số nhỏ nhất trong mảng là: " + min);


	}
	
	public static double dienTichHVuong(double rong) {
		return rong * rong;
	}
	
	public static double chuViHVuong(double rong) {
		return rong * 4;
	}
	
	public static void xuatMang(int n, int[] arr) {
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void xuatSoChanTrongMang(int n, int[] arr) {
		for (int i=0; i<n; i++) {
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// bai 1
		System.out.println("Nhập 1 số nguyên ");
		int n = sc.nextInt();
		bai1(n);
		
		// bai 1.1
		System.out.println("Nhập 1 số nguyên ");
		int n1 = sc.nextInt();
		System.out.println(bai11(n1));
		
		// bai 1.2
		System.out.println("Nhập 1 số nguyên ");
		int n2 = sc.nextInt();
		if (kiemTraSNT(n2))
			System.out.println(n2 + " là số nguyên tố");
		else
			System.out.println(n2 + " Không phải số nguyên tố");
		
		// bai 2
		System.out.println("Nhập 1 số nguyên từ 1 đến 10");
		int n3 = sc.nextInt();
		bai2(n3);
		
		// bai 3
		System.out.println("Nhập 1 số nguyên dương > 0 ");
		int n4 = sc.nextInt();
		System.out.println("Tổng từ 0 - " + n4 + " là " + bai3(n4));
		
		// bai 4
		System.out.println("Nhập n phần tử số nguyên ");
		int n5 = sc.nextInt();
		if (n5 <= 0) {
			System.out.println("Ko hợp lệ");
		}
		else {
			double sum = 0;
			for (int i=0; i<n5; i++) {		
				System.out.println("Nhập số nguyên thứ " + (i+1) + " ");
				sum += sc.nextInt();
			}
			System.out.println("Trung bình của " + n5 + " số nguyên là " + sum / n5);
			
		}
		
		// bai 5
		System.out.println("Nhập n phần tử số nguyên ");
		int n6 = sc.nextInt();
		if (n6 <= 0) {
			System.out.println("Ko hợp lệ");
		}
		else {
			int[] arr = new int[n6];
			System.out.println("Nhập n phần tử nguyên trong mảng ");
			for (int i=0; i<n6; i++) {		
				arr[i] = sc.nextInt();
			}
			timMinMax(n6, arr);
		}
		
		
		// bai 6
		System.out.println("Nhập chiều rộng của hình vuông ");
		double rong = sc.nextDouble();
		if (rong <= 0) {
			System.out.println("Ko hợp lệ");
		}
		else {
			System.out.printf("Diện tích hình vuông " + dienTichHVuong(rong));
			System.out.printf("\nChu vi hình vuông " + chuViHVuong(rong));
		}
		

		
		// bai 7
		System.out.println("\nNhập n phần tử nguyên ");
		int n7 = sc.nextInt();
		int[] arr2 = new int[n7];
		
		if (n7 <= 0) {
			System.out.println("Ko hợp lệ");
		}
		else {
			System.out.println("Nhập n phần tử nguyên trong mảng ");
			for (int i=0; i<n7; i++) {
				arr2[i] = sc.nextInt();
			}
			
			System.out.print("\nCác phần tử nguyên trong mảng ");
			xuatMang(n7, arr2);
		}
		
		
		// bai 8
		System.out.println("\nNhập n phần tử nguyên ");
		int n8 = sc.nextInt();
		if (n8 <= 0) {
			System.out.println("Ko hợp lệ");
		}
		else {
			int[] arr3 = new int[n8];
			System.out.println("Nhập n phần tử nguyên trong mảng ");
			for (int i=0; i<n8; i++) {
				arr3[i] = sc.nextInt();
				
			}
			
			System.out.print("\nCác phần tử nguyên chẵn trong mảng ");
			xuatSoChanTrongMang(n8, arr3);
		}
		
		
		
		sc.close();
	}

}
