package test;

class Person {
	String name;
	int age;
	int weight;

	Person() {
	}

	Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	void wash() {
		System.out.println("wash");
	}

	void study() {
		System.out.println("study");
	}

	void play() {
		System.out.println("play");
	}

	// quiz
	public void method() {
		System.out.println("부모 호출");
	}
}

interface Allowance {

	abstract void in(int price, String name);

	abstract void out(int price, String name);

	// quiz
	default void method() {
		System.out.println("인터페이스 호출");
	}
}

interface Train {
	abstract void payTuitionFee(int tuitionFee, String name);
}

class Student extends Person implements Allowance, Train {
	Student() {
	}

	Student(String name, int age, int weight) {
		super(name, age, weight);
	}

	public void in(int price, String name) {
		System.out.printf("%s 에게서 %d원 용돈을 받았습니다.%n", name, price);
	}

	public void out(int price, String name) {
		System.out.printf("%d원 금액을 지출했습니다. [지출용도 --> %s]%n", price, name);
	}

	public void payTuitionFee(int tuitionFee, String name) {
		System.out.printf("[%s --> %d원 입금완료]%n", name, tuitionFee);
	}

}

public class Test5 {
	public static void main(String[] args) {
		// Test5 결과 출력하기 & extends와 implements중에서 우선적으로 적용되는 것은 무엇인지 확인해보기
		/*
		 * wash study play 엄마 에게서 10000원 용돈을 받았습니다. 5000원 금액을 지출했습니다. [지출용도 --> 편의점]
		 * [훈련비 --> 50000원 입금완료]
		 */
		Person test1 = new Student();
		test1.method();
		Allowance test2 = new Student();
		test2.method();
		Student test3 = new Student();
		test3.method();

		Person per = new Person();
		Allowance all = new Allowance() {

			@Override
			public void out(int price, String name) {
			}

			@Override
			public void in(int price, String name) {
			}
		};
		Student stu = new Student();

		System.out.println("-------------");
		System.out.println(all.getClass().getName());
		System.out.println("-------------");
		System.out.println(per instanceof Person); // t
		System.out.println(all instanceof Person); // f
		System.out.println(stu instanceof Person); // t

		System.out.println(per instanceof Allowance); // f
		System.out.println(all instanceof Allowance); // t
		System.out.println(stu instanceof Allowance); // t

		System.out.println();

		// -> 부모와 인터페이스에 method를 주고 자식이 가지고 있다.
		// -> 3개 모두다 부모 method를 가지고 왔다.
		// ->

		Person man1 = new Person();
		Student man2 = new Student();

		man1.wash();
		man1.study();
		man1.play();

		man2.in(10000, "엄마");
		man2.out(5000, "편의점");
		man2.payTuitionFee(50000, "훈련비");

		// 인터페이스는 미구현부가 있는 불안정한 상태, 클래스는 다 구현되어있는 안정된 상태,
		// 자바는 안정적인 언어, 상속을 받아 우선순위를 정할때도 우선적으로 상속을 받는다.
	}
}
