package com.dbs.web.beans;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionid;
	//@OneToOne
	private String customerid;
	//@OneToOne
	private String currencycode;
	private String senderbic;
	private String receiverbic;
	private String receiveraccountholdernumber;
	private String receiveraccountholdername;
	//@OneToOne
	private String transfertypecode;
	//@OneToOne
	private String messagecode;
	private double currencyamount;
	private double transferfees;
	private double inramount;
	private LocalDate transferdate;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transactionid, String customerid,String currencycode, String senderbic,
			String receiverbic, String receiveraccountholdernumber, String receiveraccountholdername,
			String transfertypecode,String messagecode, double currencyamount, double transferfees,
			double inramount, LocalDate transferdate) {
		super();
		this.transactionid = transactionid;
		this.customerid = customerid;
		this.currencycode = currencycode;
		this.senderbic = senderbic;
		this.receiverbic = receiverbic;
		this.receiveraccountholdernumber = receiveraccountholdernumber;
		this.receiveraccountholdername = receiveraccountholdername;
		this.transfertypecode = transfertypecode;
		this.messagecode = messagecode;
		this.currencyamount = currencyamount;
		this.transferfees = transferfees;
		this.inramount = inramount;
		this.transferdate = transferdate;
	}

	
	
	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCurrencycode() {
		return currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getSenderBic() {
		return senderbic;
	}

	public void setSenderbic(String senderbic) {
		this.senderbic = senderbic;
	}

	public String getReceiverbic() {
		return receiverbic;
	}

	public void setReceiverbic(String receiverbic) {
		this.receiverbic = receiverbic;
	}

	public String getReceiveraccountholdernumber() {
		return receiveraccountholdernumber;
	}

	public void setReceiveraccountholdernumber(String receiveraccountholdernumber) {
		this.receiveraccountholdernumber = receiveraccountholdernumber;
	}

	public String getReceiveraccountholdername() {
		return receiveraccountholdername;
	}

	public void setReceiveraccountholdername(String receiveraccountholdername) {
		this.receiveraccountholdername = receiveraccountholdername;
	}

	public String getTransfertypecode() {
		return transfertypecode;
	}

	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}

	public String getMessagecode() {
		return messagecode;
	}

	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}

	public double getCurrencyamount() {
		return currencyamount;
	}

	public void setCurrencyamount(double currencyamount) {
		this.currencyamount = currencyamount;
	}

	public double getTransferfees() {
		return transferfees;
	}

	public void setTransferfees(double transferfees) {
		this.transferfees = transferfees;
	}

	public double getInramount() {
		return inramount;
	}

	public void setInramount(double inramount) {
		this.inramount = inramount;
	}

	public LocalDate getTransferdate() {
		return transferdate;
	}

	public void setTransferdate(LocalDate transferdate) {
		this.transferdate = transferdate;
	}

	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", customerid=" + customerid + ", currencycode="
				+ currencycode + ", senderBic=" + senderbic + ", receiverBic=" + receiverbic
				+ ", receiveraccountholdernumber=" + receiveraccountholdernumber + ", receiveraccountholdername="
				+ receiveraccountholdername + ", transfertypecode=" + transfertypecode + ", messagecode=" + messagecode
				+ ", currencyamount=" + currencyamount + ", transferfees=" + transferfees + ", inramount=" + inramount
				+ ", transferdate=" + transferdate + "]";
	}
	
}