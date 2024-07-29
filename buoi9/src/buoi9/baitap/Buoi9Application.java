package buoi9.baitap;

import java.util.Scanner;

public class Buoi9Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HocSinh a = new HocSinh();
		a.nhapHS();
		a.tinhDTB();
		a.inHS();
		
		HocSinh b = new HocSinh();
		b.nhapHS();
		b.tinhDTB();
		b.inHS();
	
		TroChoi t = new TroChoi();
		t.ten = "Dungeon";
		t.batDau();
		t.choiLai();
		t.choiLai();
		t.choiLai();
		t.choiLai();
		t.ketThuc();
		System.out.println("Enter để tiếp tục");
		sc.nextLine();
		
		
		
		XeHoi x = new XeHoi();
		x.nhapTTXe();
		x.inTTXe();
		
		XeMay y = new XeMay();
		y.nhapTTXe();
		y.inTTXe();
		
		System.out.println("\n");
		
		DieuHoa h = new DieuHoa();
		h.on();
		h.off();
		
		System.out.println("\n");
		
		MaySay m = new MaySay();
		m.on();
		m.off();
	
		sc.close();
	}

}
