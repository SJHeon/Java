package step05.interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999;

	int add(int x, int y);

	int substract(int x, int y);

	int times(int x, int y);

	int divide(int x, int y);

	// java8 버전 이후 : default, static 사용가능
	default void turnOn() {
		System.out.println("turn On");
	}

}
