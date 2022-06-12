package step07.practice;

class Person1 extends Object {
	String name;
	int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * equals 재정의 1. 매개변수로 들어온 Object타입의 객체 -> Person타입으로 형변환이 가능한지 검증 2. instanceof
	 * 3. name, age 값을 비교 4. 검증 후, name, age가 갖고 있는 데이터가 동일한 경우 -> true 반환
	 */
	public boolean equals(Object object) {
		// ver1
//		if (object instanceof Person1 && name.equals(((Person1) object).name) && age == ((Person1) object).age) {
//
//			return true;
//		} else {
//
//			return false;
//		}

		// ver2
//		if (object instanceof Person1) {
//			if (name.equals(((Person1) object).name) && age == ((Person1) object).age) {
//				return true;
//			}
//		}
//		return false;

		// ver3
		if (object instanceof Person1) {
			Person1 person = (Person1) object;
			if (name.equals(person.name) && age == person.age) {
				return true;
			}
		}
		return false;

	}

}

class Person2 {
	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class EqualsOverride {

	public static void main(String[] args) {
		Person1 p1 = new Person1("Java", 27);
		Person1 p2 = new Person1("Java", 27);
		Person2 p3 = new Person2("Java", 27);

		// 주소값
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p3.hashCode());

		// equals
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		// 객체 끼리 비교하면 주소값을 비교. 따라서 둘다 false
	}

}
