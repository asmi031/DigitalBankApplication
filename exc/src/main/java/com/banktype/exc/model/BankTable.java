package com.banktype.exc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  
public class BankTable {
	@Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	@Column
	public Integer custId;
	@Column
	public String orderNo;
	@Column
	public String shareName;
	@Column public String shareId;
	@Column public String quantity;
	@Column public String buyOrSell;
	@Column public int pricePerShare;
	@Column public int acct;
	@Column public int frontDeskOffId;
	@Column public String branchCode;
	@Column public int tradingCharge;
	@Column public String exchange;
	@Column public Date tradeDateTime;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public BankTable() {}
	public BankTable(Integer custId, String orderNo, String shareName, String shareId, String quantity,
					 String buyOrSell, int pricePerShare, int acct, int frontDeskOffId, String branchCode, int tradingCharge,
					 String exchange, Date tradeDateTime) {
		super();
		this.custId = custId;
		this.orderNo = orderNo;
		this.shareName = shareName;
		this.shareId = shareId;
		this.quantity = quantity;
		this.buyOrSell = buyOrSell;
		this.pricePerShare = pricePerShare;
		this.acct = acct;
		this.frontDeskOffId = frontDeskOffId;
		this.branchCode = branchCode;
		this.tradingCharge = tradingCharge;
		this.exchange = exchange;
		this.tradeDateTime = tradeDateTime;
	}
	@Override
	public String toString() {
		return "TradeModel [custId=" + custId + ", orderNo=" + orderNo + ", shareName=" + shareName + ", shareId="
				+ shareId + ", quantity=" + quantity + ", buyOrSell=" + buyOrSell + ", pricePerShare=" + pricePerShare
				+ ", acct=" + acct + ", frontDeskOffId=" + frontDeskOffId + ", branchCode=" + branchCode
				+ ", tradingCharge=" + tradingCharge + ", exchange=" + exchange + ", tradeDateTime=" + tradeDateTime
				+ "]";
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public String getShareId() {
		return shareId;
	}
	public void setShareId(String shareId) {
		this.shareId = shareId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getBuyOrSell() {
		return buyOrSell;
	}
	public void setBuyOrSell(String buyOrSell) {
		this.buyOrSell = buyOrSell;
	}
	public int getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(int pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getAcct() {
		return acct;
	}
	public void setAcct(int acct) {
		this.acct = acct;
	}
	public int getFrontDeskOffId() {
		return frontDeskOffId;
	}
	public void setFrontDeskOffId(int frontDeskOffId) {
		this.frontDeskOffId = frontDeskOffId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public int getTradingCharge() {
		return tradingCharge;
	}
	public void setTradingCharge(int tradingCharge) {
		this.tradingCharge = tradingCharge;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public Date getTradeDateTime() {
		return tradeDateTime;
	}
	public void setTradeDateTime(Date tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}
	
	
	

}
