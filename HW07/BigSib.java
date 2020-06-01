/*
Clara Mohri
APCS1 Pd8
HW07 - On the Origins of a BigSib
2017-09-26
*/

public class BigSib {
    //instance variable created
    private String greeting;

    //the constructor BigSib is called from new BigSib(" " ) in Greet
    public BigSib(String hello){
	greeting = hello;
    }

    //the method greet adds the name to the greeting and is called in Greet
    public String greet(String name){
	greeting += ", ";
	greeting += name;
	greeting += ". ";
	return greeting;
    }
}
