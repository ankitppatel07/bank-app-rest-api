package io.bankapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Embeddable
//class LoggerPk {
//	@Column(name="acctID")
//	public int acctID;
//	
//	@ManyToOne
//	@JoinColumn(name="Account_ID")
//	private Accounts acct;
//}

@Entity
public class Logger {
//	@EmbeddedId
//	private LoggerPk id; 
	@Id
	private int acctID;
	private String transacType;
	private String transacStatus;
	private int initBal;
	private int finalBal;

	public Logger() {

	}

	public Logger(int acctID, String transacType, String transacStatus, int initBal, int finalBal) {
		super();
		this.acctID = acctID;
		this.transacType = transacType;
		this.transacStatus = transacStatus;
		this.initBal = initBal;
		this.finalBal = finalBal;
	}

	public int getAcctID() {
		return acctID;
	}

	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}

	public String getTransacType() {
		return transacType;
	}

	public void setTransacType(String transacType) {
		this.transacType = transacType;
	}

	public String getTransacStatus() {
		return transacStatus;
	}

	public void setTransacStatus(String transacStatus) {
		this.transacStatus = transacStatus;
	}

	public int getInitBal() {
		return initBal;
	}

	public void setInitBal(int initBal) {
		this.initBal = initBal;
	}

	public int getFinalBal() {
		return finalBal;
	}

	public void setFinalBal(int finalBal) {
		this.finalBal = finalBal;
	}

}
