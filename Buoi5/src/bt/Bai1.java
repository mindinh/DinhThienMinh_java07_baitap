package bt;

import java.util.Scanner;

public class Bai1 {
	
	public static void nhap(int n, int[] arr) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập từng phần tử: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	
	public static void xuat(int n, int[] arr) {
		System.out.print("Mảng chứa: ");
		
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static int timSoLonNhat(int n, int[] arr) {
		int idx = 0, max = Integer.MIN_VALUE;
		
		for (int i=0; i<n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		
		
		return idx;
	}
	
	public static int timSoAmDauTien(int n, int[] arr) {
		
		for (int i=0; i<n; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static int timSoAmLonNhat(int n, int[] arr) {
		int idx = 0, min = arr[0];
		
		for (int i=1; i<n; i++) {
			if (arr[i] < min) {
				min = arr[i];
				idx = i;
			}
		}
		
		
		return idx;
	}
	
	public static int tongSoChan(int n, int[] arr) {
		int tong = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] % 2 == 0) {
				tong += arr[i];
			}
		}
		
		
		return tong;
	}
	
	public static int demSoAm(int n, int[] arr) {
		int count = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] < 0) {
				count += 1;
			}
		}
		
		
		return count;
	}
	
	public static int tongSoAm(int n, int[] arr) {
		int tong = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] < 0) {
				tong += arr[i];
			}
		}
		
		
		return tong;
	}
	
	public static boolean timX(int n, int x, int[] arr) {
		
		for (int i=0; i<n; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số phần tử n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// a
		nhap(n , arr);
		xuat(n, arr);
		
		// b
		int vitri = timSoLonNhat(n, arr);
		System.out.println("\nPhần tử lớn nhất ở vị trí " + vitri);
		
		// c
		int soAm = timSoAmDauTien(n, arr);
		System.out.println("Số âm đầu tiên ở vị trí " + soAm);
		
		// d
		int soAmLonNhat = timSoAmLonNhat(n, arr);
		System.out.println("Số âm lớn nhất ở vị trí " + soAmLonNhat);
		
		// e
		int tongSoChan = tongSoChan(n, arr);
		System.out.println("Tổng các số chẵn trong mảng " + tongSoChan);
		
		// f
		int demSoAm = demSoAm(n, arr);
		System.out.println("Có " + demSoAm + " số âm trong mảng");
		
		// g
		int tongSoAm = tongSoAm(n, arr);
		System.out.println("Tổng các số âm trong mảng " + tongSoAm);
		
		// h
		System.out.print("Nhập x cần tìm: ");
		int x = sc.nextInt();
		
		if (timX(n, x, arr)) {
			System.out.println(x + " có trong mảng");
		}
		else {
			System.out.println(x + " ko có trong mảng");
		}
		
		
		sc.close();
	}

}
