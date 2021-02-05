package kosta.video;

public class GeneralMember {
	private String id, name,address;
	private Video rentalVideo;
	
	public GeneralMember() {}
	
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	public void rentalService(Video vi) {
		this.rentalVideo = vi;
	}
	
	public void printMember() {
		System.out.println("회원 아이디 : " + this.id);
		System.out.println("회원 이름 : " + this.name);
		System.out.println("회원 주소 : " + this.address);
		if(this.rentalVideo != null) {
			System.out.println("회원이 대여한 비디오 번호: " +this.rentalVideo.getNo());
			System.out.println("회원이 대여한 비디오 제목: "+this.rentalVideo.getTitle());
			System.out.println("회원이 대여한 비디오 주인공: "+this.rentalVideo.getActor());
		}
		else
			System.out.println("대여한 비디오가 없습니다.");
	}
	
	
}
