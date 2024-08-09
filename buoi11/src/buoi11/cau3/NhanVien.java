package buoi11.cau3;

public class NhanVien {
	private String hoten;
	private String ngaysinh;
	private double luong;
	
	public NhanVien(String ten, String ngsinh) {
		this.hoten = ten;
		this.ngaysinh = ngsinh;
		this.luong = 0;
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
