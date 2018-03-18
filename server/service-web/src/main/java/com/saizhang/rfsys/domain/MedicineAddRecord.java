package com.saizhang.rfsys.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_medicineAddRecord")
public class MedicineAddRecord {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, updatable=false)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="medicine")
	private Medicine medicine;
	
	@Column(name="addAmount")
	private int  addAmount;
	
	@Column(name="addTime")
	private Timestamp addTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public int getAddAmount() {
		return addAmount;
	}
	public void setAddAmount(int addAmount) {
		this.addAmount = addAmount;
	}
	public Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}
	
	
}
