/*
Team Duck
Clara Mohri, Aaron Li, Calvin Aw
APCS1 Pd08
HW11 --  Breaking the Bank
2017-10-05
*/

public class Teller 
{
    public static void main (String [] args){
	BankAccount telling = new BankAccount();
	//name should be "Telling" 
	telling.setName("Telling"); 
	//passwd should be "abc123" 
	telling.setPasswd("abc123");
	//pin should be 5595
	telling.setPin(5595);
	//pin should be 9999
	telling.setPin(3);
	//pin should be 9999
	telling.setPin(99990099);
	//acctNum should be 208765289
	telling.setAcctNum(208765289);
	//acctNum should be 999999999
	telling.setAcctNum(1);
	//balance should be 10000
	telling.setBalance(10000);
	//balance should be 10050
	telling.deposit(50);
	//balance should be 10000
	telling.withdraw(50);
	//balance should remain 100000
	telling.withdraw(10001);
	System.out.println(telling);
    }
}

