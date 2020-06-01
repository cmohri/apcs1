/*
Clara Mohri
APCS1 Pd8
HW05:  Leave a Lasting Impression   
2017-09-20
*/

//the class BigSib is called by Greet
public class BigSib{
    //void is replaced with "String" in the method signature.
    //this is because the return type is a string, not void
    public static String greet(String name){
	//instead of having System.out.print() , "return" is used 
	//this is because Greet uses the output from this method
	return ("Why hello there, " + name + ". How do you do?");
    }
}