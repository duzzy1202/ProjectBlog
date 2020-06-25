package com.blog.DTO;
import java.util.Map;

public class Article extends Dto {
	private int boardId;
	private int memberId;
	private String title;
	private String body;

	public Article() {

	}

	public Article(int boardId, int memberId, String title, String body) {
		this.boardId = boardId;
		this.memberId = memberId;
		this.title = title;
		this.body = body;
	}

	public Article(Map<String, Object> row) {
		super((int) row.get("id"), (String) row.get("regDate"));
		this.title = (String) row.get("title");
		this.body = (String) row.get("body");
		this.memberId = (int) row.get("memberId");
		this.boardId = (int) row.get("boardId");
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "글 번호 = " + getId() + "\n제목 = " + title + "\n내용 = " + body + "\n작성일자 = " + getRegDate();
	}

}