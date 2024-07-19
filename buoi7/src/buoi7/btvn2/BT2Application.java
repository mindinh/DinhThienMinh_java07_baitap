package buoi7.btvn2;

import java.util.Scanner;

public class BT2Application {
	
	public static void nhap(int n, int[] arr) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập từng phần tử: ");
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void xuat(int n, int[] arr) {
		
		System.out.println("Các phần tử trong mảng: ");
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static int[] timSoLonNhat(int n, int[] arr) {
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i=0; i<n; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				index = i;
			}
		}
		
		for (int i=0; i<n; i++) {
			if (arr[i] == max) {
				cnt++;
			}
		}
		
		int[] res;
		if (cnt > 1) {
			res = new int[cnt];
			for (int i=0, j=0; i<n; i++) {
				if (arr[i] == max) {
					res[j] = i;
					j++;
				}
			}
		}
		else {
			res = new int[1];
			res[0] = index;
		}
		
		
		return res;
	}

	public static int timSoAmDauTien(int n, int[] arr) {
		
		for (int i=0; i<n; i++) {
			if (arr[i] < 0)
				return i;
		}
		
		return -1;
	}
	
	public static int[] timSoAmLonNhat(int n, int[] arr) {
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i=0; i<n; i++) {
			if (arr[i] < 0 && arr[i] >= max) {
				max = arr[i];
				index = 1;
			}
		}
		
		for (int i=0; i<n; i++) {
			if (arr[i] == max) {
				cnt++;
			}
		}
		
		int[] res;
		if (cnt > 1) {
			res = new int[cnt];
			for (int i=0, j=0; i<n; i++) {
				if (arr[i] == max) {
					res[j] = i;
					j++;
				}
			}
		}
		else {
			res = new int[1];
			res[0] = index;
		}
		
		
		return res;
	}
	
	public static int tongSoChan(int n, int[] arr) {
		int tong = 0;
		for (int i=0; i<n; i++) {
			if (arr[i] % 2 == 0)
				tong += arr[i];
		}
		
		return tong;
	}
	
	public static int demSoAm(int n, int[] arr) {
		int dem = 0;
		for (int i=0; i<n; i++) {
			if (arr[i] < 0)
				dem += 1;
		}
		
		return dem;
	}
	
	public static int tongSoAm(int n, int[] arr) {
		int tong = 0;
		for (int i=0; i<n; i++) {
			if (arr[i] < 0)
				tong += arr[i];
		}
		
		return tong;
	}
	
	public static boolean timX(int n, int[] arr, int x) {
		
		for (int i=0; i<n; i++) {
			if (arr[i] == x)
				return true;
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số lượng phần tử: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
	
		
		nhap(n, arr);
		xuat(n, arr);
		
		// b
		int[] vitri = timSoLonNhat(n, arr);
		System.out.print("Số lớn nhất ở vị trí ");
		for (int i=0; i<vitri.length; i++)
			System.out.print(vitri[i] + " ");
//		
//		// c
//		int vitri2 = timSoAmDauTien(n, arr);
//		System.out.println("Số âm đầu tiên ở vị trí " + vitri2);
		
		
		// d
		int[] vitri3 = timSoAmLonNhat(n, arr);
		System.out.print("\nSố âm lớn nhất ở vị trí ");
		for (int i=0; i<vitri3.length; i++)
			System.out.print(vitri3[i] + " ");
		
		// e
//		int tongChan = tongSoChan(n, arr);
//		System.out.println("\nTổng các số chẵn trong mảng là " + tongChan);
//		
//		// f
//		int demAm = demSoAm(n, arr);
//		System.out.println("Có " + demAm + " số âm trong mảng");
//		
//		// g
//		int tongAm = tongSoAm(n, arr);
//		System.out.println("Tổng các số âm trong mảng là " + tongAm);
//		
//		// h 
//		System.out.print("\nNhập x cần tìm: ");
//		int x = sc.nextInt();
//		
//		if (timX(n, arr, x)) {
//			System.out.println(x + " có trong mảng");
//		}
//		else {
//			System.out.println(x + " ko có trong mảng");
//		}
//		
			
			
		sc.close();

	}

}
