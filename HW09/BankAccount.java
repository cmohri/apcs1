/*
Team Duck
Clara Mohri, William Lu, Max Millar
APCS1 pd08
HW09 - CMYM
2017-10-03
*/

//the class BankAccount builds a bank account with features that can be modified
public class BankAccount{
    
    //instance variables (BankAccount attributes)
    private String ownerName;
    private String password;
    private int pin;
    private int accNumber;
    private double balance;
    
    //the main function creates a BankAccount called duck, and sets its' attributes
    public static void main(String arg[]){

	BankAccount duck = new BankAccount();
	duck.setOwnerName("spuck");
	duck.setPassword("123qweasdzxc");
	duck.setPin(1234);
	duck.setAccNumber(192837465);
	duck.setBalance(3.14);
	duck.deposit(9.56);
	duck.withdraw(8);
	
	//duck.printAllInfo();
	//test statement above

    }

    //this method allows the user to set the ownerName attribute to a new string
    public void setOwnerName(String newName){
        ownerName = newName;
    }
    
    //this method allows the user to set the password to a new string
    public void setPassword(String newPassword){
        password = newPassword;
    }
    
    //this method allows the user to set the pin to a new integer
    public void setPin(int newPin){
        pin = newPin;
    }
    
    //this method allows the user to set the accNumber to a new integer
    public void setAccNumber(int newNumber){
        accNumber = newNumber;
    }
    
    //this method allows the user to set the balance to a new double. It is a double because a balance in dollars is a decimal
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    
    //this method prints out all of the information about the BankAccount as a string
    public void printAllInfo(){
        String output = "account holder's name: " + ownerName;
        output += "\npassword: " + password;
        output += "\npin: " + Integer.toString(pin);
	//Integer.toString() is used to make an integer into a string
        output += "\naccount number: " + Integer.toString(accNumber);
	//String.format truncates the double, which otherwise is very long and ends in a 1, and turns it into a string
        output += "\nbalance: $" + String.format("%.2f", balance);
        //output is printed out
	System.out.println(output);
    }

    //this method allows the user to enter a double that will be added to the balance as a deposit. This changes the balance value    
    public void deposit(double value){
        balance += value;
    }
    
    //this method allows the user to enter a double that will be subtracted to the balance as a withdraw from the acount. This changes the balance value
    public void withdraw(double value){
        balance -= value;
    }
    
}
