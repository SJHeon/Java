package step01.exception;

class Info {
	static {
		System.out.println("Info 클래스");
	}
}

public class Ex02Exception {

	public static void main(String[] args) {

//		System.out.println(1);
		try {
//			System.out.println(2);
			Class.forName("step01.exception.Info");
		} catch (ClassNotFoundException e) {
//			System.out.println(3);
			e.printStackTrace();
		} finally {
//			System.out.println(4);
		}

		// catch문 순서, multi-catch

		try {
			// java.lang.NullPointerException
			String str1 = null;
			System.out.println(str1.length());

			// java.lang.NumberFormatException
			String str2 = "three";
			Integer.parseInt(str2);
//		} catch (NullPointerException | NumberFormatException e) { // multi-catch
		} catch (Exception e) { // 상위 객체 호출해서 쓴 것
			System.out.println("Exception");
		}

	}

}
