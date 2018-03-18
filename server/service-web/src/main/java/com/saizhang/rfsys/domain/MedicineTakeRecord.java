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
@Table(name="t_medicineTakeRecord")
public class MedicineTakeRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false, updatable=false)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="medicine")
	private Medicine medicine;
	
	@Column(name="takeAmount")
	private int  takeAmount;
	
	@Column(name="takeTime")
	private Timestamp takeTime;
	
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
	public int getTakeAmount() {
		return takeAmount;
	}
	public void setTakeAmount(int takeAmount) {
		this.takeAmount = takeAmount;
	}
	public Timestamp getTakeTime() {
		return takeTime;
	}
	public void setTakeTime(Timestamp takeTime) {
		this.takeTime = takeTime;
	}
}
