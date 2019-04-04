package com.ruth.java1b;

import java.util.HashMap;
import java.util.Map;


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


////store this object back into the hashmap//// hashmap should be updated and updated with a new balance 
public String deposit(String id, HashMap<String, BankAccount> acctHashMap){
try {	
	
	BankAccount account = acctHashMap.get(id);
	
	///if there's a of an exception, anticipating the exception
	
	///need to check if its null ///before doing a catch
	account.setBalance(account.getBalance() + 10);
	return "New balance is: " + account.getBalance();
}catch(Exception e) {
	return "Account not found";
}


}

public void displayAccount(HashMap<String, BankAccount> acctHashMap) {
	
	for(Map.Entry<String, BankAccount> entry: acctHashMap.entrySet()) {
		System.out.println(entry.getKey()+ " this account belongs to  " + entry.getValue());
	}
	
	
}


}


