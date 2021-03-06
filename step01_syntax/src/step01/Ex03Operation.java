package step01;

public class Ex03Operation {

	public static void main(String[] args) {
		// 숫자 연산 : +, -, *, /, %
		int v1 = 10;
		int v2 = 3;
		
		// System.out.println(v1 % v2);
		
		// 증감 연산 : ++, -- 
		// System.out.println(++ v1); // 11
		// System.out.println(v1 ++); // 11
		// System.out.println(v1); // 12
		
		// 기본 연산
		byte v3 = 10;
		byte v4 = 3;
		byte v5 = (byte) (v3 + v4); // 명시적 형변환이 필요하다(기본형 int인데 보다 작은 byte로 넘어 가려면 해줘야함. 데이터소실 위험이 있다)
		// int v5 = (v3 + v4);

		// 3.33333..??
		// double
		double result1 = v3/v4;
		// System.out.println(result1); // 이미 연산되어 있는 값에 double 주는거라 의미 없
		
		double result2 = (double) v3 / v4;
		// System.out.println(result2);
		
		// Not a Number
		// System.out.println((5 % 0.0) + 2); // NaN -> 수치적 데이터가 아닌 숫자가 아닐 때 나오는 특수한 값
		
		// 논리 연산 : &, |, ^, !
		boolean isTrue = true;
		boolean isFalse = false;
		
		// &, &&
		// System.out.println(isTrue & isTrue);
		
		// System.out.println(isTrue & isFalse); // false -> 조건을 모두 비교한후에 결과를 내어줌 (false & false) -> false네?
		// System.out.println(isTrue && isFalse); // false -> 조건들 중에 하나만이라도 false면 바로 결과 내어줌 ([false -> (false네?)] & false) -> 뒤에 조건 안보고 false!
		
		// |, ||
		
		// ^ : 연산결과 하나는 true, 다른 하나는 false --> true
		// System.out.println(isTrue ^ isFalse); // true
		
		// ! : 논리 값을 변경(true -> false, false -> true)
		// System.out.println(!isTrue);
		
		// 비교 연산 : <, <=, >, >=, ==, !=
		int num1 = 1;
		int num2 = 10;
		
		// System.out.println(num1 == num2);
		// System.out.println(num1 != num2);
		
		double num3 = 1.0;
		// System.out.println(num1 == num3);
		
		// 대입 연산 : =, +=, -=, ...
		int assign = 1;
		assign *= 10; // assign = assign * 10
		// System.out.println(assign);
		
		// 문자열(String) 연산 // 객체 타입
		String str1 = "String 1";
		String str2 = "String 1";
		String str3 = "String 2";
		String str4 = new String("String 1");
		
		// System.out.println(str3);
		// System.out.println(str4);
		// System.out.println(str2);
		// System.out.println(str1);
		
		// 문자열 + 연산 : 연결 연산
		// System.out.println(str1 + '\t' + str2); // '\t' -> tab , '\n' -> line
		
		// 문자열 == 비교 : 같은 객체 여부
		// System.out.println(str1 == str1); // true
		// System.out.println(str1 == str2); // true
		// System.out.println(str1 == str3); // false
		// System.out.println(str1 == str4); // false
		
		// equals : 문자열 내용이 같은지 여부
		// System.out.println(str1.equals(str2)); // true
		// System.out.println(str1.equals(str3)); // false
		// System.out.println(str1.equals(str4)); // true
		
		// 삼항 연산 --> 조건 ? 결과1 (true) : 결과2 (false)
		// 67.5 이상이면 A, 그 
		
		double meat = 66.1;
		String grade = (meat >= 67.5) ? "A 등급" : "그 외 등급";
		System.out.println(grade);
	}

}
