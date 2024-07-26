package buoi8.baitap2;

import java.util.Scanner;

public class BT2Application {
	
	public static boolean kTraSNT(int n) {
		if (n < 2) {
			return false;
		}
		
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static int[] nhapMang(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập từng phần tử trong mảng ");
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static int tinhTongSoLe(int n, int[] arr) {
		int tong = 0;
		for (int i=0; i<n; i++) {
			if (arr[i] % 2 != 0)
				tong += arr[i];
		}
		
		return tong;
	}
	
	public static int demX(int n, int[] arr, int x) {
		int dem = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] == x) {
				dem += 1;
			}
		}
		
		return dem;
	}
	
	public static int[] xoaPhanTu(int n, int[] arr, int index) {
		int[] res = new int[n];
		int j=0;
		
		for(int i=0; i<index; i++) {
			res[j] = arr[i];
			j++;
		}
		
		for (int i=index+1; i<n; i++) {
			res[j] = arr[i];
			j++;
		}
		
		return res;
	}
	
	public static void demMangSoAm0Duong(int n, int[] arr) {
		int dem0 = 0, demAm = 0, demDuong = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] == 0) 
				dem0 += 1;
			if (arr[i] < 0)
				demAm += 1;
			if (arr[i] > 0) 
				demDuong += 1;
		}
		
		String res = String.format("Mảng có %o số âm, %o số 0, %o số dương.",  demAm, dem0, demDuong);
		System.out.println(res);
		
	}
	
	public static void tinhLaiSuat(double tienGoc, double lai, double tg) {
		double kq = tienGoc * (1 + lai * tg);
		
		System.out.println("tổng tiền là " + kq);
	}
	
	
	public static void inBangNhan() {
		for (int i=1; i<=10; i++) {
			System.out.println("Bảng nhân cho " + i);
			for (int j=1; j<=10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
	
	public static void sapXepMang(int n, int[] arr) {
		
		
	}
	
	public static int[] xoaTrungLap(int n, int[] arr) {
		int[] res = new int[n];
		

		return res;
	}
	
	public static int demSoLonHonX(int n, int[] arr, int x) {
		int dem = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] > x) {
				dem += 1;
			}
		}
		
		return dem;
	}
	
	public static int tongSNTNhoHonX(int n, int[] arr, int x) {
		int tong = 0;
		
		for (int i=0; i<n; i++) {
			if (kTraSNT(arr[i]) && arr[i] < x) {
				tong += arr[i];
			}
		}
		
		return tong;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = nhapMang(10);
		
		int[] newArr = xoaTrungLap(10, arr);
		for (int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

}
