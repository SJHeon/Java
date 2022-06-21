package test;

import java.util.ArrayList;

abstract class Car {
	abstract void run();
}

class Ambulance extends Car {
	void run() {
		System.out.println("앰뷸런스  run!");
	}
}

class Cultivator extends Car {
	void run() {
		System.out.println("경운기 run!");
	}
}

class SportsCar extends Car {
	void run() {
		System.out.println("스포츠카 run!");
	}
}

public class Test4 {
	public static void main(String[] args) {

		// Test4 ArrayList를 통해 전체 값 출력하기
		/*
		 * 앰뷸런스 run! 경운기 run! 스포츠카 run!
		 */
		ArrayList<Car> carList = new ArrayList<Car>();

		Ambulance amb = new Ambulance();
		Cultivator cul = new Cultivator();
		SportsCar spo = new SportsCar();

		carList.add(amb);
		carList.add(cul);
		carList.add(spo);

		for (Car car : carList) {
			car.run();
		}
	}
}
