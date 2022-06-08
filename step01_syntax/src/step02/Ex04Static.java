/* static(정적) (메소드 영역)
 * - 클래스의 소속
 * - 객체 생성 없이도 사용 가능
 * - 사용 : 공용 데이터 값 지정, 변수, 메소드도 사용가능
 */

package step02;

public class Ex04Static {
	// 멤버 변수와 static 멤버 변수
	String name;
	static String company = "busan";

	// static 초기화 블럭
//	static {
//		String company = "busan";
//	}

	// 변하지 않는 수 = 상수(final, static) - 대문자, 언더바 사용
	static final double PI = 3.14;

	Ex04Static(String name) {
		this.name = name;
	}

	static void print() {

	}

	public static void main(String[] args) {
		Ex04Static ppl1 = new Ex04Static("java");
		System.out.println(ppl1.name);

		System.out.println(company);

		System.out.println(PI);

		print();
	}

}
