package com.demo.exceptions;

public class BankingService {

	double balance = 2000.00;
	void fundTransfer(double amount) throws InsufficientBalanceException {
		if(amount > balance)
			throw new InsufficientBalanceException(amount);
		else
			System.out.println("Success!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankingService obj = new BankingService();
		try {
			obj.fundTransfer(Double.parseDouble(args[0]));
		} catch (InsufficientBalanceException ibe) {
			// TODO Auto-generated catch block
			System.out.println(ibe);
			//ibe.printStackTrace();
		}
	}

}
