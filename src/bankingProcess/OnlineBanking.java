package bankingProcess;

import java.util.Scanner;

public class OnlineBanking extends BankingRules implements STANDARPROCESS {
	Scanner sc1 = new Scanner(System.in);
	personAccount p;

	public OnlineBanking(personAccount P) {
		this.p = P;
	}

	public void continueOrExit1() {

		System.out
				.println("Please enter Continue if you want to performe other operations or Exit to go to home screen");

		String input2 = sc1.next();
		if (input2.trim().equalsIgnoreCase("continue")) {

			onlineUserHome();
			String input4 = sc1.next();
			if (input4.trim().equalsIgnoreCase("transfer")) {

				fundTransfer();

			} else if (input4.trim().equalsIgnoreCase("investment")) {

				Invsetment();

			} else if (input4.trim().equalsIgnoreCase("Profile")) {
				userProfilePage();
			}

		} else if (input2.trim().equalsIgnoreCase("exit")) {
			exit();

		}

	}

//personAccount person1= new personAccount();
	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fundTransfer() {
		// TODO Auto-generated method stub

		System.out.println("Please enter the account name in which you want to transfer the money");

		String input5 = sc1.next();
		if (input5.equalsIgnoreCase("checking")) {
			System.out.println("Please enter the account name from which you want to transfer the money");
			String input6 = sc1.next();
			if (input6.equalsIgnoreCase("saving")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.saving > transfer1) {
					personAccount.checking += transfer1;
					personAccount.saving -= transfer1;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your saving account is " + personAccount.saving);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.saving < transfer1) {
					System.out.println("your saving account has only " + personAccount.saving + " availble ");
					continueOrExit1();
				}

			} else if (input6.equalsIgnoreCase("TFSA")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer2 = sc1.nextDouble();
				if (personAccount.TFSA > transfer2) {
					personAccount.checking += transfer2;
					personAccount.TFSA -= transfer2;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your saving account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.TFSA < transfer2) {
					System.out.println("your TFSA account has only " + personAccount.TFSA + "availble ");
					continueOrExit1();
				}

			} else if (input6.equalsIgnoreCase("visa ")) {
				System.out.println("There are some charges if you do cash trnasfer from your visa card ");
				// continue function call
				System.out.println("Please enter the amount of money you  want to transfer");

				double transfer3 = sc1.nextDouble();
				if (personAccount.visa > transfer3) {
					personAccount.checking += transfer3;
					personAccount.visa -= transfer3;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your saving account is " + personAccount.visa);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.visa < transfer3) {
					System.out.println("your TFSA account has only " + personAccount.visa + "availble ");
					continueOrExit1();
				}
			}

		}
//transfer in saving account 
		else if (input5.equalsIgnoreCase("saving")) {
			System.out.println("Please enter the account name from which you want to transfer the money");
			String input6 = sc1.next();
			if (input6.equalsIgnoreCase("checking")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.saving > transfer1) {
					personAccount.checking += transfer1;
					personAccount.saving -= transfer1;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your saving account is " + personAccount.saving);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.saving < transfer1) {
					System.out.println("your saving account has only " + personAccount.saving + " availble ");
					continueOrExit1();
				}

			} else if (input6.equalsIgnoreCase("TFSA")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer2 = sc1.nextDouble();
				if (personAccount.TFSA > transfer2) {
					personAccount.saving += transfer2;
					personAccount.TFSA -= transfer2;
					System.out.println("money in your saving account is " + personAccount.saving);
					System.out.println("money in your TFSA account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.TFSA < transfer2) {
					System.out.println("your TFSA account has only " + personAccount.TFSA + "availble ");
					continueOrExit1();
				}
			} else if (input6.equalsIgnoreCase("Visa")) {
				System.out.println("There are some charges if you do cash trnasfer from your visa card ");
				// continue function call
				System.out.println("Please enter the amount of money you  want to transfer");
				double t6 = sc1.nextDouble();
				if (personAccount.TFSA > t6) {
					personAccount.visa -= t6;
					personAccount.saving += t6;

					System.out.println("money in your Visa card is " + personAccount.visa);
					System.out.println("money in your saving account is " + personAccount.saving);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.TFSA < t6) {
					System.out.println("your TFSA account has only " + personAccount.TFSA + "availble ");
					continueOrExit1();
				}
			}
		}
		// transfer in visa card
		else if (input5.equalsIgnoreCase("visa")) {
			System.out.println("Please enter the account name from which you want to transfer the money");
			String input6 = sc1.next();
			if (input6.equalsIgnoreCase("checking")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.saving > transfer1) {
					personAccount.checking -= transfer1;
					personAccount.visa += transfer1;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your saving account is " + personAccount.visa);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.checking < transfer1) {
					System.out.println("your checking account has only " + personAccount.checking + " availble ");
					continueOrExit1();
				}

			} else if (input6.equalsIgnoreCase("TFSA")) {
				System.out.println("There are some charges if you do transfer from your TFSA account to visa card ");
				// continue function call
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer2 = sc1.nextDouble();
				if (personAccount.TFSA > transfer2) {
					personAccount.visa += transfer2;
					personAccount.TFSA -= transfer2;
					System.out.println("money in your visa account is " + personAccount.visa);
					System.out.println("money in your TFSA account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.TFSA < transfer2) {
					System.out.println("your TFSA account has only " + personAccount.TFSA + "availble ");
					continueOrExit1();
				}
			} else if (input6.equalsIgnoreCase("saving")) {
				System.out.println("There are some charges if you do transfer from your saving account to visa card ");
				// continue function call
				System.out.println("Please enter the amount of money you  want to transfer");
				double t6 = sc1.nextDouble();
				if (personAccount.saving > t6) {
					personAccount.visa += t6;
					personAccount.saving -= t6;

					System.out.println("money in your Visa card is " + personAccount.visa);
					System.out.println("money in your saving account is " + personAccount.saving);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.TFSA < t6) {
					System.out.println("your saving account has only " + personAccount.saving + "availble ");
					continueOrExit1();
				}
			}

		}
		// when transfer to TFSA account
		// ifelse{}

		else if (input5.equalsIgnoreCase("TFSA")) {
			System.out.println("Please enter the account name from which you want to transfer the money");
			String input6 = sc1.next();
			if (input6.equalsIgnoreCase("checking")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.TFSA > transfer1) {
					personAccount.checking -= transfer1;
					personAccount.TFSA += transfer1;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your saving account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.checking < transfer1) {
					System.out.println("your checking account has only " + personAccount.checking + " availble ");
					continueOrExit1();
				}

			} else if (input6.equalsIgnoreCase("saving")) {
				System.out.println("There are some charges if you do transfer from your TFSA account to visa card ");
				// continue function call
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer2 = sc1.nextDouble();
				if (personAccount.saving > transfer2) {
					personAccount.saving -= transfer2;
					personAccount.TFSA += transfer2;
					System.out.println("money in your Saving account is " + personAccount.saving);
					System.out.println("money in your TFSA account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.saving < transfer2) {
					System.out.println("your saving account has only " + personAccount.saving + "availble ");
					continueOrExit1();
				}
			} else if (input6.equalsIgnoreCase("visa")) {
				System.out.println("There are some charges if you do transfer from your saving account to visa card ");
				// continue function call
				System.out.println("Please enter the amount of money you  want to transfer");
				double t6 = sc1.nextDouble();
				if (personAccount.visa > t6) {
					personAccount.visa -= t6;
					personAccount.TFSA += t6;

					System.out.println("money in your Visa card is " + personAccount.visa);
					System.out.println("money in your TFSA account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.visa < t6) {
					System.out.println("your saving account has only " + personAccount.visa + "availble ");
					continueOrExit1();
				}
			}

		}
	}

	@Override
	public void Invsetment() {

		// TODO Auto-generated method stub

		System.out.println("Please enter the account name in which you want to transfer the money");
		String T1 = sc1.next();
		if (T1.equalsIgnoreCase("TFSA")) {
			System.out.println("Please enter the account name from which you want to transfer the money");
			String T2 = sc1.next();
			if (T2.equalsIgnoreCase("checking")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.checking > transfer1) {
					personAccount.checking -= transfer1;
					personAccount.TFSA += transfer1;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your TFSA account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.checking < transfer1) {
					System.out.println("your saving account has only " + personAccount.checking + " availble ");
					continueOrExit1();
				}

			}
			if (T2.equalsIgnoreCase("saving")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.saving > transfer1) {
					personAccount.saving -= transfer1;
					personAccount.TFSA += transfer1;
					System.out.println("money in your saving account is " + personAccount.saving);
					System.out.println("money in your TFSA account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.saving < transfer1) {
					System.out.println("your saving account has only " + personAccount.saving + " availble ");
					continueOrExit1();
				}

			}
			if (T2.equalsIgnoreCase("Visa")) {
				System.out.println("You Cannot direcly tranfer your money from visa to your TFSA account");
				continueOrExit1();
			}
		} else if (T1.equalsIgnoreCase("RRSP")) {
			System.out.println("Please enter the account name from which you want to transfer the money");
			String T2 = sc1.next();
			if (T2.equalsIgnoreCase("checking")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.RRSP > transfer1) {
					personAccount.checking -= transfer1;
					personAccount.RRSP += transfer1;
					System.out.println("money in your checking account is " + personAccount.checking);
					System.out.println("money in your RRSP account is " + personAccount.TFSA);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.checking < transfer1) {
					System.out.println("your saving account has only " + personAccount.checking + " availble ");
					continueOrExit1();
				}

			}
			if (T2.equalsIgnoreCase("saving")) {
				System.out.println("Please enter the amount of money you  want to transfer");
				double transfer1 = sc1.nextDouble();
				if (personAccount.saving > transfer1) {
					personAccount.saving -= transfer1;
					personAccount.RRSP += transfer1;
					System.out.println("money in your saving account is " + personAccount.saving);
					System.out.println("money in your TFSA account is " + personAccount.RRSP);
					System.out.println(" total money in your  account is " + personAccount.totalFunds);
					continueOrExit1();
				} else if (personAccount.saving < transfer1) {
					System.out.println("your saving account has only " + personAccount.saving + " availble ");
					continueOrExit1();
				}

			}
			if (T2.equalsIgnoreCase("Visa")) {
				System.out.println("You Cannot direcly tranfer your money from visa to your RRSP account");
				continueOrExit1();
			}
		}

	}

	public void userProfilePage() {

		System.out.println("Name of Account holder " + p.CustomerName + "\n" + "Account Number of Person "
				+ p.AccountNumber + "\n" + " Checking Account " + personAccount.checking + "\n" + "Saving Account " + personAccount.saving
				+ "\n" + "TFSA Account " + personAccount.TFSA + "\n" + "RRSP Account" + personAccount.RRSP + "\n" + "Total Account balance"
				+ personAccount.totalFunds);

	}

	@Override
	public void exit() {

		// TODO Auto-generated method stub
		System.out.println("Welcome to Scotia local bank branch");

	}

	@Override
	void userIdentification() {
		// TODO Auto-generated method stub
		if (p.getPassword().trim().equalsIgnoreCase("preet") && (p.emailId.equalsIgnoreCase("abc@gmail.com"))) {

			getHomePage(p);
			// System.out.println(p.CustomerName);
		}

	}

}
