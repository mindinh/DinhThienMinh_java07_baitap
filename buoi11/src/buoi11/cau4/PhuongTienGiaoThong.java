package buoi11.cau4;

import java.util.Scanner;

public abstract class PhuongTienGiaoThong {
	final int CURRENTYEAR = 2024;
	
	private String brand;
	private String name;
	private int year;
	private double maxSpeed;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập hãng sản xuất");
			this.brand = sc.nextLine();
			
			System.out.println("Nhập tên phương tiện");
			this.name = sc.nextLine();
			
			System.out.println("Nhập năm sản xuất");
			this.year = sc.nextInt();
			
			System.out.println("Nhập tốc độ tối đa");
			this.maxSpeed = sc.nextDouble();
			
			if (this.brand == "" || this.name == "" || this.year < 0 || this.year > CURRENTYEAR || this.maxSpeed < 0) {
				System.out.println("Ko hợp lệ");
			}
			sc.nextLine();
			
		} while (this.brand == "" || this.name == "" || this.year < 0 || this.year > CURRENTYEAR || this.maxSpeed < 0);
	
		
		
	}
	
	public void output() {
		System.out.println("Hãng " + this.brand);
		System.out.println("Tên " + this.name + " năm " + this.year);
		System.out.println("Tốc độ tối đa " + this.maxSpeed);
		
	}
	
	
}
