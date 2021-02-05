package kosta.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

public class Manager {

	ArrayList<PhoneInfo> infos = new ArrayList<PhoneInfo>();

	public void addPhoneInfo() throws Exception {

		System.out.println("추가할 전화번호 정보를 입력해주세요.");
		String[] ans = new String[3];
		System.out.print("이름 : ");
		ans[0] = DataInput.sc.nextLine();
		System.out.print("전화번호 : ");
		ans[1] = DataInput.sc.nextLine();
		if (ans[1] == null || ans[1].length() == 0) {
			throw new Exception("입력된 전화번호가 없습니다.\n");
		}

		System.out.print("생년월일 : ");
		ans[2] = DataInput.sc.nextLine();

		boolean ch;
		ch = infos.add(new PhoneInfo(ans[0], ans[1], ans[2]));
//		ch = infos.add(p);
		if (ch)
			System.out.println("정상적으로 추가되었습니다.");
		else
			System.out.println("추가에 실패하였습니다.");
	}

	public void addPhoneInfoUniverse() throws Exception {
		// 1. 일반, 2. 동창 3. 직장
		// 매개변수 없이 진행 메서드에서 직접 입력을 받음
		System.out.println("추가할 전화번호 정보를 입력해주세요.");
		String[] ans = new String[5];
		System.out.print("이름 : ");
		ans[0] = DataInput.sc.nextLine();
		System.out.print("전화번호 : ");
		ans[1] = DataInput.sc.nextLine();
		if (ans[1] == null || ans[1].length() == 0) {
			throw new Exception("입력된 전화번호가 없습니다.\n");
		}

		System.out.print("생년월일 : ");
		ans[2] = DataInput.sc.nextLine();
		System.out.print("전공 : ");
		ans[3] = DataInput.sc.nextLine();
		System.out.print("학번 : ");
		ans[4] = DataInput.sc.nextLine();
		boolean ch;
		ch = infos.add(new Universe(ans[0], ans[1], ans[2], ans[3], ans[4]));
//		ch = infos.add(p);
		if (ch)
			System.out.println("정상적으로 추가되었습니다.");
		else
			System.out.println("추가에 실패하였습니다.");
	}

	public void addPhoneInfoCompany() throws Exception {
		// 1. 일반, 2. 동창 3. 직장
		// 매개변수 없이 진행 메서드에서 직접 입력을 받음
		System.out.println("추가할 전화번호 정보를 입력해주세요.");
		String[] ans = new String[5];
		System.out.print("이름 : ");
		ans[0] = DataInput.sc.nextLine();
		System.out.print("전화번호 : ");
		ans[1] = DataInput.sc.nextLine();
		if (ans[1] == null || ans[1].length() == 0) {
			throw new Exception("입력된 전화번호가 없습니다.\n");
		}

		System.out.print("생년월일 : ");
		ans[2] = DataInput.sc.nextLine();
		System.out.print("부서 : ");
		ans[3] = DataInput.sc.nextLine();
		System.out.print("직급 : ");
		ans[4] = DataInput.sc.nextLine();
		boolean ch;
		ch = infos.add(new Company(ans[0], ans[1], ans[2], ans[3], ans[4]));
//		ch = infos.add(p);
		if (ch)
			System.out.println("정상적으로 추가되었습니다.");
		else
			System.out.println("추가에 실패하였습니다.");
	}
//    public void addPhoneInfo() {
//    	System.out.print("이름 : ");
//    	String name = sc.nextLine();
//    	System.out.print("전호번호 : ");
//    	String num = sc.nextLine();
//    	System.out.print("생년월일 : ");
//    	String birth = sc.nextLine();    	
//    	PhoneInfo info = new PhoneInfo(name,num,birth);
//     infos[i++] = info;
//    }
//    

	public void listPhoneInfo() {
		// 1. 전체 2 동창 3. 직장
		System.out.println("1. 전체  2. 동창  3. 직장");
		String ans = DataInput.sc.nextLine();
		if (infos.size() < 1)
			System.out.println("");
		if (ans.equals("1")) {
			System.out.println("이름\t\t\t번호\t\t생년월일");
			for (PhoneInfo p : infos) {
				p.printInfo();
			}
		} else if (ans.equals("2")) {
			System.out.println("이름\t\t\t번호\t\t생년월일\t전공\t학번");
			for (PhoneInfo p : infos) {
				if (p instanceof Universe)
					p.printInfo();
			}
		} else if (ans.equals("3")) {
			System.out.println("이름\t\t\t번호\t\t생년월일\t부서\t직급");
			for (PhoneInfo p : infos) {
				if (p instanceof Company)
					p.printInfo();
			}
		}
	}

	public void searchPhoneInfo(String str) {
		int ch = 0;
		for (PhoneInfo p : infos) {
			if (p.getName().equals(str)) {
				System.out.println("이름\t번호\t\t생년월일");
				p.printInfo();
				ch += 1;
				break;
			}
		}
		if (ch == 0)
			System.out.println("일치하는 이름이 존재하지 않습니다.");
	}

	public void delPhoneInfo(String name) {
		int ch = 0;
		for (PhoneInfo p : infos) {
			if (p.getName().equals(name)) {
				System.out.println("삭제되었습니다.");
				infos.remove(p);
				ch += 1;
				break;
			}
		}
		if (ch == 0)
			System.out.println("일치하는 전화번호가 없습니다.");

	}

	public void modifyPhoneInfo(String name, String num) {
		int ch = 0;
		for (PhoneInfo p : infos) {
			if (p.getName().equals(name)) {
				p.setPhoneNum(num);
				ch += 1;
				break;
			}
		}
		if (ch == 0)
			System.out.println("일치하는 전화번호가 없습니다.");

	}

	public void sortName() {
		infos.sort(new Comparator<PhoneInfo>() {

			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}
	public void sortDName() {
		infos.sort(new Comparator<PhoneInfo>() {
			
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				return -(o1.getName().compareTo(o2.getName()));
			}
		});
	}
	public void sortNumber() {		
		infos.sort(new Comparator<PhoneInfo>() {

			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				return o1.getPhoneNum().compareTo(o2.getPhoneNum());
			}
		});
	}
	public void sortDNumber() {		
		infos.sort(new Comparator<PhoneInfo>() {
			
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				return -(o1.getPhoneNum().compareTo(o2.getPhoneNum()));
			}
		});
	}
	
	public void save() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneInfo.ser"));
			oos.writeObject(infos);
			System.out.println("저장되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void load() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("phoneInfo.ser"));
			this.infos = (ArrayList<PhoneInfo>) ois.readObject();
			System.out.println("전화번호부를 불러왔습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
