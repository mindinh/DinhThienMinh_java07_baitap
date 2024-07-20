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
	
	public static void timSoLonNhat(int n, int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<n; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		
		System.out.print("Số lớn nhất trong mảng ở vị trí ");
		for (int i=0; i<n; i++) {
			if (arr[i] == max) {
				System.out.print(i + " ");
			}
		}

	}

	public static int timSoAmDauTien(int n, int[] arr) {
		
		for (int i=0; i<n; i++) {
			if (arr[i] < 0)
				return i;
		}
		
		return -1;
	}
	
	public static void timSoAmLonNhat(int n, int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<n; i++) {
			if (arr[i] < 0 && arr[i] >= max) {
				max = arr[i];
			}
		}
		
		System.out.print("Số âm lớn nhất trong mảng ở vị trí ");
		for (int i=0; i<n; i++) {
			if (arr[i] == max) {
				System.out.print(i + " ");
			}
		}
		
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
		if (n <= 0) {
			System.out.println("Ko hợp lệ");
		}
		else {
			int[] arr = new int[n];
			
			
			nhap(n, arr);
			xuat(n, arr);
			
			// b
			timSoLonNhat(n, arr);

			
			// c
			System.out.println("");
			int vitri2 = timSoAmDauTien(n, arr);
			System.out.println("Số âm đầu tiên ở vị trí " + vitri2);
			
			
			// d
			timSoAmLonNhat(n, arr);
			
			
			// e
			int tongChan = tongSoChan(n, arr);
			System.out.println("\nTổng các số chẵn trong mảng là " + tongChan);
			
			// f
			int demAm = demSoAm(n, arr);
			System.out.println("Có " + demAm + " số âm trong mảng");
			
			// g
			int tongAm = tongSoAm(n, arr);
			System.out.println("Tổng các số âm trong mảng là " + tongAm);
			
			// h 
			System.out.print("\nNhập x cần tìm: ");
			int x = sc.nextInt();
			
			if (timX(n, arr, x)) {
				System.out.println(x + " có trong mảng");
			}
			else {
				System.out.println(x + " ko có trong mảng");
			}
		}
		
		
			
			
		sc.close();

	}

}
