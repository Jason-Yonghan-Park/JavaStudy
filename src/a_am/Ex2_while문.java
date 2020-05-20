package a_am;

import java.util.Scanner;

public class Ex2_while문 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 키보드에서 찍는 수 만큼 옆으로 별이 찍히는 명령문을 작성
		// 키보드로부터 숫자를 하나 받기 위한 작업
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하세요: ");
		int cnt = scan.nextInt();
		
		// for문으로 작성하는 법
		String str = "*";
//		for(int i = 1; i <= cnt; i++) {					// i = 0 으로 설정한다면 i < cnt 로 설정해야함. -> i가 0부터 수행했기때문에 0 1 2 3 4 가 됐을 때 5번 수행한 것임
//			System.out.printf("%2s", str);
//		}
		
		// while문으로 작성하는 법
		
		int i = 0;
		while(i++ < cnt) {								// while문의 괄호 안에는 조건식만 적는다 -> 변수 선언은 안됨
			System.out.printf("%2s", str);
		}
		
		
		
	}

}
