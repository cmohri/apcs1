/*
Team Red
Clara Mohri, Kendrick Liang
APCS1 Pd8
HW#53 -- Solid Comparative Analysis
2017-12-13
*/

import java.util.ArrayList;

public class SortTester{

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

    public static void main (String[] args){

	/**bubblSortV worst and best case scenarios**/

	//worst case scenario 
	//if the array is in reverse order (descending order)
	ArrayList<Comparable> coco = new ArrayList<Comparable>();
	coco.add(10);
	coco.add(9);
	coco.add(8);
	coco.add(7);
	coco.add(6);
	System.out.println("The worst case scenario for bubbleSort is when the array in reverse order:");
	System.out.println("coco:\n" + coco);
	MySorts.bubbleSortV( coco);
	System.out.println("coco, after being bubble-sorted:\n" + coco);
	//best case scenario
	//if the array is already sorted
	ArrayList<Comparable> bestcase1 = new ArrayList<Comparable>();
	bestcase1.add(1);
        bestcase1.add(2);
        bestcase1.add(3);
	bestcase1.add(4);
	bestcase1.add(5);
	System.out.println("Best case scenario for bubbleSort is when the array is in order :\n"+ "bestcase1:\n" + bestcase1);
	MySorts.bubbleSortV(bestcase1);
	System.out.println("bestcase1, after being bubblesorted:\n" +bestcase1  + "\n");

	/**selectionSortV worst and best case scenarios**/
	//worst case scenario 
	//there is no worst case scenario, because at every step every item is swapped, even if it is just with itself
	ArrayList<Comparable> toto = new ArrayList<Comparable>();
	toto.add(5);
	toto.add(4);
	toto.add(3);
	toto.add(2);
	toto.add(1);
	System.out.println("There is no worst case scenario for selectionSort.\n" + "toto:\n" + toto);
	MySorts.selectionSortV(toto);
	System.out.println("toto, after being selection-sorted:\n" + toto);	
	//best case scenario
	//as there is no worst case scenario, there is no best case scenario either.
	ArrayList<Comparable> bestcase2 = new ArrayList<Comparable>();
	bestcase2.add(6);
	bestcase2.add(7);
	bestcase2.add(8);
	bestcase2.add(9);
	bestcase2.add(10);
	System.out.println("There is no best case scenario for selectionSort.\n" + "bestcase2:\n" + bestcase2);
	MySorts.selectionSortV(bestcase2);
	System.out.println("betscase2, after being selection-sorted:\n" + bestcase2 + "\n");

	/**insertionSortV worst and best case scenarios**/
	//worst case scenario 
	//if the array is in reverse order (descending order)
	ArrayList<Comparable> lolo = new ArrayList<Comparable>();
	lolo.add(20);
	lolo.add(19);
	lolo.add(18);
	lolo.add(17);
	lolo.add(16);
	System.out.println("Worst case scenario for insertionSort is if the array is in reverse order.\n" + "lolo:"); 
	System.out.println(lolo);
	MySorts.insertionSortV(lolo);
	System.out.println("lolo, after being insertion-sorted:");
	System.out.println(lolo);
	
	//best case scenario
	//if the array is already sorted
	ArrayList<Comparable> bestcase3 = new ArrayList<Comparable>();
	bestcase3.add(11);
        bestcase3.add(12);
        bestcase3.add(13);
	bestcase3.add(14);
	bestcase3.add(15);
	System.out.println("Best case scenario for insertionSort is if the array is already in order.\n" + "bestcase3:");
	System.out.println(bestcase3);
	MySorts.insertionSortV(bestcase3);
	System.out.println("bestcase3, after being insertion-sorted:");
	System.out.println(bestcase3);
	

    }
}