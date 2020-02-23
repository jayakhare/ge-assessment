package com.ge.exercise3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private static final Logger logger = LogManager.getLogger(Bank.class);
    private Map<String, Account> accountMap;

    public Bank() {
        accountMap = new HashMap<>();
    }

    public Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void depositToAccount(String accountNumber, float amount) {
        getAccount(accountNumber).deposit(amount);
    }

    public void withdrawFromAccount(String accountNumber, float amount) {
        getAccount(accountNumber).withdraw(amount);
    }

    public int numAccounts() {
        return accountMap.size();
    }
    
    public String getProfitLossOfBankOnNextMonth() {
    	float differenceForAllAccounts = 0f;
    	for (Account account : accountMap.values()) {
            float differenceInNextMonth = account.valueNextMonth() - account.getBalance();
            differenceForAllAccounts += differenceInNextMonth;
        }
    	if(differenceForAllAccounts > 0) {
    		return "PROFIT";
    	} else if (differenceForAllAccounts < 0) {
    		return "LOSS";
    	} else {
    		return "NONE";
    	}
    }
}
