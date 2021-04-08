package bankingProcess;

public class personAccount {
	String AccountNumber;
	String CustomerName;
	static double totalFunds;

	static double checking;
	static double saving;
	static double TFSA;
	static double visa = 2000;
	static double RRSP = 0;
	private String password = "preet";
	String emailId = "abc@gmail.com";
	private int cardNo = 1111;

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private int Pin = 1993;

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		this.Pin = pin;
	}

	personAccount() {

	}

	public personAccount(String accountNumber, String customerName, double Account1, double Account2, double Account3) {
		AccountNumber = accountNumber;
		CustomerName = customerName;
		checking = Account1;
		saving = Account2;
		TFSA = Account3;

		totalFunds = checking + saving + TFSA;
	//	System.out.println(CustomerName);
	}

}
