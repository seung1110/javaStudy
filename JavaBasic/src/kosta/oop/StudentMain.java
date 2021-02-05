package kosta.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> st = new ArrayList<Student>();
		
		while(true) {
			System.out.println("1. 학생 추가  2. 문과학생 성적 출력  3. 이과학생 성적 출력   4. 전체학생 성적 출력  5. 종료");
			String ans = sc.nextLine();
			if(ans.equals("1")) {
				System.out.print("학과(문과 : 1 이과 : 2) : ");
				String cat = sc.nextLine();
				System.out.print("번호 : ");
				int no = sc.nextInt();
				sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("국어 성적 : ");
				int kor = sc.nextInt();
				System.out.print("영어 성적 : ");
				int eng = sc.nextInt();
				System.out.print("수학 성적 : ");
				int math = sc.nextInt();
				if(cat.equals("1")) {
					System.out.print("사회 성적 : ");
					int social = sc.nextInt();
					sc.nextLine();
					st.add(new LiberalArtStudent(no,name,kor,eng,math,social));
				}
				else {
					System.out.print("과학 성적 : ");
					int science = sc.nextInt();
					sc.nextLine();
					st.add(new NaturalSciencesStudent(no,name,kor,eng,math,science));					
				}
			}
			else if(ans.equals("2")) {
				System.out.println("번호\t이름\t국어\t영어\t수학\t사회\t \t총점\t평균");
				for(Student s : st) {
					if(s instanceof LiberalArtStudent)
						s.print();
				}
			}
				else if(ans.equals("3")) {
					System.out.println("번호\t이름\t국어\t영어\t수학\t \t과학\t총점\t평균");
					for(Student s : st) {
						if(s instanceof NaturalSciencesStudent)
							s.print();
					}
				}
					else if(ans.equals("4")) {
						System.out.println("번호\t이름\t국어\t영어\t수학\t사회\t과학\t총점\t평균");
						for(Student s : st) {
							s.print();
						}
					}
						else if(ans.equals("5"))
							break;
			
			
		}
		
		
		
//		System.out.print("학생의 수를 입력해주세요 : ");
//		Student students[] = new Student[sc.nextInt()];
//		sc.nextLine();
//		for(int i = 0; i < students.length; i++){
//			System.out.println("학생의 번호와 이름, 국어, 영어, 수학 성적을 순서대로 입력해주세요(공백으로 구분)");
//			String[] temp = sc.nextLine().split(" ");
//			students[i] = new Student(Integer.parseInt(temp[0]),temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),Integer.parseInt(temp[4]));
//		}
//		
//		System.out.println();
//		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
//		for(int i = 0; i< students.length; i++)
//			students[i].print();
	}

}
