package kosta.hotel;

public class Room {
	private String roomNo;
	private String roomType;
	private int price;
	private boolean isReserved = false;
	private boolean isCI = false;
	private boolean isCO = false;
	
	public Room() {}

	public Room(String roomNo, String roomType, int price) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.price = price;
	}
	public String getRoomNo() {
		return roomNo;
	}

	public String getRoomType() {
		return roomType;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	public boolean isCI() {
		return isCI;
	}S
	public void setCI(boolean isCI) {
		this.isCI = isCI;
	}
	public boolean isCO() {
		return isCO;
	}
	public void setCO(boolean isCO) {
		this.isCO = isCO;
	}

	@Override
	public String toString() {
		return "roomNo : " + roomNo + "  예약 상테 : " + isReserved + "    체크인 여부: " + isCI;
	}
	
	
	
	
}
