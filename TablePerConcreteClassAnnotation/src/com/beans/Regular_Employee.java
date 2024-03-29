package com.beans;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="regularemployee102")  
@AttributeOverrides({  
	@AttributeOverride(name="id", column=@Column(name="id")),  
	@AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Regular_Employee extends Employee{  

	@Column(name="salary")    
	private float salary;  

	@Column(name="bonus")     
	private int bonus;  

	public Regular_Employee() {}

	public Regular_Employee(String name,float salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}



}
