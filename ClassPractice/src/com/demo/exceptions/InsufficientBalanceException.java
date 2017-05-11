package com.demo.exceptions;

public class InsufficientBalanceException extends Exception{

	double amount;
	public InsufficientBalanceException(double amount) {
		this.amount = amount;
	}
	public String toString(){
		return "The balance is not enough!" + amount;
	}
	
}
