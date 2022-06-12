package step05.interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int x = 10;
		int y = 3;
		Calc calc2 = new Calculator();

		System.out.println(calc.add(x, y));
		System.out.println(calc.substract(x, y));
		System.out.println(calc.times(x, y));
		System.out.println(calc.divide(x, y));

		calc.turnOn();
		calc2.turnOn();
	}

}
