package buoi11.cau4;

import java.util.ArrayList;

public class Cau4Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<PhuongTienGiaoThong> list = new ArrayList<PhuongTienGiaoThong>();		
		QuanLyOto o = new Oto();
		list = o.inputOto();
		
		System.out.println("\n");
		o.otoWithSameSpeed(list);
		
	}

}
