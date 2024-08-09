package buoi11.cau1;

public class Cau1Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo p1 = new PhanSo();
		p1.nhapPS();
		p1.xuatPS();
		
		PhanSo p2 = new PhanSo();
		p2.nhapPS();
		p2.xuatPS();
		
		p1.cong(p2);
		p1.tru(p2);
		p1.nhan(p2);
		p1.chia(p2);
		
	}

}
