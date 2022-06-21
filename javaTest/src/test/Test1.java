//package test;
//
//class Person {
//	private String personName = "person";
//
//	public void method1() {
//		System.out.println("person");
//	}
//}
//
//class Student extends Person {
//	private String studentName = "student";
//
//	public void method1() {
//		System.out.println("student");
//	}
//
//	public void method2() {
//		super.method1();
//	}
//}
//
//public class Test1 {
//	public static void main(String[] args) {
//
//		// Test1-1 객체 생성 방법이 잘못된 부분과 그 이유는?
//		Student student1 = new Student(); // O : 자식 객체는 자식 타입으로 생성 가능
//		Person student2 = new Student(); // O : 자식 객체는 부모타입으로 생성 가능
//		Person person1 = new Person(); // O : 부모 객체는 부모 타입으로 생성 가능
////		Student person2 = new Person(); // X : 부모 객체는 자식타입으로 생성 불가능
//
//		// Test1-2 student3에서 자식의 메소드 호출하고 student4에서 부모의 메소드를 호출하려면?
//		Person student3 = new Student();
//		student3.method1();
//		Student student4 = new Student();
////		student4.method1();
//		student4.method2();
//	}
//}
