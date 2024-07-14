package baitap1;

import java.util.Scanner;

public class Cau4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String tenSV1 = "";
		double xSV1 = 0;
		double ySV1 = 0;
		
		String tenSV2 = "";
		double xSV2 = 0;
		double ySV2 = 0;
		
		String tenSV3 = "";
		double xSV3 = 0;
		double ySV3 = 0;
		
		// tọa độ sinh viên 1
		do {
			System.out.println("Nhập tên sinh viên 1: ");
			tenSV1 = sc.nextLine();
			System.out.println("Nhập tọa độ (x, y): ");
			xSV1 = sc.nextDouble();
			ySV1 = sc.nextDouble();
			sc.nextLine();

		} while (tenSV1 == "");
		
		
		// tọa độ sinh viên 2
		do {
			System.out.println("Nhập tên sinh viên 2: ");
			tenSV2 = sc.nextLine();
			System.out.println("Nhập tọa độ (x, y): ");
			xSV2 = sc.nextDouble();
			ySV2 = sc.nextDouble();
			sc.nextLine();
			
		} while (tenSV2 == "");
		
		// tọa độ sinh viên 3
		do {
			System.out.println("Nhập tên sinh viên 3: ");
			tenSV3 = sc.nextLine();
			System.out.println("Nhập tọa độ (x, y): ");
			xSV3 = sc.nextDouble();
			ySV3 = sc.nextDouble();
			sc.nextLine();

		} while (tenSV3 == "");
		
		
		// tọa độ trường đại học
		System.out.println("Nhập tọa độ trường đại học (x, y): ");
		double xUni = sc.nextDouble();
		double yUni = sc.nextDouble();
		
		
		// tính khoảng cách eclid giữa tạo độ 1 sinh viên tới trường học
		double distanceFromSV1ToUni = Math.sqrt(Math.pow(xUni - xSV1, 2) + Math.pow(yUni - ySV1, 2));
		double distanceFromSV2ToUni = Math.sqrt(Math.pow(xUni - xSV2, 2) + Math.pow(yUni - ySV2, 2));
		double distanceFromSV3ToUni = Math.sqrt(Math.pow(xUni - xSV3, 2) + Math.pow(yUni - ySV3, 2));
		
		
		// nếu khoảng cách giữa 1 sinh viên lớn hơn khoảng cách tới trường của 2 sinh viên còn lại thì sv đó xa trường nhất
		if (distanceFromSV1ToUni > distanceFromSV2ToUni && distanceFromSV1ToUni > distanceFromSV3ToUni) {
			System.out.println("Sinh viên " + tenSV1 + " ở xa trường đại học nhất");
		}
		else if (distanceFromSV2ToUni > distanceFromSV1ToUni && distanceFromSV2ToUni > distanceFromSV3ToUni) {
			System.out.println("Sinh viên " + tenSV2 + " ở xa trường đại học nhất");
		}
		else if (distanceFromSV3ToUni > distanceFromSV1ToUni && distanceFromSV3ToUni > distanceFromSV2ToUni) {
			System.out.println("Sinh viên " + tenSV3 + " ở xa trường đại học nhất");
		}
		else {
			System.out.println("Cả 3 sinh viên đều ở xa trường đại học như nhau");
		}
		
		
		sc.close();

	}

}
