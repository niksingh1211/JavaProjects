package com.beans;

import java.util.List;  
import javax.persistence.*;    

@Entity  
@Table(name="ques1123")  
class Question1 {    
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int id;    
	private String qname;   

	@ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })  
	@JoinTable(name = "q_ans1123",   
	joinColumns = { @JoinColumn(name = "q_id") },   
	inverseJoinColumns = { @JoinColumn(name = "ans_id") })  
	private List<Answer1> answers;  

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
	public List<Answer1> getAnswers() {  
		return answers;  
	}  
	public void setAnswers(List<Answer1> answers) {  
		this.answers = answers;  
	}      
}  

@Entity  
@Table(name="ans1123")  
class Answer1 {   

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int id;    
	private String answername;    
	private String postedBy; 
	private List<Question1> questions;
	public int getId() {  
		return id;  
	}  
	public void setId(int id) {  
		this.id = id;  
	}  
	public String getAnswername() {  
		return answername;  
	}  
	public void setAnswername(String answername) {  
		this.answername = answername;  
	}  
	public String getPostedBy() {  
		return postedBy;  
	}  
	public void setPostedBy(String postedBy) {  
		this.postedBy = postedBy;  
	}
	public List<Question1> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question1> questions) {
		this.questions = questions;
	}  

}    
