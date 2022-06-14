package step01.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {

	// OutputStream
	public static void fileSave() throws FileNotFoundException, IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("ByteStream.txt");
			fos.write(97); // ASCII -> a
//			fos.write(65); // ASCII -> A
//			fos.write(66); // ASCII -> B
//			fos.write(67); // ASCII -> C
//			fos.write(68); // ASCII -> D
//			fos.write(69); // ASCII -> E

			byte[] data = { 65, 66, 67, 68, 69 };

			fos.write(data, 1, 3); // 배열도 가능! (1, 3)-> 인덱스 1 ~ 인덱스 3 까지!

			fos.close();
		} finally {
			fos.close();
		}
	}

	// InputStream
	public static void fileOpen() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("ByteStream.txt");

		// step01 ★★★★★
		int data;
		while ((data = fis.read()) != -1) { // read 는 더이상 읽을 값이 없다면 -1 을 반환
			System.out.println((char) data); // character 형변환 필요
		}

		// step02
//		int fileSize = (int) new File("ByteStream.txt").length();// long으로 넘어와서 int 형변환 필요
//		byte[] readData = new byte[fileSize];
//		fis.read(readData);
//		for (int i = 0; i < fileSize; i++) {
//			System.out.println((char) readData[i]);
//	}

	}

	public static void main(String[] args) {
		try {
//			fileSave();
			fileOpen();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); // 문제를 던지면 받을 곳이 필요!
		}
	}

}
