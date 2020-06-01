/*
Clara Mohri
APCS1 Pd8
HW#51 -- Selection
2017-12-11
*/

/***************************************
 * class SelectionSort -- implements SelectionSort algorithm
 ***************************************/

import java.util.ArrayList;

public class SelectionSort 
{
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
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    
    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	//makes n-1 passes across collection
	for (int passCtr = 1; passCtr < data.size(); passCtr ++ ){
	    
	    //System.out.println( "commencing pass #" + passCtr + "..." );
	    
	    //uses reigning champ method to find the smallest Comparable
	    int minInd = passCtr - 1;
	    for (int i = passCtr - 1; i < data.size(); i++){
		if (data.get(minInd).compareTo(data.get(i)) > 0)
		    minInd = i;
	    }
	    
	    //swaps smallest with passCtr - 1 index
	    Comparable smallest = data.get(minInd);
	    Comparable swapW = data.get(passCtr - 1);
	    data.set(passCtr - 1, smallest);
	    data.set(minInd, swapW);
	    
	    //System.out.println("min value in this pass: " + data.get(minInd));
	    //    System.out.println(data);
	}
    }//end selectionSortV
    
    
    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable>	selectionSort( ArrayList<Comparable> input ) 
    {
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	for ( Comparable c : input )
	    foo.add(c);
	selectionSortV(foo);
	return foo;
    }//end selectionSort 
    
    
    public static void main( String [] args ) 
    {
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	selectionSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	
	
	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	selectionSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );

	

	glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = selectionSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	
	coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = selectionSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	

	
    }//end main
    
}//end class SelectionSort
