package buoi11.cau3;

public class NhanVienSanXuat extends NhanVien {
	final double tienMotSP = 5000;
	private double luongCB;
	private int soSP;

	public NhanVienSanXuat(String ten, String ngsinh, double luongcb) {
		super(ten, ngsinh);
		this.luongCB = luongcb;
		
	}
	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}

	public double getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}
	
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		setLuong(luongCB + this.soSP * tienMotSP);
	}
}
