package model.domain;

public class Car {
	private int carNum;
	private static int serialNum = 343;

	// 생성자
	public Car() {
		carNum = serialNum;
	}

	// getter : getCarNum
	public int getCarNum() {
		return carNum;
	}

	// setter : setCarNum
	public int setCarNum(int carNum) {
		carNum += 1;
		return carNum;
	}
}
