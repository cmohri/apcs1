/*
  Clara Mohri
  APCS1 Pd8
  HW#50 -- Dat Bubbly Tho
  2017-12-09
*/

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 ******************************/

import java.util.ArrayList;

public class BubbleSort {
    
    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }
    
    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
	//setup for traversal fr right to left
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data )
    {
	//the amount of passes that is necessary is the amount of items minus 1  
	for (int pass  = data.size() -1; pass >= 1; pass -= 1){
	    
	    for (int ctr = data.size() - 1; ctr >= 1; ctr -= 1){
		Comparable first = data.get(ctr);
		Comparable second = data.get(ctr - 1);
		if (first.compareTo(second) < 0){
		    //swap if out of order:
		    data.set(ctr, second);
		    data.set(ctr - 1, first);
		}
	    }
	}
    }
    
    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
	ArrayList<Comparable> copy  = new ArrayList<Comparable>();
	
	for (int i = 0; i < input.size(); i += 1){
	    copy.add(input.get(i));
	} //if copy is defined as input, then when copy is changed then so is input
	
	//the amount of passes that is necessary is the amount of items minus 1
	for (int pass  = copy.size() -1; pass >= 1; pass -= 1){
	    
	    for (int ctr = copy.size() - 1; ctr >= 1; ctr -= 1){
		Comparable first = copy.get(ctr);
		Comparable second = copy.get(ctr - 1);
		if (first.compareTo(second) < 0){
		    //swap if out of order: 
		    copy.set(ctr, second);
		    copy.set(ctr - 1, first);
		}
	    }
	}
	return copy;
    } 
    
    
    public static void main( String [] args )
    {
	
	
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bubbleSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	
	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	bubbleSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	
	
	glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = bubbleSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	
	coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = bubbleSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );      
	
	
    }//end main
    
}//end class BubbleSort
