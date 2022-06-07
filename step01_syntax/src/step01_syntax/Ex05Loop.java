/*반복문(Loop)
1. for문 : 반복 횟수가 정확할 때
	- 구조
		for(변수 선언과 초기화; 조건식; 증감식){
			수행 코드;
			...
		}
		
	- 종류
		1. 기본 for문
		2. for Each문
			for(타입 변수 : 데이터 저장객체){
				수행 코드;
				...
			}
			
2. while문 : 반복 횟수가 불명확 또는 무한
	- 구조
		초기식;
		while(조건식){
			수행 코드;
			...
			증감식;
		}

3. do ~ while문 : 반복 조건 검증전 한번 실행후, while문
	- 구조
		초기식;
		do{
			실행 로직, 증감식;
		}while문(조건식);

 */

package step01_syntax;

import java.util.Arrays;

public class Ex05Loop {

	public static void main(String[] args) {
		// for문
		// 5 ~ 1로 출력
//		for(int i = 5; i >= 1; i--) {
//			System.out.println(i);
//		}

		// while문
		// 1 ~ 5
		int i1 = 1;
//		while(i1<=5) {
//			System.out.println(i1);
//			i1++;
//		}

		// do ~ while
		// 1 ~ 5 출력
		int i2 = 1;
//		do {
//			System.out.println(i2);
//			i2++;
//		}while(i2 <= 5);

		// 구구단 출력?!!? (다중 for문)
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i + "단" + "-------");
//			for (int j = 1; j < 10; j++) {
//				int num = i * j;
//				System.out.println(i + " * " + j + "= " + num);
//			}
//		}

		int[][] arrgugu = new int[10][9];

		for (int i = 2; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				arrgugu[i][j] = i * (j + 1);
			}
			System.out.println(i + " 단 : " + Arrays.toString(arrgugu[i]));
		}

	}
}
