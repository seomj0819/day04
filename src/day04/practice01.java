package day04;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String house = null, comp = null;
		int num = 0;
		while (true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();		
			
			switch(num) {
			case 1 : 
				System.out.print("우리집 목적지 입력 "); 
				house = input.next(); break;
			case 2 : 
				System.out.print("회사 목적지 입력 ");
				comp = input.next(); break;
			case 3 : 
				System.out.println("우리집 : " + house); 
				System.out.println("회사 : " + comp); 
				break;
			}
		}
			
		}

}
