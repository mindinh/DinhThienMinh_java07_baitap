package buoi8.baitap2;

import java.util.ArrayList;
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
		if (index < 0 || index >= n) {
			System.out.println("Vị trí ko hợp lệ");
			return arr;
		}
		else {
			int[] res = new int[n-1];
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
	
	public static void cau5(String choice, ArrayList<Integer> ds) {
		Scanner sc = new Scanner(System.in);
		
		switch (choice) {
			case "0":case "xem":
				System.out.println(ds);
				break;
			case "1": case "thêm":
				System.out.println("Nhập 1 số nguyên");
				int n = sc.nextInt();
				ds.add(n);
				System.out.println("Đã thêm " + n + " vào danh sách");
				break;
			case "2": case "xóa":
				System.out.println("Nhập 1 số nguyên trong mảng muốn xóa");
				int nToRemove = sc.nextInt();
				int idxToRemove = ds.indexOf(nToRemove);
				if (idxToRemove != -1) {
					ds.remove(Integer.valueOf(nToRemove));
					System.out.println("Đã xóa " + nToRemove + " khỏi danh sách");
				}
				else {
					System.out.println(nToRemove + " Ko tồn tại");
				}
				
				break;
			case "3": case "sửa":
				System.out.println("Nhập 1 số nguyên trong mảng muốn cập nhật");
				int nToUpdate = sc.nextInt();
				int idxToUpdate = ds.indexOf(nToUpdate);
				if (idxToUpdate != -1) {
					System.out.println("Nhập 1 số nguyên mới");
					int newN = sc.nextInt();
					ds.set(idxToUpdate, newN);
					System.out.println("Đã sửa " + nToUpdate + " thành " + newN + " trong danh sách");

				}
				else {
					System.out.println(nToUpdate + " Ko tồn tại");
				}
				break;
			default:
				System.out.println("Lựa chọn ko hợp lệ");
				break;
		}
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
		
		for (int i=0; i<n-1; i++) {
			boolean swapped = false;
			for (int j=0; j<n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if (!swapped)
				break;
		}
		
	}
	
	public static int[] xoaTrungLap(int n, int[] arr) {
		// sắp xếp mảng tăng dần để gom những số trùng nhau lại
		sapXepMang(n, arr);
		int[] tmp = new int[n];
		int j = 0;
		
		for (int i=0; i<n-1; i++) {
			if (arr[i] != arr[i+1]) {
				tmp[j] = arr[i];
				j++;
			}
		}
		tmp[j++] = arr[n-1];
		
		int[] res = new int[j];
		for (int i=0; i<j; i++) {
			res[i] = tmp[i];
		}
		
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
	
	public static void inMang(int n, int[] arr) {
		System.out.print("Các phần tử trong mảng ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		
		try {
			System.out.println("Nhập số lượng phần tử: ");
			n = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nhập 1 số!");
		} 
		
		if (n < 1) {
			System.out.println("Ko hợp lệ");
		} 
		else {
			int[] arr = nhapMang(n);
			
			inMang(n , arr);
			
			// cau 1
			System.out.println("Tổng các phần tử lẻ trong mảng là " + tinhTongSoLe(n, arr));
			
			// cau 2
			System.out.println("\nNhập số nguyên cần đếm trong mảng: ");
			int n2 = sc.nextInt();
			System.out.println("Số lần xuất hiện của " + n2 + " trong mảng là " + demX(n, arr, n2));
			
			// cau 3
			System.out.println("\nNhập vị trí phần tử trong mảng cần xóa");
			int index = sc.nextInt();
			arr = xoaPhanTu(n, arr, index);
			inMang(n, arr);
			
			// sau khi xóa 1 phần tử thì số lượng phần tử sẽ giảm đi 1
			n = arr.length;
			// cau 4
			demMangSoAm0Duong(n, arr);
			
			// cau 5
			// sử dụng arraylist mới
			sc.nextLine();
			ArrayList<Integer> ds = new ArrayList<Integer>();
			System.out.println("\nNhập 1.Thêm 2.Xóa 3.Sửa 0.Xem ds -1.Thoát");
			String choice;
			while (true) {
				// nhập số 1 hoặc input 'thêm' ...
				choice = sc.nextLine();
				if (choice.equals("-1") || choice.equals("thoát")) {
					break;
				}
				cau5(choice, ds);
				
			} 
			
			// cau 6
			System.out.println("\nNhập tiền gốc ");
			double goc = sc.nextDouble();
			System.out.println("Nhập lãi suất hàng năm ");
			double lai = sc.nextDouble();
			System.out.println("Nhập số năm ");
			double nam = sc.nextDouble();
			tinhLaiSuat(goc, lai, nam);
			sc.nextLine();
			System.out.println("enter để tiếp tục");
			sc.nextLine();
			
			// cau 7
			inBangNhan();
			
			// cau 8
			// sau khi xóa trùng lặp thì mảng sẽ theo thứ tự tăng dần
			System.out.println("Mảng xóa phần tử trùng lặp");
			int[] newArr = xoaTrungLap(n, arr);
			inMang(newArr.length, newArr);
			
			// cau 9
			// sử dụng mảng sau khi xóa trùng lặp
			System.out.println("\nNhập 1 số nguyên: ");
			int n3 = sc.nextInt();
			System.out.println("Số phần tử lớn hơn " + n3 + " là " + demSoLonHonX(newArr.length, newArr, n3)); 
			
			// cau 10
			// sử dụng mảng sau khi xóa trùng lặp
			System.out.println("\nNhập 1 số nguyên: ");
			int n4 = sc.nextInt();
			System.out.println("Tổng số nguyên tố nhỏ hơn " + n4 + " là " + tongSNTNhoHonX(newArr.length, newArr, n4));
			
			
		}
		
		
		
		sc.close();
	}

}
