/*
Clara Mohri
APCS1 Pd8
HW17 -- Do I repeat myself? 
2017-10-16
*/

public class Repeater
{
    public static void main(String[] args){
	System.out.println("fenceW() tests:");
	System.out.println("fenceW(3):");
	System.out.println(fenceW(3));
	System.out.println("fenceW(2):");
	System.out.println(fenceW(2));
	System.out.println("fenceW(1):");
	System.out.println(fenceW(1));
	System.out.println("fenceW(0):");
	System.out.println(fenceW(0));
	System.out.println("fenceW(-1):");
	System.out.println(fenceW(-1));
	System.out.println("=========================");
	System.out.println("fenceR() tests:");
	System.out.println("fenceR(3):");
	System.out.println(fenceR(3));
	System.out.println("fenceR(2):");
	System.out.println(fenceR(2));
	System.out.println("fenceR(1):");
	System.out.println(fenceR(1));
	System.out.println("fenceR(0):");
	System.out.println(fenceR(0));
	System.out.println("fenceR(-1):");
	System.out.println(fenceR(-1));
}
    
    //this method uses a while loop to build the fence
    public static  String fenceW(int numPosts){
	String fence = "|"; //this is the base case
	//in order to have more robust code, there is a case for 0 and negative integers
	if (numPosts <= 0){ 
	    fence = ""; 
	}
       int ctr = 1; 
       while (ctr < numPosts){
	   fence += "--|"; //this sequence is added on every time for a new post
	   ctr += 1;
	}
       return fence; //fence is returned
    }

    //this method uses recursion to build the fence
    public static String fenceR(int numPosts){
	String fence;
	//robust code accounts for 0 and negative integers
	if (numPosts <= 0){
	    fence = "";
	    return fence;
	}
	//the base case for numPosts is "|"
	if (numPosts == 1){
	    fence =  "|";
	    return fence;
	}
	//recursive step
	else {
	    fence = fenceR(numPosts - 1) + "--|"; 
	    return fence;
	}

	
    }
}