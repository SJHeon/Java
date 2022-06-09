package step02.oop;

/* 제품 구입시 10% 할인된 가격으로 제공
 * 보너스 포인트는 제품 가격의 5% 적립
 * staffId 배정
 */
public class VIPCustomer extends Customer {
//	private int customerId;
//	private String customerName;
//	private String customerGrade;
//	private int bonusPoint;
//	private double bonusRatio;
	private String staffId;
	private double saleRatio;

	// 기본 생성자
	public VIPCustomer() {
		super(); // 생략되어 들어있다.
		customerGrade = "VIP"; // super.customerGrade = "VIP"; 이다.
		bonusRatio = 0.05;
		saleRatio = 0.1;

//		System.out.println("VIPCustomer 생성자 호출");
	}

	// 사용자 정의 생성자
	public VIPCustomer(int customerId, String customerName) {
//		this.customerId = customerId;
//		this.customerName = customerName;

		super(customerId, customerName); // 부모요소 가져와서 쓸 수 있다!
		customerGrade = "VIP"; // super.customerGrade = "VIP"; 이다.
		bonusRatio = 0.05;
		saleRatio = 0.1;

//		System.out.println("VIPCustomer 생성자 호출");
	}

	// 메소드도 입맛에 맞게 바꿔 쓸 수 있다!
	// 메소드 오버라이딩(Method Overriding)
	// 전제 조건 : 반환 타입, 메소드명(매개변수)가 모두 100% 동일 한 경우 에만 가능!

	@Override
	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price;

//		return super.calcPrice(price);
		bonusPoint += price * bonusRatio;
		price = (int) (price - price * saleRatio);
		return price;
	}
}
