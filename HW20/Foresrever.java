/*
Clara Mohri
APCS1 Pd8
HW20 -- For the Lulz Love of Strings
2017-10-20
*/

public class Foresrever{
    
    //this method uses a for loop to build a fence
    public static String fenceF(int posts){
	String fence=  "|" ;
	//x is initialized as 1, and increases by 1 every time until it is no longer less than posts
	for (int x = 1; x < posts; x+=1){
	    fence += "--|";
	}
	return fence;
    }

    //this method uses a for loop to construct the reverse of string s
    public static String reverseF(String s){
	String reversed = "";
	int length = s.length();
	String chr = s.substring(0, 1);
	//x is initialized as the length, and while it is greater than 0, this index of the string is added to string reversed. Every time, x decreases by 1.
	for (int x = length; x> 0; x-= 1){
	    reversed += s.substring(x-1, x);
	}
	return reversed;
    }

    //this method uses recursion to construct the reverse of string s
    public static String reverseR(String s){
	int length = s.length();
	//the base case that if the length is 1, s is returned . 
	//works too if the BE is (length == 0)
	if (length == 1){
	    return s;
	}
	//recursive case:
	else {
	    //last character is identified
	    String lastChr = s.substring(length-1, length);
	    //the portion of the string that does not include the lastChr is identified
	    String remaining = s.substring(0, length-1);
	    //lastChr placed at front, and reverseR is called for the remaining portion of the string
	    return lastChr + reverseR(remaining);
	}
    }
		     
    	
    public static void main (String[] args){
	System.out.println("Testing fenceF\n");
	System.out.println("fenceF(3):");
	System.out.println(fenceF(3));
	System.out.println("\nfenceF(1):");
	System.out.println(fenceF(1));
	System.out.println("\n====================\n");
	System.out.println("Testing reverseF\n");
	System.out.println("reverseF('hello'):\n");
	System.out.println(reverseF("hello"));
	System.out.println("\nreverseF('Does this work?'):");
	System.out.println(reverseF("Does this work?"));
	System.out.println("\n====================\n");
        System.out.println("Testing reverseR\n");
        System.out.println("reverseR('hello'):");
        System.out.println(reverseR("hello"));
        System.out.println("\nreverseR('Does this work?'):");
        System.out.println(reverseR("Does this work?"));

    }
}