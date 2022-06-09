package step04.abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		DeskTop deskTop1 = new DeskTop();
		deskTop1.turnOn();
		deskTop1.display();
		deskTop1.turnOff();

		LapTop lepTop1 = new LapTop() {

			@Override
			void display() {
				// TODO Auto-generated method stub

			} // 결국 재정의는 해줘야한다!
		};
	}

}
