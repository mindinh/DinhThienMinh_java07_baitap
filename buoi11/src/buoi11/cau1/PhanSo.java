package buoi11.cau1;

import java.util.Scanner;

public class PhanSo {
	private int tuso;
	private int mauso;
	
	public PhanSo() {
		this.tuso = 1;
		this.mauso = 1;
		
	}
	
	public void nhapPS() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Nhap tu so: ");
			this.tuso = sc.nextInt();
			
			do {
				System.out.println("Nhap mau so: ");
				this.mauso = sc.nextInt();
				if (this.mauso == 0) {
					System.out.println("Mau so phai khac 0");
				}
			} while (this.mauso == 0);
			
		} catch (Exception e) {
			System.out.println("Ko hop le");
		}
		
		formatPS();
	}
	
	public void formatPS() {
		if (this.mauso < 0) {
			this.tuso *= -1;
			this.mauso *= -1;
		}
		
		
		if (this.tuso < 0 && this.mauso < 0) {
			this.tuso *= -1;
			this.mauso *= -1;
		}
	}
	
	public void xuatPS() {
		System.out.println(this.tuso + "/" + this.mauso);
	}
	
	public void cong(PhanSo p) {
		PhanSo kq = new PhanSo();
		kq.tuso = (this.tuso * p.mauso + p.tuso * this.mauso);
		kq.mauso = this.mauso * p.mauso;
		System.out.print("Ket qua + : ");
		kq.formatPS();
		kq.xuatPS();

	}
	
	public void tru(PhanSo p) {
		PhanSo kq = new PhanSo();
		kq.tuso = (this.tuso * p.mauso - p.tuso * this.mauso);
		kq.mauso = this.mauso * p.mauso;
		System.out.print("Ket qua - : ");
		kq.formatPS();
		kq.xuatPS();
		
	}
	
	public void nhan(PhanSo p) {
		PhanSo kq = new PhanSo();
		kq.tuso = this.tuso * p.tuso;
		kq.mauso = this.mauso * p.mauso;
		System.out.print("Ket qua * : ");
		kq.formatPS();
		kq.xuatPS();

	}
	
	public void chia(PhanSo p) {
		PhanSo kq = new PhanSo();
		kq.tuso = this.tuso * p.mauso;
		kq.mauso *= this.mauso * p.tuso;
		System.out.print("Ket qua / : ");
		kq.formatPS();
		kq.xuatPS();

	}
	
}
