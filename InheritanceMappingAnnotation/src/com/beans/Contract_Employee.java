package com.beans;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="con_emp")
public class Contract_Employee extends Employee {
	
	@Column(name = "pay_per_hour")
	private float pay_per_hour;
	
	@Column(name = "contract_duration")
	private String contract_duration;
	
	public Contract_Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Contract_Employee(String contract_duration, float pay_per_hour) {
		this.contract_duration = contract_duration;
		this.pay_per_hour = pay_per_hour;
	}

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	@Override
	public String toString() {
		return "Contract_Employee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
	}
	
	

}
