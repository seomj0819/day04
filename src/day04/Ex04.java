package day04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		while(true) {
			System.out.println("이름 이력");
			name = input.next();
			System.out.println("입력한 이름 : " + name);
		}
	}
}
