package com.tala.enterprise.talabank.model.db;
// Generated Oct 19, 2016 12:32:51 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Transaction generated by hbm2java
 */
public class Transaction  implements java.io.Serializable {


     private Integer transactionId;
     private Account account;
     private TransactionType transactionType;
     private int amount;
     private Date transactionDate;
     private Date transactionTime;

    public Transaction() {
    }

    public Transaction(Account account, TransactionType transactionType, int amount, Date transactionDate, Date transactionTime) {
       this.account = account;
       this.transactionType = transactionType;
       this.amount = amount;
       this.transactionDate = transactionDate;
       this.transactionTime = transactionTime;
    }
   
    public Integer getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    public TransactionType getTransactionType() {
        return this.transactionType;
    }
    
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public int getAmount() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return this.transactionDate;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public Date getTransactionTime() {
        return this.transactionTime;
    }
    
    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }




}


