package buoi6.baitap2;

import java.util.Scanner;


public class BaiTap2Application {
	public static final int soPhutCho = 3;

	public static final double[][] tien = {{8000, 7500, 7000, 2000}, 
											{9000, 8500, 8000, 3000}, 
											{10000, 9500, 9000, 3500}};
	
	public static int nhapLoaiXe() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nhập loại xe (1. Grab Car, 2.Grab SUV, 3.Grab Black)");
		String loaiXe = sc.nextLine();
		
		if (loaiXe.equals("1") || loaiXe.equals("Car") || loaiXe.equals("car") || loaiXe.equals("Grab Car")) {
			return 0;
		}
		
		if (loaiXe.equals("2") || loaiXe.equals("SUV") || loaiXe.equals("suv") || loaiXe.equals("Grab SUV")) {
			return 1;
		}
		
		if (loaiXe.equals("3") || loaiXe.equals("Black") || loaiXe.equals("black") || loaiXe.equals("Grab Black")) {
			return 2;
		}
		
		
		return -1;
		
	}
	
	public static void tinhTien(int loaiXe, double soKm, double cho) {
		
		
		
		double tong = 0;
		double km1 = 0, km2 = 0, km3 = 0;
		
		if (soKm < 0) {
			System.out.println("Số Km phải lớn hơn 0");
			return;
		}
		else if (soKm > 0 && soKm <= 1) {
			km1 = soKm;
		}
		else if (soKm > 1 && soKm <= 19) {
			km1 = 1;
			km2 = soKm - 1;
		}
		else {
			km1 = 1;
			km2 = 19;
			km3 = soKm - 19;
			
		}
		
		
		System.out.println("\t\t\tCHI TIẾT HÓA ĐƠN");
		System.out.print("CHI TIẾT\tSỬ DỤNG(KM)\tĐƠN GIÁ\t\tTHÀNH TIỀN");
		System.out.print("\nKM ĐẦU TIÊN\t" + km1 + "\t\t" + tien[loaiXe][0] + "\t\t" + tien[loaiXe][0] * km1);
		System.out.print("\nTừ 1 đến " + km2 + "\t" + km2 + "\t\t" + tien[loaiXe][1] + "\t\t" + tien[loaiXe][1] * km2);
		System.out.printf("\nTừ 19\t\t%.2f\t\t%.1f\t\t%.1f",km3, tien[loaiXe][2], tien[loaiXe][2] * km3);
		System.out.print("\nThời gian chờ\t" + cho + "\t\t" + tien[loaiXe][3] + "\t\t" + ((int)(cho / soPhutCho) * tien[loaiXe][3]));
		
		tong += (km1 * tien[loaiXe][0] + km2 * tien[loaiXe][1] + km3 * tien[loaiXe][2]);
		tong += (int)(cho / soPhutCho) * tien[loaiXe][3];
		System.out.print("\n\t\t\t\tTổng tiền: \t" + tong);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int loai = nhapLoaiXe();
		
		System.out.println("Nhập số km đi được: ");
		double soKm = sc.nextDouble();
		System.out.println("Nhập thời gian chờ (phút): ");
		double tgCho = sc.nextDouble();
		
		if (soKm < 0 || tgCho < 0 || loai < 0) {
			System.out.println("Ko hợp lệ");
		}
		else {
			tinhTien(loai, soKm, tgCho);
		}
		
		

		sc.close();
	}

}
