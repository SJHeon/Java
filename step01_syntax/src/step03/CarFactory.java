package step03;

import model.domain.Car;

public class CarFactory {
	// 싱글톤 패턴
	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	}

	static CarFactory getInstance() {
		return instance;
	}
	// createCar() : return car; 자동차(Car) 객체를 반환

	public Car createCar() {
		Car car = new Car();
		car.setCarNum(car.getCarNum());
		return car;
	}
}
