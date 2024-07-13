package bt;

import java.util.Scanner;

public class Cau1 {
	public static long tongSoDuong(int n, int[] arr) {
		long tong = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] > 0) {
				tong += arr[i];
			}
			
		}
		
		return tong;
	}
	
	public static long tongSoLe(int n, int[] arr) {
		long tong = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] % 2 != 0) {
				tong += arr[i];
			}
			
		}
		
		return tong;
	}
	
	public static int demSoDuong(int n, int[] arr) {
		int count = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] > 0) {
				count += 1;
			}
			
		}
		
		return count;
	}
	
	public static int timSoNhoNhat(int n, int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
		
		return min;
	}
	
	public static int timSoDuongNhoNhat(int n, int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<n; i++) {
			if (arr[i] < min && arr[i] > 0) {
				min = arr[i];
			}
			
		}
		
		return min;
	}
	
	public static int timSoChanCuoiCung(int n, int[] arr) {
		
		for (int i=n-1; i>=0; i--) {
			if (arr[i] % 2 == 0) {
				return arr[i];
			}
			
		}
		
		return -1;
	}
	
	public static int timSoChanDauTien(int n, int[] arr) {
		
		for (int i=0; i<n; i++) {
			if (arr[i] % 2 == 0) {
				return arr[i];
			}
			
		}
		
		return -1;
	}
	
	public static boolean kiemTraSNT(int n) {
		if (n < 1)
			return false;
		for (int i=2; i<Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int timSNTDauTien(int n, int[] arr) {
		
		for (int i=0; i<n; i++) {
			if (arr[i] > 0 && kiemTraSNT(arr[i])) {
				return arr[i];
			}
			
		}
		
		return -1;
	}
	
	public static int timSoDuongCuoiCung(int n, int[] arr) {
		
		for (int i=n-1; i>=0; i--) {
			if (arr[i] > 0) {
				return arr[i];
			}
			
		}
		
		return -1;
	}
	
	public static int timSoChanNhoNhat(int n, int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<n; i++) {
			if (arr[i] % 2 == 0 && arr[i] < min) {
				min = arr[i];
			}
			
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số phần tử n ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Nhập từng phần tử: ");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int choice = -1;
		do {
			System.out.println("Nhập 1 để tìm tổng các số dương.");
			System.out.println("Nhập 2 để tìm tổng các số lẻ.");
			System.out.println("Nhập 3 để đếm các số dương.");
			System.out.println("Nhập 4 để tìm số nhỏ nhất.");
			System.out.println("Nhập 5 để tìm số dương nhỏ nhất.");
			System.out.println("Nhập 6 để tìm số chẵn cuối cùng trong mảng.");
			System.out.println("Nhập 7 để tìm số chẵn đầu tiên trong mảng.");
			System.out.println("Nhập 8 để tìm số nguyên tố đầu tiên trong mảng.");
			System.out.println("Nhập 9 để tìm số dương cuổi cùng.");
			System.out.println("Nhập 10 để tìm số chẵn nhỏ nhất trong mảng.");
			
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("Tổng các số dương " + tongSoDuong(n, arr));
					break;
				case 2:
					System.out.println("Tổng các số lẻ " + tongSoLe(n, arr));
					break;
				case 3:
					System.out.println("Có " + demSoDuong(n, arr) + " các số dương " );
					break;
				case 4:
					System.out.println("Số nhỏ nhất trong mảng là " + timSoNhoNhat(n, arr));
					break;
				case 5:
					System.out.println("Số dương nhỏ nhất trong mảng là " + timSoDuongNhoNhat(n, arr));
					break;
				case 6:
					System.out.println("Số chẵn cuối cùng trong mảng là " + timSoChanCuoiCung(n, arr));
					break;
				case 7:
					System.out.println("Số chẵn đầu tiên trong mảng là " + timSoChanDauTien(n, arr));
					break;
				case 8:
					System.out.println("Số nguyên tố đầu tiên trong mảng là " + timSNTDauTien(n, arr));
					break;
				case 9:
					System.out.println("Số dương cuối cùng trong mảng là " + timSoDuongCuoiCung(n, arr));
					break;
				case 10:
					System.out.println("Giá trị chẵn nhỏ nhất trong mảng là " + timSoChanNhoNhat(n, arr));
					break;
				default:
					System.out.println("Lựa chọn ko hợp lệ. ");
					break;
				
			}
		} while (choice != 0);
		
		
		sc.close();
	}

}
