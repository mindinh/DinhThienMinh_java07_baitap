package buoi6.baitap2;

import java.util.Scanner;

public class BaiTap2Application {
	
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
		
		tong += (int)(cho / 3) * 2000;
		
		return tong;
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
		
		tong += (int)(cho / 3) * 3000;
		
		return tong;
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
		
		tong += (int)(cho / 3) * 3500;
		
		return tong;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập loại xe (1. Grab Car, 2.Grab SUV, 3.Grab Black");
		int loaiXe = sc.nextInt();
		
		System.out.println("Nhập số Km đi được: ");
		double soKm = sc.nextDouble();
		
		System.out.println("Nhập thời gian chờ: ");
		double tgCho = sc.nextDouble();
		
		
		if (loaiXe == 1) {
			double tong = tinhCar(soKm, tgCho);
			System.out.printf("Tổng cho %.2fkm bằng Grab Car với %.2f phút chờ = %.2f VNĐ", soKm, tgCho, tong);
			
		}
		else if (loaiXe == 2) {
			double tong = tinhSUV(soKm, tgCho);
			System.out.printf("Tổng cho %.2fkm bằng Grab SUV với %.2f phút chờ = %.2f VNĐ", soKm, tgCho, tong);

		}
		else if (loaiXe == 3) {
			double tong = tinhBlack(soKm, tgCho);
			System.out.printf("Tổng cho %.2fkm bằng Grab Black với %.2f phút chờ = %.2f VNĐ", soKm, tgCho, tong);
			
		}
		else {
			System.out.println("Loại xe ko tồn tại");

		}
		
		
		
		sc.close();
	}

}
