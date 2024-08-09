package buoi11.cau2;

import java.util.Scanner;

public class VanDongVien {
	private String hoten;
	private int tuoi;
	private String monthidau;
	private double cannang;
	private double chieucao;
	
	
	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getMonthidau() {
		return monthidau;
	}

	public void setMonthidau(String monthidau) {
		this.monthidau = monthidau;
	}
	
	public double getCanNang() {
		return this.cannang;
	}

	public void setCanNang(double nang) {
		this.cannang = nang;
	}

	public double getChieucao() {
		return chieucao;
	}

	public void setChieucao(double chieucao) {
		this.chieucao = chieucao;
	}

	public VanDongVien() {
		
	}
	
	public VanDongVien(String hoten, int tuoi, String monthi, double nang, double cao) {
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.monthidau = monthi;
		this.cannang = nang;
		this.chieucao = cao;
		
	}
	
	public void nhapVDV() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập họ tên vđv");
			this.hoten = sc.nextLine();
			
			System.out.println("Nhập tuổi vđv");
			this.tuoi = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Nhập môn thi đấu");
			this.monthidau = sc.nextLine();
			
			System.out.println("Nhập cân nặng");
			this.cannang = sc.nextDouble();
			
			System.out.println("Nhập chiều cao");
			this.chieucao = sc.nextDouble();
			
			
		} while (this.hoten == "" || this.tuoi < 0 || this.tuoi < 16 || this.monthidau == "" || this.cannang < 0 || this.chieucao < 0);
	}
	
	public void xuatVDV() {
		System.out.println("Tên " + this.hoten + this.tuoi + " tuổi Môn thi đấu " + this.monthidau);
		System.out.println("Cân nặng " + this.cannang + " Chiều cao " + this.chieucao);
	}
	
	public void soSanh(VanDongVien v) {
		if (this.chieucao > v.getChieucao()) {
			System.out.println(this.hoten + " > " + v.getHoten());
		}
		else if (this.chieucao < v.getChieucao()) {
			System.out.println(this.hoten + " < " + v.getHoten());
		}
		else {
			if (this.cannang > v.getCanNang()) {
				System.out.println(this.hoten + " > " + v.getHoten());
			}
			else {
				System.out.println(this.hoten + " < " + v.getHoten());
			}
		}
	}
	
	
	
}
