package com.beans;

import java.util.List;

public class Answer {    
private int id;    
private String answername;    
private String postedBy;    
private List<Question> questions;  
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
public List<Question> getQuestions() {  
    return questions;  
}  
public void setQuestions(List<Question> questions) {  
    this.questions = questions;  
}    
}  
