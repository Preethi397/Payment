package com.dbs.web.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Logger {
	@Id
	private int Loggerid;
	//@OneToOne
	private String customerid;
	//@OneToOne
	private int employeeid;
	private String screename; 
    private String action;
    private String ipaddress;
    
	public Logger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Logger(int loggerid, String customerid, int employeeid, String screename, String action,
			String ipaddress) {
		super();
		Loggerid = loggerid;
		this.customerid = customerid;
		this.employeeid = employeeid;
		this.screename = screename;
		this.action = action;
		this.ipaddress = ipaddress;
	}
	public int getLoggerid() {
		return Loggerid;
	}
	public void setLoggerid(int loggerid) {
		Loggerid = loggerid;
	}
	
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getScreename() {
		return screename;
	}
	public void setScreename(String screename) {
		this.screename = screename;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	@Override
	public String toString() {
		return "Logger [Loggerid=" + Loggerid + ", customerid=" + customerid + ", employeeid=" + employeeid
				+ ", screename=" + screename + ", action=" + action + ", ipaddress=" + ipaddress + "]";
	}
    
}
