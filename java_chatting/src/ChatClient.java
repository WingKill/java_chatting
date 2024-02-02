
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) {
		Socket socket = null;
		// 유저 소켓	
		try {
			socket = new Socket("localhost", 7777);
			// 컴퓨터 내 7777 프로그램에 접근			
			System.out.println("서버에 연결되었습니다.");
						
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
