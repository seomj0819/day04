package day04;

import java.util.Scanner;

public class practice02 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	while(true)
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		int scr = input.nextInt();

		if( scr <= 0 || scr >= 100)
		{
			break;
		}
		else if( scr>=80)
		{
			System.out.println("축하합니다. 합격입니다.");
		}
		else
		{
			System.out.println("죄송합니다. 불합격입니다.");
		}
	}
}
}




