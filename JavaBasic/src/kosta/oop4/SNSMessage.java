package kosta.oop4;

public class SNSMessage implements MessageSender{

	@Override
	public void send(String msg) {
		System.out.println("메세지 전송");
		
	}
	
}
