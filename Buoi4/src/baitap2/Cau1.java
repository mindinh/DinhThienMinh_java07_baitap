package baitap2;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String tenMatHang;
		int soluong;
		int dongia;
		
		// nhập thông tin mua hàng
		System.out.println("Nhập tên mặt hàng: ");
		tenMatHang = sc.nextLine();
		
		System.out.println("Nhập số lượng mua: ");
		soluong = sc.nextInt();
		
		System.out.println("Nhập đơn giá: ");
		dongia = sc.nextInt();
		
		// số lượng ko hợp lệ
		if (soluong <= 0) {
			System.out.println("Số lượng phải nhiều hơn hoặc bằng 1");
		}
		else {
			// nêu số lượng từ 1 - 49 thì lấy tổng = số lượng * dơn giá
			if (soluong > 0 && soluong < 50) {
				double tong = soluong * dongia;
				
				System.out.println(soluong + " đơn vị " + tenMatHang + " tổng tiền: " + tong);
			}
			// nếu số lượng từ 50 - 100 thì tổng = số lượng * đơn giá * 8%
			else if (soluong >= 50 && soluong <= 100) {
				double tong = soluong * dongia * 0.08;
				
				System.out.println(soluong + " đơn vị " + tenMatHang + " tổng tiền: " + tong);
			}
			// nếu số lượng từ 100 trở lên thì tính 100 sp đầu sẽ bằng 100 * đơn giá cộng với số sp từ 101 * đơn giá * 12%
			else {
				double tong = 100 * dongia + (soluong - 100) * dongia * 0.12;
				
				System.out.println(soluong + " đơn vị " + tenMatHang + " tổng tiền: " + tong);
			}
		}
			
		
		sc.close();
	}

}
