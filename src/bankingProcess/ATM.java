package bankingProcess;

import java.util.Scanner;

public class ATM extends BankingRules implements STANDARPROCESS {
	Scanner scanner = new Scanner(System.in);
	personAccount person1;

	public ATM(personAccount ATMp) {
		this.person1 = ATMp;
	}

	public void continueOrExit() {

		System.out
				.println("Please enter Continue if you want to performe other operations or Exit to go to home screen");

		String input2 = scanner.next();
		if (input2.trim().equalsIgnoreCase("continue")) {

			getUserHomePage();
			String input4 = scanner.next();
			if (input4.trim().equalsIgnoreCase("Withdraw")) {

				withdraw();

			} else if (input4.trim().equalsIgnoreCase("deposit")) {
				// atm.
				deposit();

			} else if (input4.trim().equalsIgnoreCase("checkbalance")) {
				// atm.
				getBalance();
			}

		} else if (input2.trim().equalsIgnoreCase("exit")) {
			exit();

		}

	}

	public int checkTrans() {

		return noOfTransactions;
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		checkTrans();
		if (noOfTransactions != 0) {
			System.out.println("No of Taransactions left " + --noOfTransactions);
			{

				System.out.println("Enter the account name from where you want to withdraw money checking or Saving");
				String input1 = scanner.next();

				if (input1.trim().equalsIgnoreCase("checking")) {
					System.out.println("Enter the amout of money You want to Withdraw");
					double withdraw = scanner.nextDouble();

					if (getWithdrawLimit() >= withdraw) {
						if (personAccount.checking > withdraw) {
							System.out.println("Please collect Your Money " + withdraw);
							personAccount.checking -= withdraw;
							personAccount.totalFunds -= withdraw;
							System.out.println(
									"Remaining balance in your checking account is  " + personAccount.checking);
							System.out
									.println("Total Remaining balance in your account is  " + personAccount.totalFunds);
							withdrawLimit -= withdraw;

							System.out.println(
									"Your remaning limit to withdraw money from your account is " + withdrawLimit);
							continueOrExit();

						}

					} else {
						System.out.println("You can only Withdraw  " + getWithdrawLimit() + " per day");
						continueOrExit();

					}

				}

				else if (input1.trim().equalsIgnoreCase("saving")) {

					System.out.println("Enter the amout of money You want to Withdraw");
					double withdraw = scanner.nextDouble();

					if (getWithdrawLimit() >= withdraw) {
						if (personAccount.saving > withdraw) {
							System.out.println("Please collect Your Money " + withdraw);
							personAccount.saving -= withdraw;
							personAccount.totalFunds -= withdraw;
							System.out
									.println("Remaining balance in your checking account is  " + personAccount.saving);
							System.out
									.println("Total Remaining balance in your account is  " + personAccount.totalFunds);
							withdrawLimit -= withdraw;

							System.out.println(
									"Your remaning limit to withdraw money from your account is " + withdrawLimit);
							continueOrExit();

						}

					} else {
						System.out.println("You can only Withdraw  " + getWithdrawLimit() + " per day");
						continueOrExit();

					}
				}
			}

		} else {
			System.out.println("Your tarnsaction limit for today is done ");
		}

	}

	@Override
	public void deposit() {
		checkTrans();
		if (noOfTransactions != 0) {
			System.out.println("No of Taransactions left " + --noOfTransactions);
			{

				System.out.println(
						"Enter the account name from where you want to deposit  money checking , Saving or TFSA");
				String input1 = scanner.next();

				if (input1.trim().equalsIgnoreCase("checking")) {
					System.out.println("Enter the amout of money You want to deposit");
					double deposit = scanner.nextDouble();

					if (deposit <= maxDepositAmout) {

						// System.out.println("Please collect Your Money "+ deposit);
						personAccount.checking += deposit;
						personAccount.totalFunds += deposit;
						System.out.println("Balance in your checking account is  " + personAccount.checking);
						System.out.println("Total  balance in your account is  " + personAccount.totalFunds);
						maxDepositAmout -= deposit;

						System.out.println("You can deposit " + maxDepositAmout + " more  in your account through ATM");
						continueOrExit();

					} else {
						System.out.println(
								"The Amount you enter is more than 100000 , Please go to your nearest Scotia Branch");
						continueOrExit();

					}

				}

				else if (input1.trim().equalsIgnoreCase("saving")) {

					System.out.println("Enter the amout of money You want to deposit");
					double deposit = scanner.nextDouble();

					if (deposit <= maxDepositAmout) {

						// System.out.println("Please collect Your Money "+ deposit);
						personAccount.saving += deposit;
						personAccount.totalFunds += deposit;
						System.out.println("Remaining balance in your saving account is  " + personAccount.saving);
						System.out.println("Total Remaining balance in your account is  " + personAccount.totalFunds);
						maxDepositAmout -= deposit;

						System.out.println("You can deposit " + maxDepositAmout + " more  in your account through ATM");
						continueOrExit();

					} else {
						System.out.println(
								"The Amount you enter is more than 100000 , Please go to your nearest Scotia Branch");
						continueOrExit();

					}
				} else if (input1.trim().equalsIgnoreCase("TFSA")) {

					System.out.println("Enter the amout of money You want to deposit");
					double deposit = scanner.nextDouble();

					if (deposit <= maxDepositAmout) {

						System.out.println("Please collect Your Money " + deposit);
						personAccount.TFSA += deposit;
						personAccount.totalFunds += deposit;
						System.out.println("Remaining balance in your TFSA account is  " + personAccount.TFSA);
						System.out.println("Total Remaining balance in your account is  " + personAccount.totalFunds);
						maxDepositAmout -= deposit;

						System.out.println("You can deposit " + maxDepositAmout + " more  in your account through ATM");
						continueOrExit();

					} else {
						System.out.println(
								"The Amount you enter is more than 100000 , Please go to your nearest Scotia Branch");
						continueOrExit();

					}

				}
			}

		} else {
			System.out.println("Your tarnsaction limit for today is done ");
		}
	}

	public void getBalance() {
		personAccount.totalFunds = personAccount.checking + personAccount.saving + personAccount.TFSA;
		System.out.println("Balance in your account is " + personAccount.totalFunds);
		continueOrExit();
//		//return personAccount.totalFunds;

	}

	@Override
	public void fundTransfer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Invsetment() {
		// TODO Auto-generated method stub

	}

	public void exit() {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Scotia Bank");

	}

	@Override
	void userIdentification() {
		// TODO Auto-generated method stub
		if ((person1.getPin() == 1993) && (person1.getCardNo() == 1111)) {

			getHomePage(person1);
		}

	}
}
