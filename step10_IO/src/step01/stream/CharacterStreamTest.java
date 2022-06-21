package step01.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest {
	public static void main(String[] args) {
		// Writer
		try {
			FileWriter fw = new FileWriter("CharacterStream.txt");
			fw.write("여행이 너무 가고 싶어요" + "\n");
			fw.write("어디로 가지?" + "\n");

			fw.write(new char[] { '가', '평' });

			fw.close();
			System.out.println("저장 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reader //finally 변환 해봐
//		FileReader frFileReader = null;
		// try-with-resources
		try (FileReader fr = new FileReader("CharacterStream.txt");) {
			int data;
			while ((data = fr.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
