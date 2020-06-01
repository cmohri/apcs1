/*
Clara Mohri
APCS1- pd08
HW25 -- Al Hallow's Eve
2017-11-01
*/



import java.util.Random;
import java.util.Arrays;

public class Loopier {

   public static void main(String[] args){
	Random r = new Random();
	//System.out.println(r.nextInt(10));
	int[] anArray = {1, 4, 5};
	System.out.println("anArray: ");
	System.out.println(strArray(anArray));
	


	System.out.println("randGenA(anArray);");
	randGenA(anArray);
	System.out.println("anArray: ");	
	System.out.println(strArray(anArray));

	System.out.println("\nrandGenA(anArray);");
        System.out.println("anArray: ");
	randGenA(anArray);
	System.out.println(strArray(anArray));

	System.out.println("\nrandGenA(anArray);");
        System.out.println("anArray: ");
        randGenA(anArray);
        System.out.println(strArray(anArray));

	System.out.println("\n===========================\n");

	int[] secA={1, 2, 3, 4, 6, 4, 4, 4, 0};
	System.out.println("int[] secA={1, 2, 3, 4, 6, 4, 4, 4, 0};");
	System.out.println("\nlinSearch(secA, 4): ");
	System.out.println(linSearch(secA, 4));
	System.out.println("linSearch(secA, 10): ");
	System.out.println(linSearch(secA, 10));

	System.out.println("\nfreq(secA,4): ");
        System.out.println(freq(secA,4));			
	System.out.println("freq(secA,10): ");
	System.out.println(freq(secA,10));

	System.out.println("\nfreqR(secA,4): ");
        System.out.println(freqR(secA,4));
        System.out.println("freqR(secA,10): ");
	System.out.println(freqR(secA,10));

    }

    /*======================================
    void randGen(int[] a)--
    pre: a.length> 0
    post: the ints in the list are replaced by other, random ints  
    ====================================*/
    public static void randGenA(int[] a){
	Random r = new Random();
	for (int x=0; x< a.length; x+=1){
	    a[x] = r.nextInt(10);
	}
    }

    /*====================================
    String strArray(int[] )--
    pre: a.length > 0
    post: a string with the ints in the string is returned
    ===================================*/
    public static String strArray(int[] a){
	String retStr = "{";
	for (int x= 0; x < a.length; x+=1){
	    retStr += a[x];
	    if (x != a.length-1){
		retStr += ", ";
	    }
	}
	retStr += "}";
    return retStr;
    }

    /*==================================
    int linSearch(int[], int)-- 
    returns the index of target in a, or -1 if target is not found in a.
    Iterative method
    =================================*/
    public static int linSearch(int[] a, int target){
	int ctr = 0;
	while (ctr < a.length){
	    if (a[ctr] == target){
		return ctr;
	    }
	    ctr += 1;
	}
	return -1;
    }

    /*================================== 
    int linSearchR(int[], int) --
    returns the index of int target in a using a recursive algorithm.
    If target is not found, then -1 is returned.
    ===================================*/    
    public static int linSearchR(int[] a, int target){

	//if the list is empty then target has not been found
	if (a.length == 0){ 
	    return -1;
	}
	if (a[0] == target){
	    return 0;
	}
      	else{
	    
	    if (linSearchR(Arrays.copyOfRange(a, 1, a.length), target) == -1){
		return -1;
	    }
	    else {
		return linSearchR(Arrays.copyOfRange(a, 1, a.length), target) + 1;}
	
	}
    }

    /*==================================                                              
      int freq(int[], int) -- 
      returns the frequency of target in array using iterative algo
     ====================================*/
    public static int freq(int[] a, int target){

	int freq = 0;

	for (int x : a){
	    if (x == target){
		freq +=1;
	    }
	}

	return freq;
    }
    
    /*=================================
      int freqR(int[], int) --
      returns the frequency of target in array using recursive algo
      =================================*/

    public static int freqR(int[] a, int target){

	if (a.length ==0){
            return 0;
	}
	if (a[0] == target){
	    return freqR(Arrays.copyOfRange(a, 1, a.length), target) + 1;
	}
	else{
	    return freqR(Arrays.copyOfRange(a, 1, a.length), target);
	}
    }

}
