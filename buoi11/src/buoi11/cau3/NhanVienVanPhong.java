package buoi11.cau3;

public class NhanVienVanPhong extends NhanVien {
	private int soNgayLamViec;

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
		setLuong(this.soNgayLamViec * 100000);
	}
}
