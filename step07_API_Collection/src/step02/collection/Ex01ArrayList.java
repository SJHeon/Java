package step02.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.domain.Student;

public class Ex01ArrayList {

	public static void main(String[] args) {
		// ArrayList
		ArrayList arr1 = new ArrayList();
		// add : 추가
		arr1.add("Java");
		arr1.add(new Student("Java", 1, "Junior"));
		arr1.add(3);
		arr1.add("Java");

//		System.out.println(arr1);

		// get : 원소 객체를 반환
//		System.out.println(arr1.get(1));

		// size : 객체 수 반환
//		System.out.println(arr1.size());

		// ??
		// 기본적으로 Object 타입으로 들어가서 타입이 다름. 그래서 Student 타입으로 형변환 해야지 getName 사용 가능!
//		System.out.println(((Student) arr1.get(1)).getName());

		// 제네릭(Generic) : 컬렉션 객체 생성 시, 저장되는 데이터 타입을 지정
		ArrayList<String> arr2 = new ArrayList<String>();
//		arr2.add("Java");
//		arr2.add(new Student("Java", 1, "Junior")); // String형 으로 지정 했기 때문에 Student는 불가능!

		arr2.add("Java1");
		arr2.add("Java2");
		arr2.add("Java3");
		arr2.add("Java4");
		arr2.add("Java5");

		// remove : 해당 인덱스 객체 삭제
//		System.out.println(arr2);
		arr2.remove(2);
//		System.out.println(arr2);
//		System.out.println(arr2.get(2));

		// for문을 이용한 출력
//		for (String string : arr2) {
//			System.out.println(string);
//		}

		// ArrayList vs LinkedList
		List arrayList = new ArrayList();
		List ldkList = new LinkedList();

		long startTime;
		long endTime;
		// ArrayList

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(0, i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList 데이터 삽입 시간은 " + (endTime - startTime) + "밀리초 입니다.");

		// LinkedList
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			ldkList.add(0, i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList 데이터 삽입 시간은 " + (endTime - startTime) + "밀리초 입니다.");
	}

}
