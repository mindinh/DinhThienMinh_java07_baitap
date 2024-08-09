package buoi11.cau4;

import java.util.ArrayList;
import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong implements QuanLyOto {
	private int seats;
	private String engineType;
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public String getEngineType() {
		return engineType;
	}
	
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	

	@Override
	public ArrayList<PhuongTienGiaoThong> inputOto() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0, i = 0;
		
		try {
			System.out.println("Nhập n oto");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Ko hợp lệ");
		}
		
		ArrayList<PhuongTienGiaoThong> list = new ArrayList<PhuongTienGiaoThong>(n);
		
		while (i < n) {
			Oto car = new Oto();
			
			car.input();
			
			do {
				System.out.println("Nhập số chỗ ngồi");
				this.seats = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Nhập kiểu động cơ");
				this.engineType = sc.nextLine();
				
				if (this.seats < 0 || this.engineType == "" ) {
					System.out.println("Ko hợp lệ");
				}
				
				
			} while (this.seats < 0 || this.engineType == "");
			
			list.add(car);
			i++;
		}
		
		return list;
	}
	
	@Override
	public void otoWithSameSpeed(ArrayList<PhuongTienGiaoThong> list) {
		// TODO Auto-generated method stub
		int n = list.size();
		ArrayList<Double> speed = new ArrayList<Double>();
		
		for (int i=0; i<n - 1; i++) {
				
			double s = list.get(i).getMaxSpeed();
			
			if (speed.indexOf(s) != -1) {
				continue;
			} 
			else {
			
				speed.add(s);
				System.out.printf("\nOtos with Max Speed %.2f \n", s);
				
				System.out.print("+ ");
				list.get(i).output();
				
				for (int j=i+1; j<n; j++) {
					if (list.get(j).getMaxSpeed() == s) {
						System.out.print("+ ");
						list.get(j).output();
					}
				}
			}
		}
		
		double lastOtoSpeed = list.get(n-1).getMaxSpeed();
		if (speed.indexOf(lastOtoSpeed) != -1) {
			return;
		}
		else {
			speed.add(lastOtoSpeed);
			System.out.printf("\nOtos with Max Speed %.2f \n", lastOtoSpeed);
			
			System.out.print("+ ");
			list.get(n-1).output();
		}
		
	}
	
	public void outputOto() {
		super.output();
		System.out.println("Số chỗ ngồi " + this.seats + " động cơ " + this.engineType);
	}
	
	
}
