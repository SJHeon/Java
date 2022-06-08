package step03;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton singleton1 = new Singleton(); // new 연산자로 객체 가져올 수 없음
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton1);
		System.out.println(singleton2);

	}

}
