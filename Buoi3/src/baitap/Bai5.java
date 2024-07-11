package baitap;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 // cau 5
		// nhập độ C
        System.out.println("Nhap do C: ");
        float celsius = sc.nextFloat();
        
        // áp dụng công thức và ép thành kiểu float
        float fahrenheit = (float) ((celsius*1.8) + 32.0);
        System.out.println("Do F tuong duong: " + fahrenheit + "℉");

		sc.close();
	}
}
