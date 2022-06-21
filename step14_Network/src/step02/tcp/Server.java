package step02.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// 소켓(Socket) : 프로세스 통신에 사용되는 엔드포인트
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 8888));

			while (true) {
				// 1단계 : 연결
				System.out.println("연결 대기중이다.");
				Socket socket = serverSocket.accept();
				InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(inetSocketAddress.getHostName() + "님이 연결 되었다.");

				// 2단계 : 통신
				byte[] bytes = null;
				String msg = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int countByte = is.read(bytes);
				msg = new String(bytes, 0, countByte, "UTF-8");
				System.out.println("메세지를 받았다. : " + msg);

				OutputStream os = socket.getOutputStream();
				msg = "반갑다. 나는 서버다.";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush(); // 한번에 모든 데이터를 전송해줌
				System.out.println("메세지 보냈다.");

				os.close();
				is.close();
				socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
