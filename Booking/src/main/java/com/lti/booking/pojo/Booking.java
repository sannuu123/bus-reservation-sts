package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking0")
public class Booking {
@Id
@Column(name="pnrno")
	private String PnrNo;
@Column(name="customerdetails")
private String CustDetails;
@Column(name="bid")
	private String bid;
@Column(name="custid")
	private String CustId;
@Column(name="userid")
	private String userid;
@Column(name="paystatus")
	private String Paystatus;
@Column(name="noofseats")
	private String noOfSeats;
@Column(name="seatno")
	private String seatno;


@Override
public String toString() {
	return "Booking [PnrNo=" + PnrNo + ", CustDetails=" + CustDetails + ", bid=" + bid + ", CustId=" + CustId
			+ ", userid=" + userid + ", Paystatus=" + Paystatus + ", noOfSeats=" + noOfSeats + ", seatno=" + seatno
			+ "]";
}
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
public Booking(String pnrNo, String custDetails, String bid, String custId, String userid, String paystatus,
		String noOfSeats, String seatno) {
	super();
	PnrNo = pnrNo;
	CustDetails = custDetails;
	this.bid = bid;
	CustId = custId;
	this.userid = userid;
	Paystatus = paystatus;
	this.noOfSeats = noOfSeats;
	this.seatno = seatno;
}
public String getPnrNo() {
	return PnrNo;
}
public void setPnrNo(String pnrNo) {
	PnrNo = pnrNo;
}
public String getCustDetails() {
	return CustDetails;
}
public void setCustDetails(String custDetails) {
	CustDetails = custDetails;
}
public String getBid() {
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
}
public String getCustId() {
	return CustId;
}
public void setCustId(String custId) {
	CustId = custId;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPaystatus() {
	return Paystatus;
}
public void setPaystatus(String paystatus) {
	Paystatus = paystatus;
}
public String getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(String noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getSeatno() {
	return seatno;
}
public void setSeatno(String seatno) {
	this.seatno = seatno;
}



	
	
}
