package kosta.hotel;

public class Reservation {
	private static int num = 1;
	private String custName;
	private String custPhone;
	private String custCarad;
	private Room room;
	private int number;
	
	public Reservation() {}

	
	public Reservation(String custName, String custPhone, String custCarad, Room room) {
		super();
		this.custName = custName;
		this.custPhone = custPhone;
		this.custCarad = custCarad;
		this.room = room;
		this.number = num++;
	}


	public String getCustCarad() {
		return custCarad;
	}

	public Room getRoom() {
		return room;
	}

	public int getNumber() {
		return number;
	}


	@Override
	public String toString() {
		return "예약 내역\n성명 : " + custName +"\n핸드폰 번호 : " + custPhone+  "\n예약 번호" + number +
				"\n 객실 타입 : " + room.getRoomType();
	}

	
	

}
