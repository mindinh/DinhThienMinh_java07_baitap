package buoi8.baitap1;

import java.util.Scanner;

public class Cau1Application {
	
	public static boolean kTraHopLe(String ten, String mssv, double diemToan, double diemLy, double diemHoa) {
		return (ten != "" && mssv != "" && (diemToan > 0 && diemToan < 10) && (diemLy > 0 && diemLy < 10) 
				&& (diemHoa > 0 && diemHoa < 10));
	}
	
	public static double tinhDiemTB1SV(double diemToan, double diemLy, double diemHoa) {
		
		return (diemToan + diemLy + diemHoa) / 3.0;
	}
	
	public static void xepLoai1SV(double diemTB) {
		if (diemTB >= 9) {
			System.out.println("Xuất sắc");
		}
		else if (diemTB >= 8 && diemTB < 9) {
			System.out.println("Giỏi");
		}
		else if (diemTB >= 7 && diemTB < 8) {
			System.out.println("Khá");
		}
		else if (diemTB >= 6 && diemTB < 7) {
			System.out.println("Trung bình");
		}
		else {
			System.out.println("Yếu");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// cau 1
		int n = 0;
		
		try {
			System.out.println("Nhập số lượng sv: ");
			n = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Nhập 1 số!");
		}
		
		if (n < 1) {
			System.out.println("Ko hợp lệ");
		}
		else {
			System.out.println("enter để tiếp tục");
			int i = 0;
			while (i < n) {
				
				String ten = ""; String mssv = ""; double diemToan = 0; double diemLy = 0; double diemHoa = 0;
				do {
					sc.nextLine();
					System.out.println("Nhập thông tin 1 sv: ");
					System.out.println("Nhập họ tên SV: ");
					ten = sc.nextLine();
					System.out.println("Nhập MSSV: ");
					mssv = sc.nextLine();
					System.out.println("Nhập điểm toán SV: ");
					diemToan = sc.nextDouble();
					System.out.println("Nhập điểm lý SV: ");
					diemLy = sc.nextDouble();
					System.out.println("Nhập điểm hóa SV: ");
					diemHoa = sc.nextDouble();
					
					if (kTraHopLe(ten, mssv, diemToan, diemLy, diemHoa) == false) {
						System.out.println("Thông tin sv ko hợp lệ");
					}
					
					
				} while (kTraHopLe(ten, mssv, diemToan, diemLy, diemHoa) == false);
				
				i += 1;
				double diemTB = tinhDiemTB1SV(diemToan, diemLy, diemHoa);
				System.out.printf("Điểm tb của sv là %.2f", diemTB);
				System.out.print("\nXếp loại sv ");
				xepLoai1SV(diemTB);
				
			}
		}
		
		sc.close();
	}

}
