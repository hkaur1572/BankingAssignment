package bankingProcess;

import java.util.Scanner;

public class MainProcess {

	public static void main(String[] args) {
		int count = 3;
		int attempt = 3;

		// TODO Auto-generated method stub
		personAccount person = new personAccount( "ABC123" , "Harpreet" ,3000, 4000, 2000);
		
		ATM atm = new ATM();
		OnlineBanking online = new OnlineBanking();

		Scanner obj = new Scanner(System.in);
	
		System.out.println(" Enter the sevice name you want to go with ATM or OnlineBanking");
		String input = obj.next();

		if (input.equalsIgnoreCase("ATM")) {
			// System.out.println(" ATM");
			System.out.println("Enter your pin");
			int pin = obj.nextInt();
			if (person.getPin() == pin) {
				atm.getUserHomePage();

				String input1 = obj.next();

				if (input1.trim().equalsIgnoreCase("Withdraw")) {
					atm.withdraw();
				} else if (input1.trim().equalsIgnoreCase("deposit")) {
					atm.deposit();
				} else if (input1.trim().equalsIgnoreCase("checkbalance")) {
					atm.getbalance();

					// atm.withdraw();

				} else if (input1.trim().equalsIgnoreCase("exit")) {
				//	System.out.println("Welcome");
					atm.exit();
				}

			}
//	atm.deposit();

			while (!(person.getPin() == pin) && attempt != 0) {
				System.out.println("Invalid PIN entered!. " + --attempt + " attempts remaining.");
				count--;
				if (attempt != 0) {
					System.out.println("Enter your pin");
					int pin1 = obj.nextInt();
					if (person.getPin() == pin1) {
						atm.getUserHomePage();

						break;
					}

				} else {

					System.out.println("Your account is locked ");
				}

			}

		}

		else if (input.trim().equalsIgnoreCase("OnlineBanking")) {
			System.out.println("Plaese enter you password ");
			String pass = obj.next();
			if (person.getPassword().trim().equalsIgnoreCase(pass)) {
				online.userIdentification();
				online.continueOrExit1();
			//	online.onlineUserHome();
				String input7 = obj.next();
				if (input7.equalsIgnoreCase("transfer")) {
					online.fundTransfer();

				} else if (input7.equalsIgnoreCase("investment")) {
					online.Invsetment();
				}
				else if (input7.equalsIgnoreCase("exitE")) {
					online.exit();
				}

			}

			while (!(person.getPassword().trim().equalsIgnoreCase(pass)) && attempt != 0) {
				System.out.println("Invalid Password entered!. " + --attempt + " attempts remaining.");
				count--;
				if (attempt != 0) {
					System.out.println("Enter your Password");
					String pass1 = obj.next();
					if (person.getPassword().trim().equalsIgnoreCase(pass1)) {
						online.onlineUserHome();

						break;
					}

				} else {
try {
					System.out.println("Your account is locked ");
				}

finally {
					System.out.println("Your account is locked plase take out card ");
				}
}

			}

		}
	}
}
