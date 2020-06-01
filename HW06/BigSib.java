/*
Clara Mohri
APCS1 Pd8
HW06 - On BigSib Individuality and the Elimination of Radio Fuzz
2017-09-26
*/


public class BigSib{
    //instance variable
    private String HelloMsg;
    //the method setHelloMsg defines HelloMsg as NewMsg
    public void setHelloMsg(String NewMsg){
	HelloMsg =  NewMsg;
	HelloMsg += ", ";
    }
    //the method greet adds to HelloMsg the name 
    public String greet(String name){
	HelloMsg += name;
	HelloMsg += ".";
	//this method has a return value so that Greet.java can make use of it
	return HelloMsg;
    }

}