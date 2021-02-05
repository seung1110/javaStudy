package kosta.oop4;

public class Main {

	public static void main(String[] args) {
		SNSMessage s = new SNSMessage();
		s.send("ok");
		
		MessageSender sns = new MessageSender() {
			
			@Override
			public void send(String msg) {
			System.out.println("메세지 전송 " + msg);
				
			}
		};
		
		sns.send("ok");

	}

}
