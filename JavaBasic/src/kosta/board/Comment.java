package kosta.board;

public class Comment {
	private String ID;
	private String Contents;
	
	public Comment() {}

	public Comment(String iD, String contents) {
		super();
		ID = iD;
		Contents = contents;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getContents() {
		return Contents;
	}

	public void setContents(String contents) {
		Contents = contents;
	}
	

}
