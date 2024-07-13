package btvn1;

public class Cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int sum = n;
		
		while (sum <= 10000) {
			n += 1;
			sum += n;
		}
		
		System.out.println("n nguyên dương nhỏ nhất là " + n);
	}

}
