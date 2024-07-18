package buoi6.baitap2;

import java.util.Scanner;


public class BaiTap2Application {
	public static final int soPhutCho = 3;
	
	// không xuất như hóa đơn
	public static double tinhCar(double soKm, double cho) {
		double tong = 0;
		
		if (soKm < 0) {
			return -1;
		}
		else if (soKm > 0 && soKm <= 1) {
			tong = soKm * 8000;
		}
		else if (soKm > 1 && soKm <= 19) {
			tong = 8000 + (soKm - 1) * 7500;
		}
		else {
			tong = 8000 + 19 * 7500 + (soKm - 19) * 7000;
		}
		
		tong += (int)(cho / soPhutCho) * 2000;
		
		return tong;
	}
	
	public static void tinhCar2(double soKm, double cho) {
		final double tienKm1 = 8000, tienKm2 = 7500, tienKm3 = 7000, tienCho = 2000;
		
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
		System.out.print("\nKM ĐẦU TIÊN\t" + km1 + "\t\t" + tienKm1 + "\t\t" + tienKm1 * km1);
		System.out.print("\nTừ 1 đến " + km2 + "\t" + km2 + "\t\t" + tienKm2 + "\t\t" + tienKm2 * km2);
		System.out.printf("\nTừ 19\t\t%.2f\t\t%.1f\t\t%.1f",km3, tienKm3, tienKm3 * km3);
		System.out.print("\nThời gian chờ\t" + cho + "\t\t" + tienCho + "\t\t" + ((int)(cho / soPhutCho) * tienCho));
		
		tong += (km1 * tienKm1 + km2 * tienKm2 + km3 * tienKm3);
		tong += (int)(cho / soPhutCho) * tienCho;
		System.out.print("\n\t\t\t\tTổng tiền: \t" + tong);
		
	}
	
	public static double tinhSUV(double soKm, double cho) {
		double tong = 0;
		
		if (soKm < 0) {
			return -1;
		}
		else if (soKm > 0 && soKm <= 1) {
			tong = soKm * 9000;
		}
		else if (soKm > 1 && soKm <= 19) {
			tong = 9000 + (soKm - 1) * 8500;
		}
		else {
			tong = 9000 + 19 * 8500 + (soKm - 19) * 8000;
		}
		
		tong += (int)(cho / soPhutCho) * 3000;
		
		return tong;
	}
	
	public static void tinhSUV2(double soKm, double cho) {
		final double tienKm1 = 9000, tienKm2 = 8500, tienKm3 = 8000, tienCho = 3000;
		
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
		System.out.print("\nKM ĐẦU TIÊN\t" + km1 + "\t\t" + tienKm1 + "\t\t" + tienKm1 * km1);
		System.out.print("\nTừ 1 đến " + km2 + "\t" + km2 + "\t\t" + tienKm2 + "\t\t" + tienKm2 * km2);
		System.out.printf("\nTừ 19\t\t%.2f\t\t%.1f\t\t%.1f",km3, tienKm3, tienKm3 * km3);
		System.out.print("\nThời gian chờ\t" + cho + "\t\t" + tienCho + "\t\t" + ((int)(cho / soPhutCho) * tienCho));
		
		tong += (km1 * tienKm1 + km2 * tienKm2 + km3 * tienKm3);
		tong += (int)(cho / soPhutCho) * tienCho;
		System.out.print("\n\t\t\t\tTổng tiền: \t" + tong);
		
	}
	
	public static double tinhBlack(double soKm, double cho) {
		double tong = 0;
		
		if (soKm < 0) {
			return -1;
		}
		else if (soKm > 0 && soKm <= 1) {
			tong = soKm * 10000;
		}
		else if (soKm > 1 && soKm <= 19) {
			tong = 10000 + (soKm - 1) * 9500;
		}
		else {
			tong = 10000 + 19 * 9500 + (soKm - 19) * 9000;
			
		}
		
		tong += (int)(cho / soPhutCho) * 3500;

		return tong;
	}
	
	public static void tinhBlack2(double soKm, double cho) {
		final double tienKm1 = 10000, tienKm2 = 9500, tienKm3 = 9000, tienCho = 3500;
		
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
		System.out.print("\nKM ĐẦU TIÊN\t" + km1 + "\t\t" + tienKm1 + "\t\t" + tienKm1 * km1);
		System.out.print("\nTừ 1 đến " + km2 + "\t" + km2 + "\t\t" + tienKm2 + "\t\t" + tienKm2 * km2);
		System.out.printf("\nTừ 19\t\t%.2f\t\t%.1f\t\t%.1f",km3, tienKm3, tienKm3 * km3);
		System.out.print("\nThời gian chờ\t" + cho + "\t\t" + tienCho + "\t\t" + ((int)(cho / soPhutCho) * tienCho));
		
		tong += (km1 * tienKm1 + km2 * tienKm2 + km3 * tienKm3);
		tong += (int)(cho / soPhutCho) * tienCho;
		System.out.print("\n\t\t\t\tTổng tiền: \t" + tong);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập loại xe (1. Grab Car, 2.Grab SUV, 3.Grab Black)");
		int loaiXe = sc.nextInt();
		
		System.out.println("Nhập số Km đi được: ");
		double soKm = sc.nextDouble();
		
		System.out.println("Nhập thời gian chờ: ");
		double tgCho = sc.nextDouble();
		
		
		if (loaiXe <= 0 || loaiXe > 3) {
			System.out.println("Loại xe ko tồn tại");

		}
		else {
			if (loaiXe == 1) {
				tinhCar2(soKm, tgCho);
				//double tong = tinhCar(soKm, tgCho);
				//System.out.printf("Tổng cho %.2fkm bằng Grab Car với %.2f phút chờ = %.2f VNĐ", soKm, tgCho, tong);
				
			}
			else if (loaiXe == 2) {
				tinhSUV2(soKm, tgCho);
				//double tong = tinhSUV(soKm, tgCho);
				//System.out.printf("Tổng cho %.2fkm bằng Grab SUV với %.2f phút chờ = %.2f VNĐ", soKm, tgCho, tong);

			}
			else if (loaiXe == 3) {
				tinhBlack2(soKm, tgCho);
				//System.out.printf("Tổng cho %.2fkm bằng Grab Black với %.2f phút chờ = %.2f VNĐ", soKm, tgCho, tong);
				
			}
		}
		
		
		
		
		
		sc.close();
	}

}
