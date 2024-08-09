package buoi11.cau3;

import java.util.ArrayList;

public class Cau3Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		
		NhanVienSanXuat nv1 = new NhanVienSanXuat("Ng Van a", "01/01/1997", 200000);
		nv1.setSoSP(50);

		NhanVienVanPhong nv2 = new NhanVienVanPhong("Ng van b", "05/12/1994");
		nv2.setSoNgayLamViec(69);

		list.add(nv1);
		list.add(nv2);
		
		for (NhanVien nv : list) {
			nv.tinhLuong();
			nv.xuatNV();
		}
	}

}
