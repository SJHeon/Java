/* 접근 제한자(Access Modifier)
 * 1. 호출 가능 범
 *  - public : 동일 class / 동일 package / 외부 package
 *  - private : 동일 class
 *  - default(생략시 자동으로 붙는) : 동일 package
 *  - protected : 동일 class / 동일 package, 단, 상속 관계일 경우 외부 package에서도 접근 가능
 *  
 *  2. 사용 가능 위치
 *  - 클래스 선언구 : public, default
 *  - 변수, 생성자, 메소드 선언구 : public, protected, default, private
 */

package step02;

import model.domain.People;

public class Ex05Access {

	public static void main(String[] args) {
		People ppl1 = new People("java", 27);

//		System.out.println(ppl1.name); // 더이상 name 접근 불가 -> private
//		ppl1.age = 30;
//		System.out.println(ppl1.age);
		ppl1.setAge(-100);
//		System.out.println(ppl1.age);
		ppl1.getName();
	}

}
