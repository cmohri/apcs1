/*
Clara Mohri
APCS1 Pd8
HW#52 -- Poker Face
2017-12-12
*/

/***************************************
 *  class InsertionSort -- implements InsertionSort algorithm
 ***************************************/

import java.util.ArrayList;

public class InsertionSort
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


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {

      //n-1 passes are required    
      for (int passCtr = 1; passCtr < data.size(); passCtr ++){
	  //	  System.out.println( "commencing pass #" + passCtr + "...");

	  //passCtr also signifies where the partition is between sorted/unsorted
	  for (int i = passCtr; i > 0; i--){
	      //swapping into order
	      if (data.get(i).compareTo(data.get(i-1)) < 0){
		  Comparable smaller = data.get(i);
		  Comparable swapper = data.get(i - 1);
		  data.set(i-1, smaller);
		  data.set(i, swapper);
	      }
	  }
      }
  }//end insertionSortV

    
  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
      public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input )
  {
      ArrayList<Comparable> foo = new ArrayList<Comparable>();
      for (Comparable c: input)
	  foo.add(c);
      insertionSortV(foo);
      return foo;
  }//end insertionSort
    

  public static void main( String [] args )
  {

      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      insertionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      insertionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );



      System.out.println( "*** Testing non-void version... *** " );
      glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = insertionSort( glen );
      System.out.println( "\nsorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = insertionSort( coco );
      System.out.println( "\nsorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
      


  }//end main

}//end class InsertionSort
