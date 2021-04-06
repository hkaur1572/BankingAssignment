package bankingProcess;

public class personAccount {
 String accountNumber;
 static double totalFunds;
 String customerName= "ABCD";
static double checking;
static double saving;
static  double TFSA;
static double visa=2000;
static double RRSP=0;
private String password="preet";

 public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private int  Pin = 1993;
public int getPin() {
	return Pin;
}
public void setPin(int pin) {
	this.Pin = pin;
}
personAccount(){
	
}
public personAccount(double Account1 , double Account2, double Account3) {
checking=	Account1;
saving=Account2;
TFSA=Account3;
totalFunds	=checking+saving+TFSA;
}

}
