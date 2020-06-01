// Team Successful Ducks (Aaron, Clara, Calvin)
// APCS1 pd08
// HW10 -- Mo Money Mo Problems
// 2017-10-03

public class BankAccount
{
    //instance variables
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;


    //mutators
    public String setName( String newName ) {
	String oldName = name;
	name = newName;
	return oldName;
    }

    public String setPasswd( String newPasswd ){
	String oldPasswd = passwd;
	passwd = newPasswd;
	return oldPasswd;
    }

    public int setPin( int newPin ) {
	if (newPin >= 1000 && newPin <= 9998) {
	    int oldPin = pin;
	    pin = newPin;
	    return oldPin;
	}
	else {
	    pin = 9999;
	    System.out.println("* Pin change unsuccessful. Pin has been set to 9999. \n");
	}
	return pin;
    }

    public int setAcctNum( int newAcctNum ) {
	if (newAcctNum >= 100000000 && newAcctNum <= 999999998){
	    int oldAcctNum = acctNum;
	    acctNum = newAcctNum;
	    return oldAcctNum;
	}
	else {
	    int oldAcctNum = acctNum;
	    acctNum = 999999999;
	    System.out.println("* Invalid Account Number, acctNum set to 999999999 \n");
	    return oldAcctNum;
	}
    }

    public double setBalance( double newBalance ) {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
    }

    public String deposit( double depositAmount ) {
	double oldbalance = depositAmount;
	balance += depositAmount;
	return "* Deposit of " + oldbalance + " made. Your new balance is: \n" + balance + "\n";
    }

    public String withdraw(double withdrawAmount) {
	String output = "";
	double oldbalance = withdrawAmount;
	if (withdrawAmount <= balance) {
	    balance -= withdrawAmount;
	    return "* Withdrawal of " + oldbalance + " made. Your new balance is: \n" + balance + "\n";
	}
	else if (withdrawAmount > balance) {
	    output = "* Withdrawal of " + oldbalance + " unsuccessful. You do not have enough money.\n";
	}
	return output;
    }

    // Authentication code.
    public String authenticate(String namez, String password) {
	String output = "";
	if (name == namez && password == passwd) {
	    output = "* Authentication successful. Input credentials are correct. \n";
	}
	else if (name != namez || password != passwd) {
	    output = "* Authentication unsuccessful. Either one or both inputted credentials are incorrect. Please enter the correct credentials and try again. \n";
	}
	return output;
    }
    
    //overwritten toString()
    public String toString() {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;
    }
   

    //main method for testing
    public static void main( String[] args )
    {
	BankAccount test = new BankAccount();
	test.setName("foo");
	test.setPasswd("abc123");
	test.setPin(99911);
	test.setAcctNum(208765289);
	test.setBalance(300000);
	System.out.println(test.deposit(150000));
	System.out.println(test.withdraw(1412232));
	System.out.println(test.authenticate("haha","1231231"));
	System.out.println(test.toString());
	
    }//end main()

}//end class BankAccount
