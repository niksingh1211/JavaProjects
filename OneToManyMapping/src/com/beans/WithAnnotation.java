package com.beans;

import javax.persistence.*;  
import java.util.List;    
  
@Entity  
@Table(name="q5991")  
class Question1 {    
  
@Id   
@GeneratedValue(strategy=GenerationType.TABLE)  
private int id;    
private String qname;    
  
@OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="qid")  
@OrderColumn(name="type")  
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
@Table(name="ans5991")  
class Answer1 {   
@Id  
@GeneratedValue(strategy=GenerationType.TABLE)  
  
private int id;    
private String answername;    
private String postedBy;  
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
}    