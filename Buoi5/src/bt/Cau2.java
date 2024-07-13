package bt;

import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		
//		float[] arr = new float[6];
//		arr[0] = 24;
//		arr[1] = 45;
//		arr[2] = 23;
//		arr[3] = 13;
//		arr[4] = 43;
//		arr[5] = -12;
//
//		System.out.print("Nhập x: ");
//		float x = sc.nextFloat();
//		
//		float maxDiff = Float.MIN_VALUE;
//		int idx = 0;
//		
//		for (int i=0; i<6; i++) {
//			float diff = arr[i] - x;
//			if (diff > maxDiff) {
//				maxDiff = diff;
//				idx = i;
//			}
//		}
//		
//		System.out.println("Giá trị xa x nhất trong mảng là " + (maxDiff + x) + " tại vị trí " + idx);
//		sc.close();
		
		
		int x;
		int num = (int) (Math.random() * 999 + 1);
		do {
			 x = sc.nextInt();
			 if (x > num) 
				 System.out.println("So can tim nho hon");
			 if (x < num) 
				 System.out.println("So can tim lon hon");
		} while (x != num);
		
		
		sc.close();
		
		
		
		
		
		
	}

}
