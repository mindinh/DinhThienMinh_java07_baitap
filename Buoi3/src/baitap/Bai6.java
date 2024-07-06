package baitap;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// cau 6
        System.out.println("Enter money in US dollars $: ");
        float dollars = sc.nextFloat();
        float vnd = dollars * 23500;
        System.out.println("$" + dollars + " = " + vnd + "VND");
		
		sc.close();

	}

}
