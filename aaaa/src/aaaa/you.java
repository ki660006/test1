package aaaa;

import java.util.*;

public class you{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("현재 월을 입력하세요 : " );
		String input=scanner.nextLine();
		int month=Integer.parseInt(input);
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.print("이 달은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.print("이 달은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.print("이 달은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.print("이 달은 겨울입니다.");
			break;
		default:
			System.out.print("이건 업서");
			
			
		
		}
	}
}