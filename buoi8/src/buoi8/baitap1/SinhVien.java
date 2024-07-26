package buoi8.baitap1;

import java.util.Scanner;

public class SinhVien {
	private String ten;
	private String mssv;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private double diemTB;
	
	public boolean kTraHopLe() {
		return (this.ten != "" && this.mssv != "" && (this.diemToan > 0 && this.diemToan < 10) && (this.diemLy > 0 && this.diemLy < 10) 
				&& (this.diemHoa > 0 && this.diemHoa < 10));
	}
	
	public void nhapSV() {
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Nhập họ tên SV: ");
			this.ten = sc.nextLine();
			System.out.println("Nhập MSSV: ");
			this.mssv = sc.nextLine();
			System.out.println("Nhập điểm toán SV: ");
			this.diemToan = sc.nextDouble();
			System.out.println("Nhập điểm lý SV: ");
			this.diemLy = sc.nextDouble();
			System.out.println("Nhập điểm hóa SV: ");
			this.diemHoa = sc.nextDouble();
			
			if (kTraHopLe() == false) {
				System.out.println("Thông tin sv ko hợp lệ!");
			}
			
			sc.nextLine();
		} while (kTraHopLe() == false);
			
		
	}
	
	public String getTen() {
		return this.ten;
	}
	
	public void setTen(String _ten) {
		this.ten = _ten;
	}
	
	public String getMSSV() {
		return this.mssv;
	}
	
	public void setMSSV(String _mssv) {
		this.ten = _mssv;
	}
	
	public double getDiemToan() {
		return this.diemToan;
	}
	
	public void setDiemToan(double _diemToan) {
		this.diemToan = _diemToan;
	}
	
	public double getDiemLy() {
		return this.diemLy;
	}
	
	public void setDiemLy(double _diemLy) {
		this.diemLy = _diemLy;
	}
	
	public double getDiemhHoa() {
		return this.diemHoa;
	}
	
	public void setDiemHoa(double _diemHoa) {
		this.diemHoa = _diemHoa;
	}
	
	public void tinhDiemTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
		
	}
	
	public double getDiemTB() {
		return this.diemTB;	
	}
	
	public String xepLoaiSV() {
		if (this.diemTB >= 9) {
			
			return "Xuất sắc";
		}
		else if (this.diemTB >= 8 && this.diemTB < 9) {
			
			return "Giỏi";
		}
		else if (this.diemTB >= 7 && this.diemTB < 8) {
			
			return "Khá";
		}
		else if (this.diemTB >= 6 && this.diemTB < 7) {
			
			return "Trung bình";
		}
		else {
			
			return "Yếu";
		}
	}
	
	public void in1SV() {
		System.out.println("Sinh viên " + this.ten + ". MSSV: " + this.mssv);
		System.out.println("Toán: " + this.diemToan + " Lý: " + this.diemLy + " Hóa: " + this.diemHoa);
		System.out.print("Xếp loại " + xepLoaiSV());
		
		System.out.println("\n");
	}

}
