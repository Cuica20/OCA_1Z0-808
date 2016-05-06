package com.axcessfin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "TEMP_TEST")
@XmlRootElement(name = "application")
public class Application{

	
	@Id
	@Column(name = "APP_NO")
	private int loanCode;
	
	@Column(name = "BO_CODE")
	private int boCode;
	
	
	@Column(name = "APP_LOAN_AMT")
	private double loanAmt;
	
	
	@Column(name = "PROCESSING_STATUS")
	private String processingStatus;

	@XmlElement
	public int getLoanCode() {
		return loanCode;
	}

	
	public void setLoanCode(int loanCode) {
		this.loanCode = loanCode;
	}

	@XmlElement
	public int getBoCode() {
		return boCode;
	}

	
	public void setBoCode(int boCode) {
		this.boCode = boCode;
	}

	@XmlElement
	public double getLoanAmt() {
		return loanAmt;
	}

	
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	@XmlElement
	public String getProcessingStatus() {
		return processingStatus;
	}

	
	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}
	
	

}
