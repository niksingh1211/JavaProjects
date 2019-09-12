package com.beans;

public class Answer {
	private int id;  
	private String answerStatement;  
	private String postedBy; 
	public Answer() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerStatement() {
		return answerStatement;
	}
	public void setAnswerStatement(String answerStatement) {
		this.answerStatement = answerStatement;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answerStatement=" + answerStatement + ", postedBy=" + postedBy + "]";
	}
	
	
}
