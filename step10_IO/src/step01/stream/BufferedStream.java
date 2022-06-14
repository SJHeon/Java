package step01.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		// 보통 버퍼의 크기를 1024 ~ 8192 로 잡음
		// Buffer(8192) : 입력 혹은 출력에 대한 임시 저장 공간 -> 데이터를 한번에 처리하는 보조 stream
		// FileWriter - BufferedWriter
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("cheerup.txt"));
//			bw.write("여러분" + "\n");
//			bw.write("요즘 다들 힘드시죠? 에너지 충전이 필요할 겁니다");
//			bw.write("그래서 오늘 숙제 드릴거에요");
//
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// BufferedReader // 이것도 finally 로 바꾸
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("cheerup.txt"));
//
//			String msg;
//
//			while ((msg = br.readLine()) != null) {
//				System.out.println(msg);
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// Buffered 보조 스트림 성능 차이
		long startTime;
		long endTime;

		try {
			// 미사용
			FileInputStream fis = new FileInputStream("Big-Italian-Salad.jpeg");

			startTime = System.currentTimeMillis();
			while (fis.read() != -1) {
			}
			endTime = System.currentTimeMillis();

			System.out.println("미사용 : " + (endTime - startTime) + "ms");
			fis.close();

			// 사용
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Big-Italian-Salad.jpeg"));
			startTime = System.currentTimeMillis();
			while (bis.read() != -1) {
			}
			endTime = System.currentTimeMillis();

			System.out.println("미사용 : " + (endTime - startTime) + "ms");

			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
