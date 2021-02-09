package kosta.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Manager m = new Manager();
		while (true) {
			System.out.println("1. 추가 2. 출력 3. 검색 4. 수정 5. 삭제 6. 정렬  7. 저장  8. 가져오기 9. 서버에 저장"
					+ "10. 서버에서 불러오기 11. 종료");
			String temp = DataInput.sc.nextLine();
			switch (temp) {
			case "1": {
//				System.out.println("추가할 정보를 입력해주세요(이름, 전화번호, 생년월일)");
//				String[] ans = sc.nextLine().split(" ");
//				m.addPhoneInfo(new PhoneInfo(ans[0], ans[1], ans[2]));
				while (true) {
					try {
						System.out.println("1. 일반 추가  2. 동창 추가  3. 직장 동료 추가");
						String s = DataInput.sc.nextLine();
						if (s.equals("1"))
							m.addPhoneInfo();
						else if (s.equals("2"))
							m.addPhoneInfoUniverse();
						else if (s.equals("3"))
							m.addPhoneInfoCompany();
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;
			}
			case "2": {
				m.listPhoneInfo();
				break;
			}
			case "3": {
				System.out.print("검색할 이름을 입력하세요 : ");
				m.searchPhoneInfo(DataInput.sc.nextLine());
				break;
			}
			case "4": {
				System.out.print("이름을 입력하세요 : ");
				String name = DataInput.sc.nextLine();
				System.out.print("수정할 번호를 입력하세요 : ");
				String num = DataInput.sc.nextLine();
				m.modifyPhoneInfo(name, num);
				break;
			}
			case "5": {
				System.out.print("삭제할 이름을 입력하세요 : ");
				m.delPhoneInfo(DataInput.sc.nextLine());
				break;
			}
			case "6":
				System.out.println("정렬 기준 선택 ( 1. 이름 2. 전화번호  -내림차순은 번호를 두번)");
				switch (DataInput.sc.nextLine()) {
				case "1":
					System.out.println("이름 - 오름차순 출력");
					m.sortName();
					break;
				case "2":
					System.out.println("전화번호 - 오름차순 출력");
					m.sortNumber();
					break;
				case "11":
					System.out.println("이름 - 내림차순 출력");
					m.sortDName();
					break;
				case "22":
					System.out.println("전화번호 - 내림차순 출력");
					m.sortDNumber();
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}
				break;
			case "7":
				try {
					m.save();
				} catch (Exception e) {
						System.out.println("저장에 실패하였습니다.");
				}
				break;
			case "8":
				try {
					m.load();
				}catch (Exception e) {
					System.out.println("불러오기에 실패하였습니다.");
				}
				break;
			case "9": // 서버에 phoneInfo 저장
				try {
				m.uploadServer();
				}catch(Exception e){
					System.out.println("저장에 실패하였습니다.");
				}
				break;
			case "10": // 서버에 저장된 데이터 콜
				try {
				m.getJson();
				}catch(Exception e){
					System.out.println("읽어오기에 실패하였습니다.");
				}
				break;
			case "11":
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			System.out.println();
		}
	}

}
