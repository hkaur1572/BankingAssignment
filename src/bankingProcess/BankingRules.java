package bankingProcess;

import java.util.Scanner;

public abstract class BankingRules {
	personAccount p1=new personAccount();
	static double withdrawLimit = 2000;
	static int noOfTransactions = 7;

	public int getNoOfTransactions() {
		return noOfTransactions;
	}

	static double maxDepositAmout = 10000;

	abstract void userIdentification();

	Scanner sc = new Scanner(System.in);

	public static double getWithdrawLimit() {
		return withdrawLimit;
	}

	void getUserHomePage() {
		System.out.println("Enter WITHDRAW if you want to withdraw your money" + "\n"
				+ "Enter DEPOSIT if you want to deposit your money" + "\n"
				+ "Enter CHECKBALANCE  if you want to check your balance your money" + "\n" + " Enter Exit for exit"
				+ "\n" + "Choose the operation you want to perform:");

	}

	void onlineUserHome() {
		System.out.println("Enter transfer if you want   transfer the money ");

		System.out.println("Enter investment if you  want to  invest your  money ");
		System.out.println("Enter Exit for exit");
		System.out.println("Choose the operation you want to perform:");

	}

	void getHomePage(personAccount A) 
	{
		System.out.println(" Account number of person " +A.AccountNumber + "Name of Person " + A.CustomerName);
	}

}
