package step01.stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialization {

	public static void main(String[] args) {
		// 객체 출력 - ObjectOutputStream
		try {
//			FileOutputStream fos = new FileOutputStream("Object.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//			oos.writeObject(new String("Busan"));
//			oos.writeObject(new Integer(1));
//
//			oos.close();
//			fos.close();
//
//			System.out.println("객체 출력 성공");
//

			// 객체 입력 - ObjectInputStream
			FileInputStream fis = new FileInputStream("Object.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

//			System.out.println((String) ois.readObject());
//			System.out.println((Integer) ois.readObject());

			//
			boolean flag = true;
			Object obj = null;
			while (flag) {
				obj = ois.readObject();
				System.out.println(obj);
			}

			ois.close();
			fis.close();

			// 직렬화
//			Kid kidOut = new Kid();
//			kidOut.setName("Busan");
//			kidOut.setAge(27);
//			kidOut.setPersonalNumber(12345);
//
//			ObjectOutputStream oosKid = new ObjectOutputStream(new FileOutputStream("Kid.txt"));
//			oosKid.writeObject(kidOut);
//
//			oosKid.close();

			// ----- mine
//			Child childOut = new Child();
//			childOut.setName("Daegu");
//			childOut.setAge(23);
//			childOut.setNickname("MeoGu");
//			childOut.setNameCode(053);
//
//			ObjectOutputStream oosChild = new ObjectOutputStream(new FileOutputStream("Child.txt"));
//			oosChild.writeObject(childOut);
//
//			oosChild.close();

			// 역직렬화
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Kid.txt"));
//			Kid kidIn = (Kid) ois.readObject();// readObject 리턴 타입이 Object라서 형변환 해줌
//
//			System.out.println(kidIn.getName());
//			System.out.println(kidIn.getAge());
//			System.out.println(kidIn.getPersonalNumber());
//
//			ois.close();

			// ----- mine
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Child.txt"));
//			Child childIn = (Child) ois.readObject();
//			System.out.println(childIn.getName());
//			System.out.println(childIn.getAge());
//			System.out.println(childIn.getNickname());
//			System.out.println(childIn.getNameCode());
//
//			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
