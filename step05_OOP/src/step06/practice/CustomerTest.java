package step06.practice;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();

		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		Sell seller = customer;
		seller.sell();
		seller.order();

		// 형변환 해도 재정의된 자식계층의 order를 가져옴 (궁극적으로는 override 때문)
		// 추상클래스 vs 인터페이스
		// 인터페이스 : 2개이상 인터페이스 하나의 클래스에서 구현가능 -> 오더의 경우 처럼 충돌 날 수가 있다
		// 추상클래스 : 하나의 클래스는 하나의 클래스에만 상속이 가능 -> 따라서 충돌이 일어날 수가 없다 -> 단일 상속
	}

}
