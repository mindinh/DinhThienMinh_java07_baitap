package buoi8.baitap1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cau2Application {
	
	public static void inSVDiemTBCaoNhat(ArrayList<SinhVien> ds) {
		double max = 0;
		
		for (SinhVien s : ds) {
			if (s.getDiemTB() > max) {
				max = s.getDiemTB();
			}
		}
		
		System.out.println("Sinh viên có điểm tb cao nhất: ");
		for (SinhVien s : ds) {
			if (s.getDiemTB() == max) {
				System.out.println(s.getTen() + ". MSSV: " + s.getMSSV());
			}
		}
	}
	
	public static void inSVYeu(ArrayList<SinhVien> ds) {
		
		System.out.println("Sinh viên xếp loại Yếu: ");
		for (SinhVien sv : ds) {
			if (sv.xepLoaiSV().equals("Yếu")) {
				System.out.println(sv.getTen() + ". MSSV: " + sv.getMSSV());
			}
		}
	}
	
	public static boolean timSVTheoTen(ArrayList<SinhVien> ds, String ten) {
		
		for (SinhVien sv : ds) {
			if (sv.getTen().equals(ten)) {
				return true;
			}
		}
		
		return false;
	}

	public static boolean timSVTheoMa(ArrayList<SinhVien> ds, String mso) {
		
		for (SinhVien sv : ds) {
			if (sv.getMSSV().equals(mso)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean xoaSVTheoMa(ArrayList<SinhVien> ds, String mso) {
		
		for (int i=0; i<ds.size(); i++) {
			if (ds.get(i).getMSSV().equals(mso)) {
				ds.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public static void tinhDiemTBTungSV(ArrayList<SinhVien> ds) {
		
		for (SinhVien s : ds) {
			s.tinhDiemTB();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nhập số lượng sv: ");
		int n = sc.nextInt();
		
		if (n < 1) {
			System.out.println("Ko hợp lệ");
			
		}
		else {
			ArrayList<SinhVien> dssv = new ArrayList<SinhVien>(n);
			int i = 0;
			while (i < n) {
				SinhVien sv = new SinhVien();
				System.out.println("Nhập sv thứ " + (i + 1));
				sv.nhapSV();
				if (timSVTheoMa(dssv, sv.getMSSV()) == true) {
					System.out.println("MSSV đã tồn tại");
					continue;
				}
				else {
					sv.tinhDiemTB();
					sv.xepLoaiSV();
					dssv.add(sv);
					i++;
				}
				
			}
			
			
			for (SinhVien sv : dssv) {
				sv.in1SV();
			}

			inSVDiemTBCaoNhat(dssv);
			inSVYeu(dssv);
			
			sc.nextLine();
			System.out.println("Nhập 1 mã số để xóa: ");
			String mso = sc.nextLine();
			if (xoaSVTheoMa(dssv, mso)) {
				System.out.println("Xóa thành công");
			}
			else {
				System.out.println("MSSV ko tồn tại");
			}
		}
		
		
		sc.close();
	}

}
