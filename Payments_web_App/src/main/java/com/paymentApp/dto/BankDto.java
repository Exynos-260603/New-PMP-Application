package com.paymentApp.dto;

public class BankDto {
	private long accountNumber;
	private String ifscCode;
	private String accountStatus;
	private String bankName;
	private double accountBalance;
	private String bankBranchLocation;
	private String accountType;
	private int bankId;
	private int loggedUserId;

	public BankDto(long accountNumber, String ifscCode, String accountStatus, String bankName, double accountBalance,
			String bankBranchLocation) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.accountStatus = accountStatus;
		this.bankName = bankName;
		this.accountBalance = accountBalance;
		this.bankBranchLocation = bankBranchLocation;
	}
	public BankDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getBankBranchLocation() {
		return bankBranchLocation;
	}
	public void setBankBranchLocation(String bankBranchLocation) {
		this.bankBranchLocation = bankBranchLocation;
	
}
	

	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public int getLoggedUserId() {
		return loggedUserId;
	}
	public void setLoggedUserId(int loggedUserId) {
		this.loggedUserId = loggedUserId;
	}

}