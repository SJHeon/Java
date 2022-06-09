package step03.oop;

class Animal {

	public void move() {
		System.out.println("Animal Move");
	}

	public void eating() {

	}
}

class Human extends Animal {
	public void move() {
		System.out.println("Human Move");
	}

	public void readBooks() {
		System.out.println("Human Read books");
	}
}

class Tiger extends Animal {

	public void move() {
		System.out.println("Tiger Move");
	}

	public void hunting() {
		System.out.println("Tiger Hunt");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("Eagle Move");
	}

	public void fly() {
		System.out.println("Eagle Fly");
	}
}

public class AnimalTest {

	// public void downCasting(aniamlArray)
	// instanceof : 객체의 타입 확인
	// - 문법 : 객체 instanceof 타입
	// - 결과 : boolean((형변환 가능하면)true or (불가능하면)false)

	public static void downCasting(Animal[] animalArray) {
		for (int i = 0; i < animalArray.length; i++) {
			Animal animal = animalArray[i];

			if (animal instanceof Human) {
				((Human) animal).readBooks();
			} else if (animal instanceof Tiger) {
				((Tiger) animal).hunting();
			} else if (animal instanceof Eagle) {
				((Eagle) animal).fly();
			} else {
				System.out.println("Error!");
			}
		}

	}

	// 만약 형변환 없다면? -> 필요없는 것은 아니지만 코드가 길어지고 지저분해 짐
	public static void downCastingHuman(Human human) {
		human.readBooks();
	}

	public static void downCastingTiger(Tiger tiger) {
		tiger.hunting();
	}

	public static void downCastingEagle(Eagle eagle) {
		eagle.fly();
	}

	public static void main(String[] args) {
		// 다형성(Polymorphism) : 형태 = 타입(클래스) (상속 가능하다는 전제 하에 사용가능)

//		Human human = new Human();
		// UpCasting : 자식객체가 부모 타입으로 형변환 하면서 생성되는 것
		Animal human = new Human();
//		System.out.println(human);

//		human.move();
//		human.readBooks();

		// DownCasting : 부모 타입으로 생성된 자식객체가 자신의 타입으로 형변환 하는 것
		Human human1 = (Human) human;
//		human1.readBooks();
		System.out.println();

		// 자식객체는 자식 타입으로 생성 가능하다. O
		// 부모객체는 부모 타입으로 생성 가능하다. O
		// 자식객체는 부모 타입으로 생성 가능하다. O
		// 부모객체는 자식 타입으로 생성 가능하다. X

//		Human test = (Human) new Animal();
//		test.move(); // !ERROR : java.lang.ClassCastException

//		Tiger tiger = new Tiger();
		Animal tiger = new Tiger();
//		tiger.move();
//		tiger.hunting();

		System.out.println();

//		Eagle eagle = new Eagle();
		Animal eagle = new Eagle();
//		eagle.move();
//		eagle.fly();
		System.out.println();

		// 배열로 한번에?
		Animal[] animalArray = { human, tiger, eagle };
//		for (Animal animal : animalArray) {
//			animal.move();
//		}

		downCasting(animalArray);

	}

}
