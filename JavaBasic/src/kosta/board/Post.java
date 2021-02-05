package kosta.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import kosta.phone.DataInput;

public class Post {
	private Scanner sc = new Scanner(System.in);
	private int seq;
	private String title;
	private String writer;
	private String contents;
	private String date;
	private int hitCount;
	SimpleDateFormat fourteen_format = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	private ArrayList<Comment> coms = new ArrayList<Comment>();

	public Post() {
	}

	public Post(int seq, String title, String writer, String contents) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.date = fourteen_format.format(System.currentTimeMillis());
	}

	public void postPrint() {
		System.out.println(seq + "  \t" + title + "\t\t" + writer + "\t\t" + date + "\t" + hitCount);
	}

	public void postDetailPrint() {
		System.out.println(seq + "  \t" + title + "\t\t" + writer + "\t\t" + contents + "\t" + date + "\t" + hitCount);
	}

	public void setContents(String str) {
		this.contents = str;
	}

	public String getTitle() {
		return this.title;
	}

	public int getNo() {
		return this.seq;
	}

	public String getName() {
		return this.writer;
	}

	public void read() {
		this.hitCount++;
	}

	public void newComment() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("댓글 : ");
		String con = sc.nextLine();
		Comment co = new Comment(name, con);
		coms.add(co);
	}

	public void showCom() {
		if (coms.size() == 0)
			System.out.println("댓글이 없습니다.");
		else {
			for (Comment c : coms)
				System.out.println(c.getID() + "  : " + c.getContents());
		}
	}

}
