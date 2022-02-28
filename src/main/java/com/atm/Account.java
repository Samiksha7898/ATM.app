package com.atm;

public class Account {

	// Here we declare some variables that a typical bank account will have

		String type;
		double balance;
		double rate;

		// The following methods are a combination of getter/setter methods as well
		// as two special deposit() and withdraw() methods

		void setType(String accType) {
			
			type = accType;
		}

		void setBalance(double accBal) {
			
			balance = accBal;
		}

		void setRate(double accRate) {
			
			rate = accRate;
		}

		void deposit(double dep) {
			
			balance += dep; // Take the Account object's balance and add to it the current deposit
		}

		void withdraw(double wit) {
			
			balance -= wit; // Take the Account object's balance and subtract from it the current withdrawal
		}


		String getType() {
			
			return type;
		}

		double getBalance() {
			
			return balance;
		}

		double getRate() {
			
			return rate;
		}

	}
