/* 참조 타
 * - 변수 -- (stack), 객체 -- 힙(heap) 영역에서 생성
 * - 기본값 : null
 * 		- 참조할 객체가 없을 경우, NullpointerException(NP) 발생
 */

package step01_syntax;

import java.util.Arrays;

public class Ex06Reference {

	public static void main(String[] args) {
		// 문자열 (String)
		// ==, equals

		String str1 = "Java";
//		System.out.println(str1);
//		System.out.println(str1.hashCode()); // 주소 값을 수치적 데이터로 보여줌

		str1 = null;
//		System.out.println(str1);
//		System.out.println(str1.hashCode()); // java.lang.NullPointerException

		/*
		 * 배열(Array) : 데이터 값 여러가지를 한 개의 변수에 대입 - 구조 : 타입[] 변수명 = {요소1, 요소2, ...}; - 특징 :
		 * 길이가 고정(사용 가능한 데이터 값의 갯수)가 고정 - 종류 : 1차원, 다차원 배열
		 */
		// 배역 선언 및 초기화
		int[] arr1 = { 1, 2, 3 };
		String[] arr2 = { "one", "two", "three" };

		// 사용하려는 공간도 안 만들었음
		int[] arr3;
//		arr3 = {4, 5, 6}; // !ERROR 초기화 해줘야 함
		arr3 = new int[] { 4, 5, 6 };

		// 사용하려는 공간을 먼저 만들었음
		int[] arr4 = new int[3];

		// 2차원 배열
		int[][] arr11 = new int[3][4];

		// 배열 값 접근 : index - 0부터 시작
//		System.out.println(arr1[0]);
//		System.out.println(arr1[3]); // java.lang.ArrayIndexOutOfBoundsException

		// 배열의 길이 : length
//		System.out.println(arr1.length);

		// 배열의 데이터 값 ?!
//		System.out.println(arr1);

		// step01
//		for(int i = 0; i < 3; i++) {
//			System.out.println(arr1[i]);
//		}
//		
		// step02
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}

		// step03
//		for(int i : arr1) {
//			System.out.println(i);
//		}

		// 얕은 복사
		int[] arr5 = { 1, 2, 3 };
		int[] arr6 = arr5;

//		System.out.println(arr6[0]);
//		System.out.println(arr5[0]);
		arr6[0] = 10; // {10, 2, 3} 같은 배열을 참조 하기 때문에 원본 또한 변경이 일어난(얕은 복사)
//		System.out.println(arr6[0]);
//		System.out.println(arr5[0]);

		// 깊은 복사
		// step 01 for
		int[] arr7 = { 1, 2, 3 };
		int[] arr8 = new int[arr7.length];
		for (int i = 0; i < arr7.length; i++) {
			arr8[i] = arr7[i];
		}

//		System.out.println(arr7[0]);
//		System.out.println(arr8[0]);
		arr8[0] = 10; // {10, 2, 3}
//		System.out.println(arr7[0]);
//		System.out.println(arr8[0]);

		// step02 clone
		int[] arr9 = arr7.clone();

		arr9[0] = 10;
//		System.out.println(arr7[0]);

		// step03 Arrays.copyOf
		int[] arr10 = Arrays.copyOf(arr7, arr7.length);
		arr10[0] = 10;
//		System.out.println(arr7[0]);

	}

}
