package kosta.video;

public class Video {
	private String no, title, actor;
	private int state;
	static int a = 0;
	
	public Video() {}

	public String getNo() {
		return no;
	}
	public static int che() {
		return 1;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Video(String no, String title, String actor) {
		super();
		this.no = no;
		this.title = title;
		this.actor = actor;
	}
	
}
