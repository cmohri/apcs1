/*
Clara Mohri
APCS1 Pd8
HW#46 -- AI<B> Sorted!
2017-12-05
*/

//ArrayList is imported
import java.util.ArrayList;

public class ALTester{
    
    //populate method takes in an ArrayList<Integer>, and populates it with 23 ints
    public static  void populate(ArrayList<Comparable> array ){
	for (int i = 0; i < 23; i++){
	    array.add((int) (Math.random() *100));
	}
    }

    //checkOrd method checks if the ArrayList is in ascending order
    //returns true/false
    public static boolean checkOrd(ArrayList<Comparable> array){
	boolean retBool = true;
	for (int i = 0; i < 22; i++){
	    if ((array.get(i).compareTo(array.get(i+1))) >= 0)
		{
		retBool =   false;
		}
	}
	return retBool;
    }
	    
    public static void main (String[] args){

       ArrayList<Comparable> array = new ArrayList<Comparable>(); 

       populate(array);
       System.out.println("Array: ");
       System.out.println(array);
       System.out.println("Size of array: ");
       System.out.println(array.size());
       System.out.print("The area is in ascending order: ");
       System.out.println(checkOrd(array));

    }
}