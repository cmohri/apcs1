/*
Clara Mohri
APCS1 Pd8
HW#55 -- Never Fear, Big Oh Is Here!
2017-12-14
*/

/******************
 * class MySorts contains the implementations of 3 sorts
 *****************/


import java.util.ArrayList;
public class MySorts{

    // VOID version of InsertionSort                                             
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order           

    /**************************
     * Execution time categorization: quadratic, O(n^2)

     * Best case execution time: linear, O(n)
        * When all the terms are already sorted, then every term stays in place, but is looked at
     * Worst case execution time: quadratic, O(n^2)
        * When the terms are in reverse  order, then every term must be "walked" all the way across the datset. 
     *************************/

    public static void insertionSortV( ArrayList<Comparable> data )
    {

	//n-1 passes are required                                                   
	for (int passCtr = 1; passCtr < data.size(); passCtr ++){
	    //      System.out.println( "commencing pass #" + passCtr + "...");             
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


    /************************** 
     *Execution time categorization: quadratic, O(n^2)

     *Best case execution time: quadratic, O(n^2)
       *Even when the data is in order, then the data is swapped with itself. There is no best case
     *Worst case exeuction time: quadratic, O(n^2)
       *Just like there is not best case for selection sort, there is no worst case either
     *************************/

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

    /************************** 
     *Exeuction time categorization: quadratic, O(n^2)

     *Best case exeuction time: quadratic, O(n^2)
       *Because every item must be compared, then the best and worse case exeuction times are the same. (n-1)*n comparisons are made
     *Worst case execution time: quadratic, O(n^2)
     *************************/
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
    }//end bubbleSortV



}