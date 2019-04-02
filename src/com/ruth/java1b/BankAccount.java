package com.ruth.java1b;

import java.util.HashMap;


public class BankAccount {
	
	
private String name;
private double balance;
private String id;


public BankAccount(String name, double balance, String id) {
	super();
	this.setName(name);
	this.setBalance(balance);
	this.setId(id);
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


@Override
public String toString() {
	return "Account [name=" + name + ", balance=" + balance + ", id=" + id + "]";
}


public String deposit(String id, HashMap<String, BankAccount> acctHashMap){
try {	
	BankAccount account = acctHashMap.get(id);
	account.setBalance(account.getBalance() + 10);
	return "New balance is: " + account.getBalance();
}catch(Exception e) {
	return "Account not found";
}
}

}


