/* 싱글톤 패턴(Singleton Pattern)
 * - 하나의 객체만 생성 가능 -> 내부의 메소드 혹은 데이터를 사용하는 경
 */

package step03;

public class Singleton {
	// 멤버 변수(필드) 2
	private static Singleton instance = new Singleton();

	// private 생성자 1
	private Singleton() {
	}

	// 메소드 (getInstance) : 내부에서 생성된 객체를 공유 하도록 설정 3
	public static Singleton getInstance() {
		return instance;
	}

	public static void getName() {

	}

}
