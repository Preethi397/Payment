package com.dbs.web.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfertypes {
	@Id
	private String transfertypecode;
	private String transfertype_description;
	
	public Transfertypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transfertypes(String transfertypecode, String transfertype_description) {
		super();
		this.transfertypecode = transfertypecode;
		this.transfertype_description = transfertype_description;
	}
	public String getTransfertypecode() {
		return transfertypecode;
	}
	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}
	public String getTransfertype_description() {
		return transfertype_description;
	}
	public void setTransfertype_description(String transfertype_description) {
		this.transfertype_description = transfertype_description;
	}
	@Override
	public String toString() {
		return "Transfertypes [transfertypecode=" + transfertypecode + ", transfertype_description="
				+ transfertype_description + "]";
	}
	

}
