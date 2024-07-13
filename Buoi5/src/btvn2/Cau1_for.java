package btvn2;

public class Cau1_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		
		System.out.println("Số chẵn: ");
		for (int i=1; i<n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
		
		System.out.println("\nSố lẻ: ");
		for (int i=1; i<n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			
		}
		
		
	}

}
