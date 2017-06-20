package com.rev.pubhub.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="order_item")
public class Order {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="order_id")
	private Integer order_id;
	@Column(name="user_id")
	private Integer user_id;
	@Column(name="total_price")
	private Integer amount;
	@Column(name="ordered_date")
	private LocalDate ordered_date;
	@Column(name="modified_date")
	private LocalDate mofified_date;
	@Column(name="cancelled_date")
	private LocalDate cancelled_date;
	@Column(name="delivered_date")
	private LocalDate delivered_date ;
	@Column(name="STATUS")
	private String status ;
	@Column(name="reason")
	private String cancell_reason ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public LocalDate getOrdered_date() {
		return ordered_date;
	}
	public void setOrdered_date(LocalDate ordered_date) {
		this.ordered_date = ordered_date;
	}
	public LocalDate getMofified_date() {
		return mofified_date;
	}
	public void setMofified_date(LocalDate mofified_date) {
		this.mofified_date = mofified_date;
	}
	public LocalDate getCancelled_date() {
		return cancelled_date;
	}
	public void setCancelled_date(LocalDate cancelled_date) {
		this.cancelled_date = cancelled_date;
	}
	public LocalDate getDelivered_date() {
		return delivered_date;
	}
	public void setDelivered_date(LocalDate delivered_date) {
		this.delivered_date = delivered_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCancell_reason() {
		return cancell_reason;
	}
	public void setCancell_reason(String cancell_reason) {
		this.cancell_reason = cancell_reason;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", order_id=" + order_id + ", user_id=" + user_id + ", amount=" + amount
				+ ", ordered_date=" + ordered_date + ", mofified_date=" + mofified_date + ", cancelled_date="
				+ cancelled_date + ", delivered_date=" + delivered_date + ", status=" + status + ", cancell_reason="
				+ cancell_reason + "]";
	}
	
	
	
	
	
	
	

}
