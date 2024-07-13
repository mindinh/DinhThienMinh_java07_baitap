package btvn1;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int shouldContinue = 1;
		int playerScore = 0;
		int compScore = 0;
		
		while (shouldContinue != 0) {
			System.out.println("Điểm của bạn: " + playerScore);
			System.out.println("Điểm của máy: " + compScore);
			
			System.out.println("Nhập 1 để ra Bao");
			System.out.println("Nhập 2 để ra Kéo");
			System.out.println("Nhập 3 để ra Búa");
			int playerMove = sc.nextInt();
			int compMove = (int) (Math.random() * 3 + 1);
			
			switch (compMove) {
				case 1: 
					System.out.println("Máy ra Bao");
					if (playerMove == 2) {
						System.out.println("Bạn đã thắng");
						playerScore += 1;
					}
					else if (playerMove == 3) {
						System.out.println("Bạn đã thua");
						compScore += 1;
					}
					else {
						System.out.println("Hòa");
					}
					break;
				case 2: 
					System.out.println("Máy ra Kéo");
					if (playerMove == 3) {
						System.out.println("Bạn đã thắng");
						playerScore += 1;
					}
					else if (playerMove == 1) {
						System.out.println("Bạn đã thua");
						compScore += 1;
					}
					else {
						System.out.println("Hòa");
					}
					break;
				case 3: 
					System.out.println("Máy ra Búa");
					if (playerMove == 1) {
						System.out.println("Bạn đã thắng");
						playerScore += 1;
					}
					else if (playerMove == 2) {
						System.out.println("Bạn đã thua");
						compScore += 1;
					}
					else {
						System.out.println("Hòa");
					}
					break;
			}
			
			
			System.out.println("Nhập số khác 0 để chơi tiếp hoặc nhập 0 để thoát: ");
			shouldContinue = sc.nextInt();
			
		}
		
		if (playerScore > compScore) {
			System.out.println("Bạn thắng với tỉ số " + playerScore + ":" + compScore);
			
		}
		else if (compScore > playerScore) {
			System.out.println("Máy thắng với tỉ số " + compScore + ":" + playerScore);
			
		}
		else {
			System.out.println("Hòa với tỉ số " + playerScore + ":" + compScore);

		}
			
		
		sc.close();

	}

}
