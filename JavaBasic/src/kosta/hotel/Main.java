package kosta.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private ArrayList<Reservation> resList = new ArrayList<Reservation>();
	private Room rooms[] = { new Room("101호", "스탠다드", 100000), new Room("102호", "스탠다드", 100000),
			new Room("103호", "스탠다드", 100000), new Room("201호", "디럭스", 150000), new Room("202호", "디럭스", 150000),
			new Room("203호", "디럭스", 150000), new Room("301호", "스위트", 200000), new Room("302호", "스위트", 200000),
			new Room("303호", "스위트", 200000),

	};
	Pay p = new Pay();

	public static void main(String[] args) {
		Main m = new Main();
		int pass = 1004;
		while (true) {
			System.out.println("1. 객실 예약    2. 예약 취소    3. 체크인    4. 체크아웃    5. 관리자 페이지    6. 종료");
			switch (sc.nextLine()) {
			case "1":
				m.createRes();
				break;
			case "2":
				m.cancelRes();
				break;
			case "3":
				m.checkIn();
				break;
			case "4":
				m.checkOut();
				break;
			case "5":
				System.out.print("비밀번호를 입력하세요 : ");
				int num = Integer.parseInt(sc.nextLine());
				if (num == pass) {
					while (true) {
						System.out.println("1. 객실 상태 확인    2. 미 체크인 고객 처리    3. 종료");
						String temp = sc.nextLine();
						if (temp.equals("1"))
							m.checkStatus();
						else if (temp.equals("2"))
							m.manageRoom();
						else if (temp.equals("3"))
							break;
					}
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					break;
				}
			case "6":
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}

	}

	public void checkStatus() {

		System.out.println("RoomNo\t예약\t체크인");
		for (Room r : rooms) {
			System.out.print(r.getRoomNo() + "\t");
			if (r.isReserved())
				System.out.print("O" + "\t");
			else
				System.out.print("X" + "\t");
			if (r.isCI())
				System.out.print("O" + "\t");
			else
				System.out.print("X" + "\t");
			System.out.println();

		}

	}

	public void manageRoom() {
		System.out.print("결제 처리할 객실 번호를 입력하세요 : ");
		int check = 0;
		String no = sc.nextLine() + "호";
		for (Reservation r : resList) {
			Room temp = r.getRoom();
			if (temp.getRoomNo().equals(no)) {
				if (!temp.isCI() && temp.isReserved()) {
					p.payCard(temp.getPrice(), r.getCustCarad());
					System.out.println("해당 객실이 결제처리 되었습니다.");
					check = 1;
					break;
				} else {
					break;
				}
			}
		}
		if (check == 0)
			System.out.println("잘못된 객실 번호입니다.");
	}

	public void cancelRes() {
		System.out.print("취소할 예약 번호를 입력해주세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int check = 0;

		for (Reservation r : resList) {
			if (r.getNumber() == num) {
				System.out.print(num + "번 예약을 취소하시겠습니까?(Y/N)");
				String in = sc.nextLine();
				if (in.equals("y") || in.equals("Y")) {
					r.getRoom().setReserved(false);
					resList.remove(r);
					System.out.println("예약이 취소되었습니다.");
					check = 1;
					break;
				} else {
					System.out.println("취소하였습니다.");
					check = 1;
					break;
				}
			}
		}
		if (check == 0) {
			System.out.println("잘못된 예약 번호입니다.");
		}
	}

	public void checkOut() {
		System.out.print("객실 번호를 입력해주세요 : ");
		String roomNum = sc.nextLine() + "호";
		int check = 0;
		for (Reservation r : resList) {
			Room room = r.getRoom();
			if (room.getRoomNo().equals(roomNum) && !room.isCO()) {
				System.out.println("                계산서");
				System.out.println("객실 번호 : " + room.getRoomNo());
				System.out.println("객실 타입 : " + room.getRoomType());
				System.out.println("가       격 : " + room.getPrice());
				System.out.println("결제하시겠습니까?(1. 카드   2. 현금    3. 취소)");
				String temp = sc.nextLine();
				if (temp.equals("1")) {
					p.payCard(room.getPrice(), r.getCustCarad());
					room.setCO(true);
					room.setCI(false);
					room.setReserved(false);
					check = 1;
					break;
				} else if (temp.equals("2")) {
					p.payCash(room.getPrice());
					check = 1;
					room.setCO(true);
					room.setCI(false);
					room.setReserved(false);
					break;
				} else if (temp.equals("3")) {
					System.out.println("취소되었습니다.");
					check = 1;
					break;
				} else {
					System.out.println("잘못된 입력입니다.");
					check = 1;
					break;
				}
			}
		}
		if (check == 0)
			System.out.println("잘못된 객실 번호입니다.");
	}
	

	public void createRes() {

		// 객실 목록 출력
		int sNum = 0;
		int dNum = 0;
		int swNum = 0;
	
			for (int i = 0; i < rooms.length; i++) {
				if (rooms[i].getRoomType().equals("스탠다드") && !rooms[i].isReserved()) {
					sNum++;
				}
				if (rooms[i].getRoomType().equals("디럭스") && !rooms[i].isReserved()) {
					dNum++;
				}
				if (rooms[i].getRoomType().equals("스위트") && !rooms[i].isReserved()) {
					swNum++;
				}
			}
			System.out.println("No.\t" + "방 종류\t" + "가격\t" + "\t수량");
			System.out.println("1.\t" + "스탠다드\t" + "100,000원\t" + sNum);
			System.out.println("2.\t" + "디럭스\t" + "150,000원\t" + dNum);
			System.out.println("3.\t" + "스위트\t" + "200,000원\t" + swNum);

			// 예약 시작
			System.out.print("원하시는 객실의 번호를 입력하세요: ");
			String roomChoice = sc.nextLine();

			System.out.println("고객의 정보를 입력하세요.");
			System.out.print("이름: ");
			String custName = sc.nextLine();
			System.out.print("휴대폰 번호: ");
			String custPhone = sc.nextLine();
			System.out.print("카드 번호: ");
			String custCard = sc.nextLine();
			switch (roomChoice) {
			case "1":
				int check = 0;
				for (int i = 0; i < rooms.length; i++) {
					if (rooms[i].getRoomType().equals("스탠다드") && !rooms[i].isReserved()) {
						Reservation newRes = new Reservation(custName, custPhone, custCard, rooms[i]);
						resList.add(newRes);
						rooms[i].setReserved(true);
						System.out.println("예약이 완료되었습니다.\n");
						System.out.println(newRes.toString() + "\n");
						check = 1;
						break;
					}
				}
				if (check == 0)
					System.out.println("비어있는 객실이 없습니다.");
				break;
			case "2":
				int check2 = 0;
				for (int i = 0; i < rooms.length; i++) {
					if (rooms[i].getRoomType().equals("디럭스") && !rooms[i].isReserved()) {
						Reservation newRes = new Reservation(custName, custPhone, custCard, rooms[i]);
						resList.add(newRes);
						rooms[i].setReserved(true);
						System.out.println("예약이 완료되었습니다.\n");
						System.out.println(newRes.toString() + "\n");
						check2 = 1;
						break;
					}
				}
				if (check2 == 0)
					System.out.println("비어있는 객실이 없습니다.");

				break;
			case "3":
				int check3 = 0;
				for (int i = 0; i < rooms.length; i++) {
					if (rooms[i].getRoomType().equals("스위트") && !rooms[i].isReserved()) {
						Reservation newRes = new Reservation(custName, custPhone, custCard, rooms[i]);
						resList.add(newRes);
						rooms[i].setReserved(true);
						System.out.println("예약이 완료되었습니다.\n");
						System.out.println(newRes.toString() + "\n");
						check3 = 1;
						break;
					}
				}
				if (check3 == 0)
					System.out.println("비어있는 객실이 없습니다.");

				break;
			}
			sNum = 0;
			dNum = 0;
			swNum = 0;

		
	}
	
	public void checkIn() {
		System.out.print("예약번호 입력:");
		int resNo = sc.nextInt();
		sc.nextLine();
		int check = 0;
		Reservation r0 = null;
		for(Reservation res : resList) {
			if(resNo==res.getNumber() && !res.getRoom().isCI()) {
				res.getRoom().setCI(true);
				System.out.println();
				System.out.println(res.getRoom().getRoomNo()+" 체크인 완료");
				check = 1;
			}
			else if(resNo==res.getNumber() && res.getRoom().isCI() ) {
				System.out.println("이미 체크인된 예약번호입니다.");
			}
		}
		if(check ==0)
			System.out.println("잘못된 예약번호입니다.");
	
		
	}



}
