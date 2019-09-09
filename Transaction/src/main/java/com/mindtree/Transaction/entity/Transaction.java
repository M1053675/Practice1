package com.mindtree.Transaction.entity;

public class Transaction {
	private int id;
	private String Sname;
	private String Rname;
	private String account;
	public Transaction(int id, String Sname, String Rname, String account) {
		super();
		this.id = id;
		this.Sname = Sname;
		this.Rname = Rname;
		this.account = account;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", Sname=" + Sname + ", Rname=" + Rname + ", account=" + account + "]";
	}
	
	
}