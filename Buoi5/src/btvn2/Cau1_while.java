package btvn2;

public class Cau1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		System.out.println("Số chẵn: ");
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;

		}
		
		i = 1;
		System.out.println("\nSố lẻ: ");
		while (i < 100) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;

		}

	}

}
