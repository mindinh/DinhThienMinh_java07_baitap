package baitap1;

import java.util.Scanner;

public class Cau4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// tọa độ sinh viên 1
		String tenSV1 = "A";
		float xSV1 = 1.0134f;
		float ySV1 = 2.4512f;
		
		// tọa độ sinh viên 2
		String tenSV2 = "B";
		float xSV2 = 4.0234f;
		float ySV2 = 1.5423f;
		
		// tọa độ sinh viên 3
		String tenSV3 = "C";
		float xSV3 = 7.3412f;
		float ySV3 = 0.1455f;
		
		// tọa độ trường đại học
		float xUni = 3.3153f;
		float yUni = 4.0912f;
		
		
		// tính khoảng cách eclid giữa tạo độ 1 sinh viên tới trường học
		float distanceFromSV1ToUni = (float) Math.sqrt(Math.pow(xUni - xSV1, 2) + Math.pow(yUni - ySV1, 2));
		float distanceFromSV2ToUni = (float) Math.sqrt(Math.pow(xUni - xSV2, 2) + Math.pow(yUni - ySV2, 2));
		float distanceFromSV3ToUni = (float) Math.sqrt(Math.pow(xUni - xSV3, 2) + Math.pow(yUni - ySV3, 2));
		
		
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
