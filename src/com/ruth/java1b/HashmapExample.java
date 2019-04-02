package com.ruth.java1b;

import java.util.HashMap;
import java.util.Map;



public class HashmapExample {

	public static void main(String[] args) {
		
		// objects of bank account

		
		BankAccount acct1= new BankAccount("Ruth",  5000, "103");
		BankAccount acct2= new BankAccount("Alex",  25000, "101");
		BankAccount acct3= new BankAccount("Debra",  20000, "104");
		
		HashMap<String, BankAccount> acctHashMap = new HashMap<>();
		
		acctHashMap.put("103", acct1);
		acctHashMap.put("101", acct2);
		acctHashMap.put("104", acct3);
		
		//mapping through the hashmap and printing all account information
		
		for(Map.Entry<String, BankAccount> entry: acctHashMap.entrySet()) {
			System.out.println(entry.getKey()+ " this account belongs to  " + entry.getValue());
		}
		
		// credit account of "103" by 10 & check for a non existing account
		
		System.out.println(acct1.deposit("103", acctHashMap));
		System.out.println(acct1.deposit("107", acctHashMap));
		
		
	}

}
