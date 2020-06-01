/*Joan, Eliza, and Kenny -- JEK
  APCS1 pd8
  HW10 -- Building a more meaningful class
  2017-10-03*/

public class BankAccount
{
    //instance variables
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;

    //mutators

    //method setName takes in a String and returns a String
    //precondition: BankAccount's name is what it is originally
    //postcondition: BankAccount's name is the String that setName() took in
    public String setName( String newName )
    {
	String oldName = name;
	name = newName;
	return oldName; //previous name is returned
    }

    //method setPasswd takes in a String and returns a String
    //precondition: BankAccount's passwd is what it is originally
    //postcondition: BankAccount's passwd is the String that setName() took in
    public String setPasswd( String newPasswd )
    {
	String oldPasswd = passwd;
	passwd = newPasswd;
	return oldPasswd; //old passwd is returned
    }

    //method setPasswd takes in an int and returns an int
    //precondition: BankAccount's pin is unchanged
    //postcondition: BankAccount pin has been reset to the argument of setPin()
    public int setPin( int newPin )
    {
	if (newPin >= 1000 && newPin <= 9998) {
	    int oldPin = pin; 
	    pin = newPin;//pin is defined as newPin
	    return oldPin;//returns oldPin
	}
	else {
	    int oldPin = pin;
	    pin = 9999;//pin is redefined as 9999, because the argument was invalid
	    System.out.println("Please enter a valid 4-digit pin!");
	    return oldPin;//returns oldPin
	}
    }

    //method setAcctNum takes in an int and returns an int
    public int setAcctNum( int newAcctNum )
    {
	//if newAcctNum is within desired range: 
	if (newAcctNum > 100000000 && newAcctNum < 999999998) {
	    int oldAcctNum = acctNum;
	    acctNum = newAcctNum; //acctNum is defined as newAcctNum
	    return oldAcctNum; //oldAcctNum is returned
	}
	//if newAcctNum is not within desired range: 
	else {
	    int oldAcctNum = acctNum;
	    acctNum = 999999999;//acctNum set to this value because newAcctNum is invalid
	    System.out.println("Please enter a valid 9-digit account number!");//error message
	    return oldAcctNum;//oldAcctNum is returned
	}
    }

    //method setBalance takes in a double and returns a double 
    //precondition: BankAccount's balance is unchanged
    //postcondition: BankAccount's balance is newBalance
    public double setBalance( double newBalance )
    {
	double oldBalance = balance; 
	balance = newBalance;//balance is defined as newBalance
	return oldBalance;//oldBalance is returned
    }

    //method deposit takes in a double and returns nothing
    //precondition: BankAccount's balance is unchanged
    //postcondition: BankAccount's balance becomes balance + depositAmount
    public void deposit( double depositAmount ) {
	balance = balance + depositAmount;//depositAmount is added to balance
    }

    //method withdraw takes in a double and returns a boolean
    //precondition: balance remains unchanged
    //postconditon: either balance value decreases or stays the same
    public boolean withdraw ( double withdrawAmount ) {
	//if withdrawAmount is greater than the balance
	if (withdrawAmount > balance) {
	    System.out.println("\nYou don't have that much money!");//error message
	    return false;
	}
	//if withdrawAmount is within balance range
	else {
	    balance = balance - withdrawAmount;//balance is redefined as difference between balance and withdrawAmount
	    System.out.println("\nWithdrawal successful");//completion message
	    return true;
	}
    }

    //method authenticate takes in an int and a String, and returns a boolean
    //returns whether both int acctNumVer and String passwdVer match acctNum and passwd, respectively
    public boolean authenticate(int acctNumVer, String passwdVer) {
	return (acctNumVer == acctNum && passwdVer == passwd);
    }


    //overwritten toString()
    //returns String of all information of BankAccount
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
	BankAccount tim = new BankAccount();

	//Testing all the mutators
	tim.setPasswd("hi");
	tim.setName("Tim");
	tim.setPin(1234);
	tim.setAcctNum(123456789);
	tim.setBalance(12.34);
	System.out.println(tim);

	//Should print "True"
	if (tim.authenticate(123456789, "hi")) {
	    System.out.println("\nTrue");
	}
	else {
	    System.out.print("\nFalse");
	}

	//Should print "False"
	if (tim.authenticate(1234455, "Henlo")) {
	    System.out.println("\nTrue");
	}
	else {
	    System.out.println("\nFalse");
	}

	//Testing deposit
	tim.deposit(100);
	System.out.println(tim);
	
	//Testing withdraw cases
	tim.withdraw(12.33);
	System.out.println(tim);
	tim.withdraw(123456789);
	System.out.println(tim);

	//Testing negative account number and pin cases
	tim.setAcctNum(123);
	tim.setPin(12345);
	
    }//end main()

}//end class BankAccount