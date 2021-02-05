package kosta.board;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Board {
	private String boardName;
	private ArrayList<Post> posts = new ArrayList<Post>();
	private Scanner sc = new Scanner(System.in);

	public Board() {
		showBoard();
	};

	public void showBoard() {
		String answer;
		do {
			System.out.println("1.글쓰기  2. 전체 출력  3. 글 세부조회   4. 수정/삭제 5. 정렬 (종료 : q)");
			answer = sc.nextLine();

			switch (answer) {
			case "1":
				writePost();
				break;
			case "2":
				printAllPost();
				break;
			case "3":
				System.out.print("조회할 게시글의 번호를 입력해주세요 : ");
				Post temp = searchPostNo(Integer.parseInt(sc.nextLine()));
				if(temp != null) {
					temp.read();
					System.out.println("글번호  글제목\t작성자\t내용\t작성일자\t조회수");
					temp.postDetailPrint();		
					commentMenu(temp);
				}
				else
					System.out.println("잘못된 번호입니다.");
				break;
			case "4":
				System.out.println("수정하거나 삭제할 게시글의 번호를 입력해주세요.");
				Post temp1 = searchPostNo(Integer.parseInt(sc.nextLine()));
				if(temp1 != null) {
					System.out.print("수정을 원하시면 1번을 삭제를 원하시면 2번을 눌러주세요 : ");
					String s = sc.nextLine();
					if(s.equals("1")){
						System.out.println("수정할 내용을 입력해주세요.");
						s = sc.nextLine();
						modifyPost(temp1, s);
					}
					else if(s.equals("2")){
						posts.remove(temp1);
						System.out.println("삭제되었습니다.");
					}
					else
						System.out.println("잘못된 입력입니다.");
				}
				else
					System.out.println("존재하지 않는 게시글입니다.");
				break;
			case "5": sortPost();
				break;
			default:
				break;
			}

		} while (!(answer.equals("q")));

	}

	public void writePost() {
		System.out.print("글 제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String name = sc.nextLine();
		System.out.print("글 내용 : ");
		String contents = sc.nextLine();

		posts.add(new Post(posts.size() + 1, title, name, contents));
	}

	public Post searchTitle(String str) {
		for (Post p : posts) {
			if (str.equals(p.getTitle()))
				return p;
		}
		return null;
	}
	public void sortPost() {
		posts.sort(new Comparator<Post>() {

			@Override
			public int compare(Post p1,Post p2) {
				if(p1.getNo() > p2.getNo()) {
					return -1;
				}
				else if( p1.getNo() < p2.getNo())
					return 1;
				return 0;
			}
		});
		
	}
	public Post searchName(String str) {
		for (Post p : posts) {
			if (str.equals(p.getName()))
				return p;
		}
		return null;
	}

	public void printAllPost() {
		System.out.println("글번호  글제목\t작성자\t\t작성일자\t조회수");
		if (posts.size() == 0)
			System.out.println("작성된 글이 없습니다.");
		else
			for (Post p : posts)
				p.postPrint();
	}

	public void dellPost(int no) {
		Post temp = searchPostNo(no);
		if(temp != null) {
			posts.remove(temp);
			System.out.println("게시글이 삭제되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 게시물 번호입니다.");
		}
	}

	public void modifyPost(Post p, String str) {
		posts.remove(p);
		p.setContents(str);
		posts.add(p);
	}

	public Post searchPostNo(int no) {
		for (Post p : posts)
			if (p.getNo() == no)
				return p;

		return null;
	}
	public void commentMenu(Post p) {
		String temp ;
		while(true) {
			System.out.println("1. 댓글 목록 보기  2. 댓글 작성  (종료 : q)");
			 temp = sc.nextLine();
			if(temp.equals("1")) {
				p.showCom();
			}
			else if(temp.equals("2")) {
				p.newComment();
			}
			else if(temp.equals("q")) {
				break;
			}

		}
	}
}
