package buoi11.cau3;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
	final int luongMotNgay = 100000;
	private int soNgayLamViec;

	public NhanVienVanPhong() {
		
	}
	
	@Override
	public void nhapNV() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		super.nhapNV();
		
		do {
			System.out.println("Nhập số ngày làm việc của nhân viên ");
			this.soNgayLamViec = sc.nextInt();

		} while (this.soNgayLamViec < 0);
			
	}
	
	public NhanVienVanPhong(String ten, String ngsinh) {
		super(ten, ngsinh);
		
	}
	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		setLuong(this.soNgayLamViec * luongMotNgay);
	}
}
