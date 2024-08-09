package buoi11.cau2;

public class Cau2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VanDongVien v1 = new VanDongVien("Ng van a", 24, "nhay xa", 67.2, 1.78);
		v1.xuatVDV();
		
		VanDongVien v2 = new VanDongVien("Ng van b", 27, "boi", 71, 1.78);
		v2.xuatVDV();
		
		v1.soSanh(v2);
	}

}
