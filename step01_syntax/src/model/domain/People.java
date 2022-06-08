/* 도메인 모델(Domain Model)
 * - 객체 지향 분석 설계 기반으로 구현하고자 하는 비즈니스 영역의 모델을 생성하는 패턴
 * - 속성, 기능 분리 잘 해야함
 * - 단순 : 하나의 도메인 객체 = 테이블 하나
 * - 재사용성, 유지보수 용이
 */

package model.domain;

public class People {
	// 멤버 변수 (필드)
	// 캡슐화(Capsulation) : 객체가 가지고 있는 멤버 변수를 보호(private)
	private String name;
	private int age;

	// 생성자
	public People() {
	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// get 메소드, 객체 지향에서는 getter 라고 부름
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// set 메소드, 마찬가지로 setter 라고 부름
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("입력한 값은 유효하지 않습니다");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

}
