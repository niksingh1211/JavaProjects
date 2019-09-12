package com.beans;

import java.util.Set;

public class Question {
	private int id;  
	private String qname;  
	private Set<String> answers;  
	
	public Question() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", qname=" + qname + ", answers=" + answers + "]";
	}
}
