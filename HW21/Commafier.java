/*
Clara Mohri
APCS1 Pd 8
HW22 -- Karmacomma
2017-10-23
*/


public class Commafier{
    public static void main(String[] args){
	/*System.out.println(commafyR(1));
	System.out.println(commafyR(10));
	System.out.println(commafyR(101));
	System.out.println(commafyR(1000));
	System.out.println(commafyR(12345));	

	System.out.println(commafyF(12345666));
	System.out.println(commafyF(1));
	System.out.println(commafyF(10));
	System.out.println(commafyF(101));
	System.out.println(commafyF(10000));
	*/

	System.out.println("Testing commafyR");
	for (String s: args){
	    System.out.println("commafyR(" + s + ")");
	    System.out.println(commafyR(Integer.parseInt(s)));
	}
	System.out.println("================");
	System.out.println("Testing commafyF");
	for (String s: args){
	    System.out.println("commafyF(" + s + ")");
	    System.out.println(commafyF(Integer.parseInt(s)));
	}

   }

    //this method adds commas recursively
    public static String commafyR(int s){

	String commafied = ""; 
	//base case
	if (s < 1000){
	    commafied +=  Integer.toString(s);
	}
	else {

	    String last3 = Integer.toString(s%1000);
	    //making sure that the last 3 digits stay 3 digits 
	    while (last3.length() < 3){
		last3 += "0";
	    }
	    //recursive case
	    commafied += commafyR(s/1000) + "," + last3;
	}
	return commafied;
    }


    //this method adds commas with a for loop
    public static String commafyF(int s){
	String commafied = "";
	//a string of int s is created
	String numS = Integer.toString(s);

	//while the length of numS is greater than 3, commas continued to be added
	for (int x = numS.length(); numS.length()> 3; x-=1){

	    //redefining this way instead of +=  allows to add to the beginning of the string
	    commafied ="," +  numS.substring(numS.length()-3, numS.length()) + commafied;
	    //numS is redefined as the part that does not include the last 3 digits
	    numS = numS.substring(0, numS.length() - 3);

	}

	//the commafied version is added to the part that does not have 3 digits at the beginning
	numS += commafied;
	return numS;
    



    }
    


	
}