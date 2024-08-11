package buoi11.cau3;

import java.util.Scanner;

public abstract class NhanVien {
	final int CURRENTYEAR = 2024;
	
	private String hoten;
	private String ngaysinh;
	private double luong;
	
	public boolean ktraNgSinh(String ngsinh) {
		int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int ngay = 1, thang = 1, nam = 1990;
		try {
			ngay = Integer.parseInt(ngsinh.split("/")[0]);
			thang = Integer.parseInt(ngsinh.split("/")[1]);
			nam = Integer.parseInt(ngsinh.split("/")[2]);
		} catch (Exception e) {
			return false;
		}
		

		if (nam < 0 || nam > CURRENTYEAR) {
			return false;
		} 
		else if (thang < 0 || thang > 12) {
			return false;
		} 
		else {
			if (ngay < 0 || ngay > 31) {
				return false;
			} 
			else {
				if (ngay >= 1 && ngay <= daysInMonth[thang-1]) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		
	}
	
	public NhanVien() {
		
	}
	
	public NhanVien(String ten, String ngsinh) {
		this.hoten = ten;
		this.ngaysinh = ngsinh;
		this.luong = 0;
	}
	
	public void nhapNV() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Nhập họ tên nv ");
			this.hoten = sc.nextLine();
			
			System.out.println("Nhập ngày sinh nv ");
			this.ngaysinh = sc.nextLine();

			if (this.hoten == "" || this.ngaysinh == "") {
				System.out.println("Ko hợp lệ");
				
			}
			if (!ktraNgSinh(this.ngaysinh)) {
				System.out.println("Ngày sinh ko hợp lệ");
				
			}
			
		} while (this.hoten == "" || this.ngaysinh == "" || !ktraNgSinh(this.ngaysinh));
	}
	
	public String getHoten() {
		return hoten;
	}
	
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	public String getNgaysinh() {
		return ngaysinh;
	}
	
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	
	public double getLuong() {
		return luong;
	}
	
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public void tinhLuong() {
		
	}
	
	public void xuatNV() {
		System.out.println("Họ tên " + this.hoten + " ngày sinh " + this.ngaysinh + " Lương " + this.luong);
	}
	
}
